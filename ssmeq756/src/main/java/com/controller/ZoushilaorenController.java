package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZoushilaorenEntity;
import com.entity.view.ZoushilaorenView;

import com.service.ZoushilaorenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 走失老人
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
@RestController
@RequestMapping("/zoushilaoren")
public class ZoushilaorenController {
    @Autowired
    private ZoushilaorenService zoushilaorenService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZoushilaorenEntity zoushilaoren, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashu")) {
			zoushilaoren.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZoushilaorenEntity> ew = new EntityWrapper<ZoushilaorenEntity>();
		PageUtils page = zoushilaorenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zoushilaoren), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZoushilaorenEntity zoushilaoren, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashu")) {
			zoushilaoren.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZoushilaorenEntity> ew = new EntityWrapper<ZoushilaorenEntity>();
		PageUtils page = zoushilaorenService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zoushilaoren), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZoushilaorenEntity zoushilaoren){
       	EntityWrapper<ZoushilaorenEntity> ew = new EntityWrapper<ZoushilaorenEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zoushilaoren, "zoushilaoren")); 
        return R.ok().put("data", zoushilaorenService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZoushilaorenEntity zoushilaoren){
        EntityWrapper< ZoushilaorenEntity> ew = new EntityWrapper< ZoushilaorenEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zoushilaoren, "zoushilaoren")); 
		ZoushilaorenView zoushilaorenView =  zoushilaorenService.selectView(ew);
		return R.ok("查询走失老人成功").put("data", zoushilaorenView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZoushilaorenEntity zoushilaoren = zoushilaorenService.selectById(id);
        return R.ok().put("data", zoushilaoren);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZoushilaorenEntity zoushilaoren = zoushilaorenService.selectById(id);
        return R.ok().put("data", zoushilaoren);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZoushilaorenEntity zoushilaoren, HttpServletRequest request){
    	zoushilaoren.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zoushilaoren);

        zoushilaorenService.insert(zoushilaoren);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZoushilaorenEntity zoushilaoren, HttpServletRequest request){
    	zoushilaoren.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zoushilaoren);
    	zoushilaoren.setUserid((Long)request.getSession().getAttribute("userId"));

        zoushilaorenService.insert(zoushilaoren);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZoushilaorenEntity zoushilaoren, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zoushilaoren);
        zoushilaorenService.updateById(zoushilaoren);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zoushilaorenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZoushilaorenEntity> wrapper = new EntityWrapper<ZoushilaorenEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = zoushilaorenService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

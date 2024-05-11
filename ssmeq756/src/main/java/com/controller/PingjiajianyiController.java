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

import com.entity.PingjiajianyiEntity;
import com.entity.view.PingjiajianyiView;

import com.service.PingjiajianyiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 评价建议
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
@RestController
@RequestMapping("/pingjiajianyi")
public class PingjiajianyiController {
    @Autowired
    private PingjiajianyiService pingjiajianyiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PingjiajianyiEntity pingjiajianyi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("gonganbumen")) {
			pingjiajianyi.setBumenzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiashu")) {
			pingjiajianyi.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PingjiajianyiEntity> ew = new EntityWrapper<PingjiajianyiEntity>();
		PageUtils page = pingjiajianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pingjiajianyi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PingjiajianyiEntity pingjiajianyi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("gonganbumen")) {
			pingjiajianyi.setBumenzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiashu")) {
			pingjiajianyi.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PingjiajianyiEntity> ew = new EntityWrapper<PingjiajianyiEntity>();
		PageUtils page = pingjiajianyiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, pingjiajianyi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PingjiajianyiEntity pingjiajianyi){
       	EntityWrapper<PingjiajianyiEntity> ew = new EntityWrapper<PingjiajianyiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( pingjiajianyi, "pingjiajianyi")); 
        return R.ok().put("data", pingjiajianyiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PingjiajianyiEntity pingjiajianyi){
        EntityWrapper< PingjiajianyiEntity> ew = new EntityWrapper< PingjiajianyiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( pingjiajianyi, "pingjiajianyi")); 
		PingjiajianyiView pingjiajianyiView =  pingjiajianyiService.selectView(ew);
		return R.ok("查询评价建议成功").put("data", pingjiajianyiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PingjiajianyiEntity pingjiajianyi = pingjiajianyiService.selectById(id);
        return R.ok().put("data", pingjiajianyi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PingjiajianyiEntity pingjiajianyi = pingjiajianyiService.selectById(id);
        return R.ok().put("data", pingjiajianyi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PingjiajianyiEntity pingjiajianyi, HttpServletRequest request){
    	pingjiajianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pingjiajianyi);

        pingjiajianyiService.insert(pingjiajianyi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PingjiajianyiEntity pingjiajianyi, HttpServletRequest request){
    	pingjiajianyi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(pingjiajianyi);
    	pingjiajianyi.setUserid((Long)request.getSession().getAttribute("userId"));

        pingjiajianyiService.insert(pingjiajianyi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PingjiajianyiEntity pingjiajianyi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(pingjiajianyi);
        pingjiajianyiService.updateById(pingjiajianyi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        pingjiajianyiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<PingjiajianyiEntity> wrapper = new EntityWrapper<PingjiajianyiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("gonganbumen")) {
			wrapper.eq("bumenzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("jiashu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = pingjiajianyiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

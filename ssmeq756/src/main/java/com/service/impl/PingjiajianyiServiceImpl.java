package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PingjiajianyiDao;
import com.entity.PingjiajianyiEntity;
import com.service.PingjiajianyiService;
import com.entity.vo.PingjiajianyiVO;
import com.entity.view.PingjiajianyiView;

@Service("pingjiajianyiService")
public class PingjiajianyiServiceImpl extends ServiceImpl<PingjiajianyiDao, PingjiajianyiEntity> implements PingjiajianyiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingjiajianyiEntity> page = this.selectPage(
                new Query<PingjiajianyiEntity>(params).getPage(),
                new EntityWrapper<PingjiajianyiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingjiajianyiEntity> wrapper) {
		  Page<PingjiajianyiView> page =new Query<PingjiajianyiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PingjiajianyiVO> selectListVO(Wrapper<PingjiajianyiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PingjiajianyiVO selectVO(Wrapper<PingjiajianyiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PingjiajianyiView> selectListView(Wrapper<PingjiajianyiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingjiajianyiView selectView(Wrapper<PingjiajianyiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

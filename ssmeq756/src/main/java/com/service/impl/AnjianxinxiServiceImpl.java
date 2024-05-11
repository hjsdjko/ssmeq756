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


import com.dao.AnjianxinxiDao;
import com.entity.AnjianxinxiEntity;
import com.service.AnjianxinxiService;
import com.entity.vo.AnjianxinxiVO;
import com.entity.view.AnjianxinxiView;

@Service("anjianxinxiService")
public class AnjianxinxiServiceImpl extends ServiceImpl<AnjianxinxiDao, AnjianxinxiEntity> implements AnjianxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnjianxinxiEntity> page = this.selectPage(
                new Query<AnjianxinxiEntity>(params).getPage(),
                new EntityWrapper<AnjianxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AnjianxinxiEntity> wrapper) {
		  Page<AnjianxinxiView> page =new Query<AnjianxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AnjianxinxiVO> selectListVO(Wrapper<AnjianxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnjianxinxiVO selectVO(Wrapper<AnjianxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnjianxinxiView> selectListView(Wrapper<AnjianxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnjianxinxiView selectView(Wrapper<AnjianxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

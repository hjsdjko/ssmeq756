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


import com.dao.GonganbumenDao;
import com.entity.GonganbumenEntity;
import com.service.GonganbumenService;
import com.entity.vo.GonganbumenVO;
import com.entity.view.GonganbumenView;

@Service("gonganbumenService")
public class GonganbumenServiceImpl extends ServiceImpl<GonganbumenDao, GonganbumenEntity> implements GonganbumenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonganbumenEntity> page = this.selectPage(
                new Query<GonganbumenEntity>(params).getPage(),
                new EntityWrapper<GonganbumenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonganbumenEntity> wrapper) {
		  Page<GonganbumenView> page =new Query<GonganbumenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonganbumenVO> selectListVO(Wrapper<GonganbumenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonganbumenVO selectVO(Wrapper<GonganbumenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonganbumenView> selectListView(Wrapper<GonganbumenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonganbumenView selectView(Wrapper<GonganbumenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

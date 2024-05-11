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


import com.dao.GonganxiansuoDao;
import com.entity.GonganxiansuoEntity;
import com.service.GonganxiansuoService;
import com.entity.vo.GonganxiansuoVO;
import com.entity.view.GonganxiansuoView;

@Service("gonganxiansuoService")
public class GonganxiansuoServiceImpl extends ServiceImpl<GonganxiansuoDao, GonganxiansuoEntity> implements GonganxiansuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GonganxiansuoEntity> page = this.selectPage(
                new Query<GonganxiansuoEntity>(params).getPage(),
                new EntityWrapper<GonganxiansuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GonganxiansuoEntity> wrapper) {
		  Page<GonganxiansuoView> page =new Query<GonganxiansuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GonganxiansuoVO> selectListVO(Wrapper<GonganxiansuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GonganxiansuoVO selectVO(Wrapper<GonganxiansuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GonganxiansuoView> selectListView(Wrapper<GonganxiansuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GonganxiansuoView selectView(Wrapper<GonganxiansuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

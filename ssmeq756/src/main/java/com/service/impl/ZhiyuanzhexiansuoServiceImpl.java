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


import com.dao.ZhiyuanzhexiansuoDao;
import com.entity.ZhiyuanzhexiansuoEntity;
import com.service.ZhiyuanzhexiansuoService;
import com.entity.vo.ZhiyuanzhexiansuoVO;
import com.entity.view.ZhiyuanzhexiansuoView;

@Service("zhiyuanzhexiansuoService")
public class ZhiyuanzhexiansuoServiceImpl extends ServiceImpl<ZhiyuanzhexiansuoDao, ZhiyuanzhexiansuoEntity> implements ZhiyuanzhexiansuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanzhexiansuoEntity> page = this.selectPage(
                new Query<ZhiyuanzhexiansuoEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanzhexiansuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanzhexiansuoEntity> wrapper) {
		  Page<ZhiyuanzhexiansuoView> page =new Query<ZhiyuanzhexiansuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuanzhexiansuoVO> selectListVO(Wrapper<ZhiyuanzhexiansuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanzhexiansuoVO selectVO(Wrapper<ZhiyuanzhexiansuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanzhexiansuoView> selectListView(Wrapper<ZhiyuanzhexiansuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanzhexiansuoView selectView(Wrapper<ZhiyuanzhexiansuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

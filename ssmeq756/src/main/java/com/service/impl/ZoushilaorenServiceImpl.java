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


import com.dao.ZoushilaorenDao;
import com.entity.ZoushilaorenEntity;
import com.service.ZoushilaorenService;
import com.entity.vo.ZoushilaorenVO;
import com.entity.view.ZoushilaorenView;

@Service("zoushilaorenService")
public class ZoushilaorenServiceImpl extends ServiceImpl<ZoushilaorenDao, ZoushilaorenEntity> implements ZoushilaorenService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZoushilaorenEntity> page = this.selectPage(
                new Query<ZoushilaorenEntity>(params).getPage(),
                new EntityWrapper<ZoushilaorenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZoushilaorenEntity> wrapper) {
		  Page<ZoushilaorenView> page =new Query<ZoushilaorenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZoushilaorenVO> selectListVO(Wrapper<ZoushilaorenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZoushilaorenVO selectVO(Wrapper<ZoushilaorenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZoushilaorenView> selectListView(Wrapper<ZoushilaorenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZoushilaorenView selectView(Wrapper<ZoushilaorenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

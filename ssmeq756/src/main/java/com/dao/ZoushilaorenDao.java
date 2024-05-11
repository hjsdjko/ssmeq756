package com.dao;

import com.entity.ZoushilaorenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZoushilaorenVO;
import com.entity.view.ZoushilaorenView;


/**
 * 走失老人
 * 
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface ZoushilaorenDao extends BaseMapper<ZoushilaorenEntity> {
	
	List<ZoushilaorenVO> selectListVO(@Param("ew") Wrapper<ZoushilaorenEntity> wrapper);
	
	ZoushilaorenVO selectVO(@Param("ew") Wrapper<ZoushilaorenEntity> wrapper);
	
	List<ZoushilaorenView> selectListView(@Param("ew") Wrapper<ZoushilaorenEntity> wrapper);

	List<ZoushilaorenView> selectListView(Pagination page,@Param("ew") Wrapper<ZoushilaorenEntity> wrapper);
	
	ZoushilaorenView selectView(@Param("ew") Wrapper<ZoushilaorenEntity> wrapper);
	

}

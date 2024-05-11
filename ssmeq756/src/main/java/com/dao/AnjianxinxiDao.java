package com.dao;

import com.entity.AnjianxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AnjianxinxiVO;
import com.entity.view.AnjianxinxiView;


/**
 * 案件信息
 * 
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface AnjianxinxiDao extends BaseMapper<AnjianxinxiEntity> {
	
	List<AnjianxinxiVO> selectListVO(@Param("ew") Wrapper<AnjianxinxiEntity> wrapper);
	
	AnjianxinxiVO selectVO(@Param("ew") Wrapper<AnjianxinxiEntity> wrapper);
	
	List<AnjianxinxiView> selectListView(@Param("ew") Wrapper<AnjianxinxiEntity> wrapper);

	List<AnjianxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<AnjianxinxiEntity> wrapper);
	
	AnjianxinxiView selectView(@Param("ew") Wrapper<AnjianxinxiEntity> wrapper);
	

}

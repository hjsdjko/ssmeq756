package com.dao;

import com.entity.PingjiajianyiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PingjiajianyiVO;
import com.entity.view.PingjiajianyiView;


/**
 * 评价建议
 * 
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface PingjiajianyiDao extends BaseMapper<PingjiajianyiEntity> {
	
	List<PingjiajianyiVO> selectListVO(@Param("ew") Wrapper<PingjiajianyiEntity> wrapper);
	
	PingjiajianyiVO selectVO(@Param("ew") Wrapper<PingjiajianyiEntity> wrapper);
	
	List<PingjiajianyiView> selectListView(@Param("ew") Wrapper<PingjiajianyiEntity> wrapper);

	List<PingjiajianyiView> selectListView(Pagination page,@Param("ew") Wrapper<PingjiajianyiEntity> wrapper);
	
	PingjiajianyiView selectView(@Param("ew") Wrapper<PingjiajianyiEntity> wrapper);
	

}

package com.dao;

import com.entity.GonganbumenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonganbumenVO;
import com.entity.view.GonganbumenView;


/**
 * 公安部门
 * 
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface GonganbumenDao extends BaseMapper<GonganbumenEntity> {
	
	List<GonganbumenVO> selectListVO(@Param("ew") Wrapper<GonganbumenEntity> wrapper);
	
	GonganbumenVO selectVO(@Param("ew") Wrapper<GonganbumenEntity> wrapper);
	
	List<GonganbumenView> selectListView(@Param("ew") Wrapper<GonganbumenEntity> wrapper);

	List<GonganbumenView> selectListView(Pagination page,@Param("ew") Wrapper<GonganbumenEntity> wrapper);
	
	GonganbumenView selectView(@Param("ew") Wrapper<GonganbumenEntity> wrapper);
	

}

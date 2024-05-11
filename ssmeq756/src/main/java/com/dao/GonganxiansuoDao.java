package com.dao;

import com.entity.GonganxiansuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GonganxiansuoVO;
import com.entity.view.GonganxiansuoView;


/**
 * 公安线索
 * 
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface GonganxiansuoDao extends BaseMapper<GonganxiansuoEntity> {
	
	List<GonganxiansuoVO> selectListVO(@Param("ew") Wrapper<GonganxiansuoEntity> wrapper);
	
	GonganxiansuoVO selectVO(@Param("ew") Wrapper<GonganxiansuoEntity> wrapper);
	
	List<GonganxiansuoView> selectListView(@Param("ew") Wrapper<GonganxiansuoEntity> wrapper);

	List<GonganxiansuoView> selectListView(Pagination page,@Param("ew") Wrapper<GonganxiansuoEntity> wrapper);
	
	GonganxiansuoView selectView(@Param("ew") Wrapper<GonganxiansuoEntity> wrapper);
	

}

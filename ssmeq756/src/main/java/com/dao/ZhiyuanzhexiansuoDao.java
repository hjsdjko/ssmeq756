package com.dao;

import com.entity.ZhiyuanzhexiansuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanzhexiansuoVO;
import com.entity.view.ZhiyuanzhexiansuoView;


/**
 * 志愿者线索
 * 
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface ZhiyuanzhexiansuoDao extends BaseMapper<ZhiyuanzhexiansuoEntity> {
	
	List<ZhiyuanzhexiansuoVO> selectListVO(@Param("ew") Wrapper<ZhiyuanzhexiansuoEntity> wrapper);
	
	ZhiyuanzhexiansuoVO selectVO(@Param("ew") Wrapper<ZhiyuanzhexiansuoEntity> wrapper);
	
	List<ZhiyuanzhexiansuoView> selectListView(@Param("ew") Wrapper<ZhiyuanzhexiansuoEntity> wrapper);

	List<ZhiyuanzhexiansuoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanzhexiansuoEntity> wrapper);
	
	ZhiyuanzhexiansuoView selectView(@Param("ew") Wrapper<ZhiyuanzhexiansuoEntity> wrapper);
	

}

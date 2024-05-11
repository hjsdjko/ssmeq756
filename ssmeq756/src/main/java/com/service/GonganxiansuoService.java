package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonganxiansuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonganxiansuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonganxiansuoView;


/**
 * 公安线索
 *
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface GonganxiansuoService extends IService<GonganxiansuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonganxiansuoVO> selectListVO(Wrapper<GonganxiansuoEntity> wrapper);
   	
   	GonganxiansuoVO selectVO(@Param("ew") Wrapper<GonganxiansuoEntity> wrapper);
   	
   	List<GonganxiansuoView> selectListView(Wrapper<GonganxiansuoEntity> wrapper);
   	
   	GonganxiansuoView selectView(@Param("ew") Wrapper<GonganxiansuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonganxiansuoEntity> wrapper);
   	

}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GonganbumenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GonganbumenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GonganbumenView;


/**
 * 公安部门
 *
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface GonganbumenService extends IService<GonganbumenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GonganbumenVO> selectListVO(Wrapper<GonganbumenEntity> wrapper);
   	
   	GonganbumenVO selectVO(@Param("ew") Wrapper<GonganbumenEntity> wrapper);
   	
   	List<GonganbumenView> selectListView(Wrapper<GonganbumenEntity> wrapper);
   	
   	GonganbumenView selectView(@Param("ew") Wrapper<GonganbumenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GonganbumenEntity> wrapper);
   	

}


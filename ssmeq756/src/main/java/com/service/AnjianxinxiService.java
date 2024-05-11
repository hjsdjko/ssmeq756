package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnjianxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AnjianxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AnjianxinxiView;


/**
 * 案件信息
 *
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface AnjianxinxiService extends IService<AnjianxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnjianxinxiVO> selectListVO(Wrapper<AnjianxinxiEntity> wrapper);
   	
   	AnjianxinxiVO selectVO(@Param("ew") Wrapper<AnjianxinxiEntity> wrapper);
   	
   	List<AnjianxinxiView> selectListView(Wrapper<AnjianxinxiEntity> wrapper);
   	
   	AnjianxinxiView selectView(@Param("ew") Wrapper<AnjianxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnjianxinxiEntity> wrapper);
   	

}


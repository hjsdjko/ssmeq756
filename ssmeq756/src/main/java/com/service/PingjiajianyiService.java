package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PingjiajianyiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PingjiajianyiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PingjiajianyiView;


/**
 * 评价建议
 *
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface PingjiajianyiService extends IService<PingjiajianyiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingjiajianyiVO> selectListVO(Wrapper<PingjiajianyiEntity> wrapper);
   	
   	PingjiajianyiVO selectVO(@Param("ew") Wrapper<PingjiajianyiEntity> wrapper);
   	
   	List<PingjiajianyiView> selectListView(Wrapper<PingjiajianyiEntity> wrapper);
   	
   	PingjiajianyiView selectView(@Param("ew") Wrapper<PingjiajianyiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingjiajianyiEntity> wrapper);
   	

}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZoushilaorenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZoushilaorenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZoushilaorenView;


/**
 * 走失老人
 *
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface ZoushilaorenService extends IService<ZoushilaorenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZoushilaorenVO> selectListVO(Wrapper<ZoushilaorenEntity> wrapper);
   	
   	ZoushilaorenVO selectVO(@Param("ew") Wrapper<ZoushilaorenEntity> wrapper);
   	
   	List<ZoushilaorenView> selectListView(Wrapper<ZoushilaorenEntity> wrapper);
   	
   	ZoushilaorenView selectView(@Param("ew") Wrapper<ZoushilaorenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZoushilaorenEntity> wrapper);
   	

}


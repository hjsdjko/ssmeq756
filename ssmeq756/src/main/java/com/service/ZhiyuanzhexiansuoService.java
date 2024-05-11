package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanzhexiansuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanzhexiansuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanzhexiansuoView;


/**
 * 志愿者线索
 *
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public interface ZhiyuanzhexiansuoService extends IService<ZhiyuanzhexiansuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanzhexiansuoVO> selectListVO(Wrapper<ZhiyuanzhexiansuoEntity> wrapper);
   	
   	ZhiyuanzhexiansuoVO selectVO(@Param("ew") Wrapper<ZhiyuanzhexiansuoEntity> wrapper);
   	
   	List<ZhiyuanzhexiansuoView> selectListView(Wrapper<ZhiyuanzhexiansuoEntity> wrapper);
   	
   	ZhiyuanzhexiansuoView selectView(@Param("ew") Wrapper<ZhiyuanzhexiansuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanzhexiansuoEntity> wrapper);
   	

}


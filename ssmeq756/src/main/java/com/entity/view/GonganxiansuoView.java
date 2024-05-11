package com.entity.view;

import com.entity.GonganxiansuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公安线索
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
@TableName("gonganxiansuo")
public class GonganxiansuoView  extends GonganxiansuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GonganxiansuoView(){
	}
 
 	public GonganxiansuoView(GonganxiansuoEntity gonganxiansuoEntity){
 	try {
			BeanUtils.copyProperties(this, gonganxiansuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

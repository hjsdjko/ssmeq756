package com.entity.view;

import com.entity.ZoushilaorenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 走失老人
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
@TableName("zoushilaoren")
public class ZoushilaorenView  extends ZoushilaorenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZoushilaorenView(){
	}
 
 	public ZoushilaorenView(ZoushilaorenEntity zoushilaorenEntity){
 	try {
			BeanUtils.copyProperties(this, zoushilaorenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

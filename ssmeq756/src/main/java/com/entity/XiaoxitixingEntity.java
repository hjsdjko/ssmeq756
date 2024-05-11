package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 消息提醒
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
@TableName("xiaoxitixing")
public class XiaoxitixingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoxitixingEntity() {
		
	}
	
	public XiaoxitixingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 提醒标题
	 */
					
	private String tixingbiaoti;
	
	/**
	 * 近期照片
	 */
					
	private String jinqizhaopian;
	
	/**
	 * 提醒内容
	 */
					
	private String tixingneirong;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 提醒时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tixingshijian;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：提醒标题
	 */
	public void setTixingbiaoti(String tixingbiaoti) {
		this.tixingbiaoti = tixingbiaoti;
	}
	/**
	 * 获取：提醒标题
	 */
	public String getTixingbiaoti() {
		return tixingbiaoti;
	}
	/**
	 * 设置：近期照片
	 */
	public void setJinqizhaopian(String jinqizhaopian) {
		this.jinqizhaopian = jinqizhaopian;
	}
	/**
	 * 获取：近期照片
	 */
	public String getJinqizhaopian() {
		return jinqizhaopian;
	}
	/**
	 * 设置：提醒内容
	 */
	public void setTixingneirong(String tixingneirong) {
		this.tixingneirong = tixingneirong;
	}
	/**
	 * 获取：提醒内容
	 */
	public String getTixingneirong() {
		return tixingneirong;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：提醒时间
	 */
	public void setTixingshijian(Date tixingshijian) {
		this.tixingshijian = tixingshijian;
	}
	/**
	 * 获取：提醒时间
	 */
	public Date getTixingshijian() {
		return tixingshijian;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}

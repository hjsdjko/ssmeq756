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
 * 案件信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
@TableName("anjianxinxi")
public class AnjianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public AnjianxinxiEntity() {
		
	}
	
	public AnjianxinxiEntity(T t) {
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
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 近期照片
	 */
					
	private String jinqizhaopian;
	
	/**
	 * 穿着习惯
	 */
					
	private String chuanzhexiguan;
	
	/**
	 * 常去地点
	 */
					
	private String changqudidian;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 口音
	 */
					
	private String kouyin;
	
	/**
	 * 案件进度
	 */
					
	private String anjianjindu;
	
	/**
	 * 走失描述
	 */
					
	private String zoushimiaoshu;
	
	/**
	 * 报备时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date baobeishijian;
	
	/**
	 * 报备地点
	 */
					
	private String baobeididian;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
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
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
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
	 * 设置：穿着习惯
	 */
	public void setChuanzhexiguan(String chuanzhexiguan) {
		this.chuanzhexiguan = chuanzhexiguan;
	}
	/**
	 * 获取：穿着习惯
	 */
	public String getChuanzhexiguan() {
		return chuanzhexiguan;
	}
	/**
	 * 设置：常去地点
	 */
	public void setChangqudidian(String changqudidian) {
		this.changqudidian = changqudidian;
	}
	/**
	 * 获取：常去地点
	 */
	public String getChangqudidian() {
		return changqudidian;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：口音
	 */
	public void setKouyin(String kouyin) {
		this.kouyin = kouyin;
	}
	/**
	 * 获取：口音
	 */
	public String getKouyin() {
		return kouyin;
	}
	/**
	 * 设置：案件进度
	 */
	public void setAnjianjindu(String anjianjindu) {
		this.anjianjindu = anjianjindu;
	}
	/**
	 * 获取：案件进度
	 */
	public String getAnjianjindu() {
		return anjianjindu;
	}
	/**
	 * 设置：走失描述
	 */
	public void setZoushimiaoshu(String zoushimiaoshu) {
		this.zoushimiaoshu = zoushimiaoshu;
	}
	/**
	 * 获取：走失描述
	 */
	public String getZoushimiaoshu() {
		return zoushimiaoshu;
	}
	/**
	 * 设置：报备时间
	 */
	public void setBaobeishijian(Date baobeishijian) {
		this.baobeishijian = baobeishijian;
	}
	/**
	 * 获取：报备时间
	 */
	public Date getBaobeishijian() {
		return baobeishijian;
	}
	/**
	 * 设置：报备地点
	 */
	public void setBaobeididian(String baobeididian) {
		this.baobeididian = baobeididian;
	}
	/**
	 * 获取：报备地点
	 */
	public String getBaobeididian() {
		return baobeididian;
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
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
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

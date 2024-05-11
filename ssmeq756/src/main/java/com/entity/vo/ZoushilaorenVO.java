package com.entity.vo;

import com.entity.ZoushilaorenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 走失老人
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-31 15:53:23
 */
public class ZoushilaorenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 找回状态
	 */
	
	private String zhaohuizhuangtai;
		
	/**
	 * 走失描述
	 */
	
	private String zoushimiaoshu;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：找回状态
	 */
	 
	public void setZhaohuizhuangtai(String zhaohuizhuangtai) {
		this.zhaohuizhuangtai = zhaohuizhuangtai;
	}
	
	/**
	 * 获取：找回状态
	 */
	public String getZhaohuizhuangtai() {
		return zhaohuizhuangtai;
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

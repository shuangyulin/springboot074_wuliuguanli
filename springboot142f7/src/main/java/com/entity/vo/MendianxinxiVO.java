package com.entity.vo;

import com.entity.MendianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 门店信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public class MendianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 门店位置
	 */
	
	private String mendianweizhi;
		
	/**
	 * 门店介绍
	 */
	
	private String mendianjieshao;
		
	/**
	 * 门店图片
	 */
	
	private String mendiantupian;
		
	/**
	 * 创建日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangjianriqi;
		
	/**
	 * 店主账号
	 */
	
	private String dianzhuzhanghao;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：门店位置
	 */
	 
	public void setMendianweizhi(String mendianweizhi) {
		this.mendianweizhi = mendianweizhi;
	}
	
	/**
	 * 获取：门店位置
	 */
	public String getMendianweizhi() {
		return mendianweizhi;
	}
				
	
	/**
	 * 设置：门店介绍
	 */
	 
	public void setMendianjieshao(String mendianjieshao) {
		this.mendianjieshao = mendianjieshao;
	}
	
	/**
	 * 获取：门店介绍
	 */
	public String getMendianjieshao() {
		return mendianjieshao;
	}
				
	
	/**
	 * 设置：门店图片
	 */
	 
	public void setMendiantupian(String mendiantupian) {
		this.mendiantupian = mendiantupian;
	}
	
	/**
	 * 获取：门店图片
	 */
	public String getMendiantupian() {
		return mendiantupian;
	}
				
	
	/**
	 * 设置：创建日期
	 */
	 
	public void setChuangjianriqi(Date chuangjianriqi) {
		this.chuangjianriqi = chuangjianriqi;
	}
	
	/**
	 * 获取：创建日期
	 */
	public Date getChuangjianriqi() {
		return chuangjianriqi;
	}
				
	
	/**
	 * 设置：店主账号
	 */
	 
	public void setDianzhuzhanghao(String dianzhuzhanghao) {
		this.dianzhuzhanghao = dianzhuzhanghao;
	}
	
	/**
	 * 获取：店主账号
	 */
	public String getDianzhuzhanghao() {
		return dianzhuzhanghao;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}

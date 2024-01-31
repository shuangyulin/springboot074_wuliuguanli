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
 * 订单信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
@TableName("dingdanxinxi")
public class DingdanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingdanxinxiEntity() {
		
	}
	
	public DingdanxinxiEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 门店名称
	 */
					
	private String mendianmingcheng;
	
	/**
	 * 订单种类
	 */
					
	private String dingdanzhonglei;
	
	/**
	 * 品名
	 */
					
	private String pinming;
	
	/**
	 * 净重
	 */
					
	private String jingzhong;
	
	/**
	 * 始发地
	 */
					
	private String shifadi;
	
	/**
	 * 目的地
	 */
					
	private String mudedi;
	
	/**
	 * 客户备注
	 */
					
	private String kehubeizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 顾客姓名
	 */
					
	private String gukexingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
	}
	/**
	 * 设置：门店名称
	 */
	public void setMendianmingcheng(String mendianmingcheng) {
		this.mendianmingcheng = mendianmingcheng;
	}
	/**
	 * 获取：门店名称
	 */
	public String getMendianmingcheng() {
		return mendianmingcheng;
	}
	/**
	 * 设置：订单种类
	 */
	public void setDingdanzhonglei(String dingdanzhonglei) {
		this.dingdanzhonglei = dingdanzhonglei;
	}
	/**
	 * 获取：订单种类
	 */
	public String getDingdanzhonglei() {
		return dingdanzhonglei;
	}
	/**
	 * 设置：品名
	 */
	public void setPinming(String pinming) {
		this.pinming = pinming;
	}
	/**
	 * 获取：品名
	 */
	public String getPinming() {
		return pinming;
	}
	/**
	 * 设置：净重
	 */
	public void setJingzhong(String jingzhong) {
		this.jingzhong = jingzhong;
	}
	/**
	 * 获取：净重
	 */
	public String getJingzhong() {
		return jingzhong;
	}
	/**
	 * 设置：始发地
	 */
	public void setShifadi(String shifadi) {
		this.shifadi = shifadi;
	}
	/**
	 * 获取：始发地
	 */
	public String getShifadi() {
		return shifadi;
	}
	/**
	 * 设置：目的地
	 */
	public void setMudedi(String mudedi) {
		this.mudedi = mudedi;
	}
	/**
	 * 获取：目的地
	 */
	public String getMudedi() {
		return mudedi;
	}
	/**
	 * 设置：客户备注
	 */
	public void setKehubeizhu(String kehubeizhu) {
		this.kehubeizhu = kehubeizhu;
	}
	/**
	 * 获取：客户备注
	 */
	public String getKehubeizhu() {
		return kehubeizhu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：顾客姓名
	 */
	public void setGukexingming(String gukexingming) {
		this.gukexingming = gukexingming;
	}
	/**
	 * 获取：顾客姓名
	 */
	public String getGukexingming() {
		return gukexingming;
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

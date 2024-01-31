package com.entity.model;

import com.entity.DingdanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 订单信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public class DingdanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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

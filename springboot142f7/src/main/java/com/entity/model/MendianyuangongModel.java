package com.entity.model;

import com.entity.MendianyuangongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 门店员工
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public class MendianyuangongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 个人简历
	 */
	
	private String gerenjianli;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 店主账号
	 */
	
	private String dianzhuzhanghao;
		
	/**
	 * 店主姓名
	 */
	
	private String dianzhuxingming;
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
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
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
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
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：个人简历
	 */
	 
	public void setGerenjianli(String gerenjianli) {
		this.gerenjianli = gerenjianli;
	}
	
	/**
	 * 获取：个人简历
	 */
	public String getGerenjianli() {
		return gerenjianli;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
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
	 * 设置：店主姓名
	 */
	 
	public void setDianzhuxingming(String dianzhuxingming) {
		this.dianzhuxingming = dianzhuxingming;
	}
	
	/**
	 * 获取：店主姓名
	 */
	public String getDianzhuxingming() {
		return dianzhuxingming;
	}
			
}

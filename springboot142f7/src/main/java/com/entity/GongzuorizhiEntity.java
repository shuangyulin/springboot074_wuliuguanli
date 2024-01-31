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
 * 工作日志
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
@TableName("gongzuorizhi")
public class GongzuorizhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GongzuorizhiEntity() {
		
	}
	
	public GongzuorizhiEntity(T t) {
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
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 员工姓名
	 */
					
	private String yuangongxingming;
	
	/**
	 * 部门
	 */
					
	private String bumen;
	
	/**
	 * 店主账号
	 */
					
	private String dianzhuzhanghao;
	
	/**
	 * 门店名称
	 */
					
	private String mendianmingcheng;
	
	/**
	 * 工作项目
	 */
					
	private String gongzuoxiangmu;
	
	/**
	 * 工作内容
	 */
					
	private String gongzuoneirong;
	
	/**
	 * 完成状况
	 */
					
	private String wanchengzhuangkuang;
	
	/**
	 * 待解决问题
	 */
					
	private String daijiejuewenti;
	
	/**
	 * 工作总结
	 */
					
	private String gongzuozongjie;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
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
	 * 设置：工号
	 */
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
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
	 * 设置：工作项目
	 */
	public void setGongzuoxiangmu(String gongzuoxiangmu) {
		this.gongzuoxiangmu = gongzuoxiangmu;
	}
	/**
	 * 获取：工作项目
	 */
	public String getGongzuoxiangmu() {
		return gongzuoxiangmu;
	}
	/**
	 * 设置：工作内容
	 */
	public void setGongzuoneirong(String gongzuoneirong) {
		this.gongzuoneirong = gongzuoneirong;
	}
	/**
	 * 获取：工作内容
	 */
	public String getGongzuoneirong() {
		return gongzuoneirong;
	}
	/**
	 * 设置：完成状况
	 */
	public void setWanchengzhuangkuang(String wanchengzhuangkuang) {
		this.wanchengzhuangkuang = wanchengzhuangkuang;
	}
	/**
	 * 获取：完成状况
	 */
	public String getWanchengzhuangkuang() {
		return wanchengzhuangkuang;
	}
	/**
	 * 设置：待解决问题
	 */
	public void setDaijiejuewenti(String daijiejuewenti) {
		this.daijiejuewenti = daijiejuewenti;
	}
	/**
	 * 获取：待解决问题
	 */
	public String getDaijiejuewenti() {
		return daijiejuewenti;
	}
	/**
	 * 设置：工作总结
	 */
	public void setGongzuozongjie(String gongzuozongjie) {
		this.gongzuozongjie = gongzuozongjie;
	}
	/**
	 * 获取：工作总结
	 */
	public String getGongzuozongjie() {
		return gongzuozongjie;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：日期
	 */
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
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

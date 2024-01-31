package com.entity.view;

import com.entity.DianzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 店主
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
@TableName("dianzhu")
public class DianzhuView  extends DianzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianzhuView(){
	}
 
 	public DianzhuView(DianzhuEntity dianzhuEntity){
 	try {
			BeanUtils.copyProperties(this, dianzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

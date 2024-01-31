package com.dao;

import com.entity.DianzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianzhuVO;
import com.entity.view.DianzhuView;


/**
 * 店主
 * 
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public interface DianzhuDao extends BaseMapper<DianzhuEntity> {
	
	List<DianzhuVO> selectListVO(@Param("ew") Wrapper<DianzhuEntity> wrapper);
	
	DianzhuVO selectVO(@Param("ew") Wrapper<DianzhuEntity> wrapper);
	
	List<DianzhuView> selectListView(@Param("ew") Wrapper<DianzhuEntity> wrapper);

	List<DianzhuView> selectListView(Pagination page,@Param("ew") Wrapper<DianzhuEntity> wrapper);
	
	DianzhuView selectView(@Param("ew") Wrapper<DianzhuEntity> wrapper);
	
}

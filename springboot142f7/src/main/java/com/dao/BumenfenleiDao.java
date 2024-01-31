package com.dao;

import com.entity.BumenfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BumenfenleiVO;
import com.entity.view.BumenfenleiView;


/**
 * 部门分类
 * 
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public interface BumenfenleiDao extends BaseMapper<BumenfenleiEntity> {
	
	List<BumenfenleiVO> selectListVO(@Param("ew") Wrapper<BumenfenleiEntity> wrapper);
	
	BumenfenleiVO selectVO(@Param("ew") Wrapper<BumenfenleiEntity> wrapper);
	
	List<BumenfenleiView> selectListView(@Param("ew") Wrapper<BumenfenleiEntity> wrapper);

	List<BumenfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<BumenfenleiEntity> wrapper);
	
	BumenfenleiView selectView(@Param("ew") Wrapper<BumenfenleiEntity> wrapper);
	
}

package com.dao;

import com.entity.MendianyuangongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MendianyuangongVO;
import com.entity.view.MendianyuangongView;


/**
 * 门店员工
 * 
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public interface MendianyuangongDao extends BaseMapper<MendianyuangongEntity> {
	
	List<MendianyuangongVO> selectListVO(@Param("ew") Wrapper<MendianyuangongEntity> wrapper);
	
	MendianyuangongVO selectVO(@Param("ew") Wrapper<MendianyuangongEntity> wrapper);
	
	List<MendianyuangongView> selectListView(@Param("ew") Wrapper<MendianyuangongEntity> wrapper);

	List<MendianyuangongView> selectListView(Pagination page,@Param("ew") Wrapper<MendianyuangongEntity> wrapper);
	
	MendianyuangongView selectView(@Param("ew") Wrapper<MendianyuangongEntity> wrapper);
	
}

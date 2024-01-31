package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianzhuView;


/**
 * 店主
 *
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public interface DianzhuService extends IService<DianzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianzhuVO> selectListVO(Wrapper<DianzhuEntity> wrapper);
   	
   	DianzhuVO selectVO(@Param("ew") Wrapper<DianzhuEntity> wrapper);
   	
   	List<DianzhuView> selectListView(Wrapper<DianzhuEntity> wrapper);
   	
   	DianzhuView selectView(@Param("ew") Wrapper<DianzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianzhuEntity> wrapper);
   	
}


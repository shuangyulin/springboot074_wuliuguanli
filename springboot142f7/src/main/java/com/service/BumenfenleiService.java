package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BumenfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BumenfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenfenleiView;


/**
 * 部门分类
 *
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public interface BumenfenleiService extends IService<BumenfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BumenfenleiVO> selectListVO(Wrapper<BumenfenleiEntity> wrapper);
   	
   	BumenfenleiVO selectVO(@Param("ew") Wrapper<BumenfenleiEntity> wrapper);
   	
   	List<BumenfenleiView> selectListView(Wrapper<BumenfenleiEntity> wrapper);
   	
   	BumenfenleiView selectView(@Param("ew") Wrapper<BumenfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BumenfenleiEntity> wrapper);
   	
}


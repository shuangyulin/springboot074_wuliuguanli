package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MendianyuangongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MendianyuangongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MendianyuangongView;


/**
 * 门店员工
 *
 * @author 
 * @email 
 * @date 2021-04-27 11:11:19
 */
public interface MendianyuangongService extends IService<MendianyuangongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MendianyuangongVO> selectListVO(Wrapper<MendianyuangongEntity> wrapper);
   	
   	MendianyuangongVO selectVO(@Param("ew") Wrapper<MendianyuangongEntity> wrapper);
   	
   	List<MendianyuangongView> selectListView(Wrapper<MendianyuangongEntity> wrapper);
   	
   	MendianyuangongView selectView(@Param("ew") Wrapper<MendianyuangongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MendianyuangongEntity> wrapper);
   	
}


package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MendianyuangongDao;
import com.entity.MendianyuangongEntity;
import com.service.MendianyuangongService;
import com.entity.vo.MendianyuangongVO;
import com.entity.view.MendianyuangongView;

@Service("mendianyuangongService")
public class MendianyuangongServiceImpl extends ServiceImpl<MendianyuangongDao, MendianyuangongEntity> implements MendianyuangongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MendianyuangongEntity> page = this.selectPage(
                new Query<MendianyuangongEntity>(params).getPage(),
                new EntityWrapper<MendianyuangongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MendianyuangongEntity> wrapper) {
		  Page<MendianyuangongView> page =new Query<MendianyuangongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MendianyuangongVO> selectListVO(Wrapper<MendianyuangongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MendianyuangongVO selectVO(Wrapper<MendianyuangongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MendianyuangongView> selectListView(Wrapper<MendianyuangongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MendianyuangongView selectView(Wrapper<MendianyuangongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

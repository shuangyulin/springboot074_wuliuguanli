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


import com.dao.DianzhuDao;
import com.entity.DianzhuEntity;
import com.service.DianzhuService;
import com.entity.vo.DianzhuVO;
import com.entity.view.DianzhuView;

@Service("dianzhuService")
public class DianzhuServiceImpl extends ServiceImpl<DianzhuDao, DianzhuEntity> implements DianzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianzhuEntity> page = this.selectPage(
                new Query<DianzhuEntity>(params).getPage(),
                new EntityWrapper<DianzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianzhuEntity> wrapper) {
		  Page<DianzhuView> page =new Query<DianzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianzhuVO> selectListVO(Wrapper<DianzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianzhuVO selectVO(Wrapper<DianzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianzhuView> selectListView(Wrapper<DianzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianzhuView selectView(Wrapper<DianzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

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


import com.dao.BumenfenleiDao;
import com.entity.BumenfenleiEntity;
import com.service.BumenfenleiService;
import com.entity.vo.BumenfenleiVO;
import com.entity.view.BumenfenleiView;

@Service("bumenfenleiService")
public class BumenfenleiServiceImpl extends ServiceImpl<BumenfenleiDao, BumenfenleiEntity> implements BumenfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BumenfenleiEntity> page = this.selectPage(
                new Query<BumenfenleiEntity>(params).getPage(),
                new EntityWrapper<BumenfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BumenfenleiEntity> wrapper) {
		  Page<BumenfenleiView> page =new Query<BumenfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BumenfenleiVO> selectListVO(Wrapper<BumenfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BumenfenleiVO selectVO(Wrapper<BumenfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BumenfenleiView> selectListView(Wrapper<BumenfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BumenfenleiView selectView(Wrapper<BumenfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

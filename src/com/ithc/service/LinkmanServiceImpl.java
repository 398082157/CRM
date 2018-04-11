package com.ithc.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.transaction.annotation.Transactional;

import com.ithc.bean.Linkman;
import com.ithc.dao.LinkmanDao;
import com.ithc.util.PageBean;

@Transactional
public class LinkmanServiceImpl implements LinkmanService{

	private LinkmanDao linkmanDao;

	public void setLinkmanDao(LinkmanDao linkmanDao) {
		this.linkmanDao = linkmanDao;
	}

	//添加
	public void save(Linkman linkman) {
		linkmanDao.save(linkman);
	}

	//分页查询
	@Override
	public PageBean<Linkman> findByPage(Integer pageCode, Integer pageSize, DetachedCriteria criteria) {
		return linkmanDao.findByPage(pageCode,pageSize,criteria);
	}

	//删除
	@Override
	public void delete(Linkman linkman) {
          linkmanDao.delete(linkman);		
	}

	//id查询
	@Override
	public Linkman findById(Long lkm_id) {
		return linkmanDao.findById(lkm_id);
	}

	//查询所有
	@Override
	public List<Linkman> findByAll() {
		
		return linkmanDao.findByAll();
	}

	//修改
	@Override
	public void update(Linkman linkman) {
            linkmanDao.update(linkman);		
	}
	
	
	
}

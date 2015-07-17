package com.fh.service.system.permission;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fh.dao.DaoSupport;
import com.fh.entity.Page;
import com.fh.util.PageData;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService{

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	@Override
	public List<PageData> listAllPermission(Page page) throws Exception {
		return (List<PageData>) dao.findForList("PermissionMapper.listAll", page);

	}

}

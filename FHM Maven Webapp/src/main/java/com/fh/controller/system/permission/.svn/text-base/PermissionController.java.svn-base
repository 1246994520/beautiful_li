package com.fh.controller.system.permission;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.base.BaseController;
import com.fh.entity.Page;
import com.fh.service.system.permission.PermissionService;
import com.fh.util.PageData;

@Controller
@RequestMapping("/permission")
public class PermissionController extends BaseController {

	@Resource(name = "permissionService")
	PermissionService permissionService;

	/**
	 * 列表
	 */
	@RequestMapping
	public ModelAndView list(Page page) throws Exception {
		ModelAndView mv = this.getModelAndView();

		List<PageData> permissionList = permissionService
				.listAllPermission(page); 

		mv.addObject("permissionList", permissionList);
		mv.setViewName("system/permission/permission_list");

		return mv;
	}
}

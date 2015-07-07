package com.fh.service.system.permission;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fh.entity.Page;
import com.fh.util.PageData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/ApplicationContext.xml"})
public class PermissionServiceImplTest {
	
	@Autowired
	PermissionService permissionService;
	
	@Test
	public void testListAllPermission() {
		Page page = new Page();
		page.setCurrentPage(1);
		page.setShowCount(5);
		try {
			List<PageData> list = permissionService.listAllPermission(page);
			for (PageData pageData : list) {
				System.out.println(pageData.getString("PERMISSION"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

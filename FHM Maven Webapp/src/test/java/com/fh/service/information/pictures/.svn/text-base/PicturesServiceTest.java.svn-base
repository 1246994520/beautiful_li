package com.fh.service.information.pictures;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fh.entity.Page;
import com.fh.util.PageData;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/ApplicationContext.xml"})
public class PicturesServiceTest {
	@Autowired
	PicturesService pService;
	

	@Test
	public void testSave() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testEdit() {
		fail("Not yet implemented");
	}

	@Test
	public void testList() {
		Page page = new Page();
		try {
			List<PageData> list = pService.list(page);
			for (PageData pageData : list) {
				System.out.println(pageData.getString("PATH"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testListAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllById() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelTp() {
		fail("Not yet implemented");
	}

}

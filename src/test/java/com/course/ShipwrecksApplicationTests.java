package com.course;

import com.course.controller.HomeControler;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShipwrecksApplicationTests {

	@Test
	public void testapp() {
		HomeControler homeControler = new HomeControler();
		String result = homeControler.home();
		assertEquals(result, "Das boot, repository for duty");
	}

}

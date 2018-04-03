package com.design_pattern.singleton;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class Singleton2Test {

	@Test
	public void test() {
		try {
			LocalDate date = Singleton2.getInstanse().getDate();
			Assert.assertEquals(date, LocalDate.now());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

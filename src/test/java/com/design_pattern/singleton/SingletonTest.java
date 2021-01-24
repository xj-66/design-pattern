package com.design_pattern.singleton;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

	@Test
	public void test() {
		try {
			LocalDate date = Singleton.getInstanse().getDate();
			Assert.assertEquals(date, LocalDate.now());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		try {
			LocalDate date = Singleton2.getInstanse().getDate();
			Assert.assertEquals(date, LocalDate.now());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test3() {
		try {
			LocalDate date = Singleton3.getInstanse().getDate();
			Assert.assertEquals(date, LocalDate.now());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

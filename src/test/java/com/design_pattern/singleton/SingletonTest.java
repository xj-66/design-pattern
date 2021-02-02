package com.design_pattern.singleton;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

	@Test
	public void test() {
		try {
			String s = Singleton.getInstanse().sayHello();
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		try {
			Singleton2.getInstanse().sayHello();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test3() {
		try {
			Singleton3.getInstanse().sayHello();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

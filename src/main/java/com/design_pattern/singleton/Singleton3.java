package com.design_pattern.singleton;

import java.time.LocalDate;

/**
 * 懒汉模式
 *
 * @author coffee
 */
public class Singleton3 {

	// 构造方法私有化，保证单例
	private Singleton3() {

	}

	// 内部类的方式创建
	private static final class create {
		private static final Singleton3 INSTANCE = new Singleton3();
	}

	// 提供一个用于获取实例的方法，公有静态
	public static Singleton3 getInstanse() {
		return create.INSTANCE;
	}

	public LocalDate getDate() throws Exception {
		return LocalDate.now();
	}
}

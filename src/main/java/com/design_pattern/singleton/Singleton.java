package com.design_pattern.singleton;

import java.time.LocalDate;

/**
 * 单例模式Singleton 
 * 场景：全局只有一个实例 
 * 作用：保证全局只有一个实例 
 * 类型：饿汉模式、懒汉模式
 * 
 * 饿汉模式
 * @author coffee
 */
public class Singleton {

	// 构造方法私有化，保证单例
	private Singleton() {

	}

	// 自己创建一个实例，私有静态
	private static Singleton instance = new Singleton();

	// 提供一个用于获取实例的方法，公有静态
	public static Singleton getInstanse() {
		return instance;
	}

	public LocalDate getDate() throws Exception {
		return LocalDate.now();
	}
}

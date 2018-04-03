package com.design_pattern.singleton;

import java.time.LocalDate;

/**
 * 懒汉模式
 * @author coffee
 */
public class Singleton2 {
	
	//构造方法私有化，保证单例
	private Singleton2(){
		
	}
	
	//自己创建一个实例，私有静态
	private static Singleton2 instance;
	
	//提供一个用于获取实例的方法，公有静态
	public static Singleton2 getInstanse(){
		synchronized (Singleton2.class) {
			if(instance == null){
				instance = new Singleton2();
			}
		}
		return instance;
	}
	
	public LocalDate getDate() throws Exception {
		return LocalDate.now();
	}
}

package com.design_pattern.adapter;

/**
 * 
 * 适配器模式
 * 
 * 即将被适配的类
 * 
 * @author coffee
 *
 */
public class Adaptee {

	public void doSomethingOld() {
		System.out.println("执行旧方法...");
	}
}

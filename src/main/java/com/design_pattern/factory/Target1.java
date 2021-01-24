package com.design_pattern.factory;

/**
 * @author wu
 * @date 2021/1/24 20:13
 */
public class Target1 implements MyTarget {
	@Override
	public void sayHello() {
		System.out.println(this.getClass().getName() + " - hello");
	}
}

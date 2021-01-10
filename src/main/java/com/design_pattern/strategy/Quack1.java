package com.design_pattern.strategy;

/**
 * @author wu
 * @date 2021/1/10 21:35
 */
public class Quack1 implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("叫声策略1");
	}
}
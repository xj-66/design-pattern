package com.design_pattern.strategy;

/**
 * @author wu
 * @date 2021/1/10 21:34
 */
public class Fly1  implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("飞行策略1");
	}
}

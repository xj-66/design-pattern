package com.design_pattern.decortor;

/**
 * @author wu
 * @date 2021/1/12 21:00
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "深度烘焙";
	}

	@Override
	double cost() {
		return 0.99d;
	}
}

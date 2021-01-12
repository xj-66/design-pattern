package com.design_pattern.decortor;

/**
 * 浓缩咖啡
 *
 * @author wu
 * @date 2021/1/12 21:00
 */
public class Espresso extends Beverage {

	public Espresso() {
		this.description = "浓缩咖啡";
	}

	@Override
	double cost() {
		return 1.99d;
	}
}

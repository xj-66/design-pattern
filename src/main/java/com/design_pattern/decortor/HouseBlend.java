package com.design_pattern.decortor;

/**
 * 综合咖啡
 *
 * @author wu
 * @date 2021/1/12 20:52
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "综合";
	}

	@Override
	double cost() {
		return 0.89d;
	}
}

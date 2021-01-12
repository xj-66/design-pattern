package com.design_pattern.decortor;

/**
 * @author wu
 * @date 2021/1/12 21:15
 */
public class Mocha extends CondimentDecortor {
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}


	@Override
	double cost() {
		return 0.2d + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "，摩卡";
	}
}

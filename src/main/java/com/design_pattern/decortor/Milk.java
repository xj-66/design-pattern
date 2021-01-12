package com.design_pattern.decortor;

/**
 * @author wu
 * @date 2021/1/12 21:11
 */
public class Milk extends CondimentDecortor {
	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	double cost() {
		return 0.10d + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "，牛奶";
	}
}

package com.design_pattern.decortor;

/**
 * @author wu
 * @date 2021/1/12 21:16
 */
public class Soy extends CondimentDecortor {
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	double cost() {
		return 0.15d + beverage.cost();
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "，豆浆";
	}
}

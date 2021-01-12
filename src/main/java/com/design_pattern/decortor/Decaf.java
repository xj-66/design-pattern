package com.design_pattern.decortor;

/**
 * 低咖啡因
 *
 * @author wu
 * @date 2021/1/12 21:03
 */
public class Decaf extends Beverage {

	public Decaf() {
		this.description = "低咖啡因";
	}

	@Override
	double cost() {
		return 1.05d;
	}
}

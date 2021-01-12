package com.design_pattern.decortor;

import org.junit.Test;

import static org.junit.Assert.*;

public class BeverageTest {

	@Test
	public void test() {
		// 不要调料  随便来一杯
		Beverage beverage = new HouseBlend();
		printInfo(beverage);

		Beverage beverage1 = new DarkRoast();// 深度烘焙
		beverage1 = new Mocha(beverage1);// 摩卡
		beverage1 = new Mocha(beverage1);// 摩卡
		beverage1 = new Whip(beverage1);// 奶泡
		printInfo(beverage1);

		// 来一个套娃写法，危险动作，请勿模仿
		Beverage beverage2 = new Whip(new Mocha(new Soy(new HouseBlend())));
		printInfo(beverage2);
	}

	void printInfo(Beverage beverage) {
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
	}
}
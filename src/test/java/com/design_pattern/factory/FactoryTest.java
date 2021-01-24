package com.design_pattern.factory;

import org.junit.Test;

public class FactoryTest {

	/**
	 * 测试简单工厂，严格说，简单工厂不是一个设计模式，更像是一种编程习惯。
	 */
	@Test
	public void testSimpleFactory() {
		MyTarget target = SimpleFactory.createTarget();
		target.sayHello();
	}

	/**
	 * 工厂方法：类似模板方法的思想，把创建决定权交给子类
	 */
	@Test
	public void testFactoryMethod() {
		FactoryMethod fm = new TestFactoryMethod();
		fm.run();
	}

	/**
	 * 抽象整个工厂，由子工厂自由生产对象
	 */
	@Test
	public void testAbstractFactory() {
		AbstractFactory factory = new TestAbstractFactory();
		MyTarget target = factory.createTarget();
		target.sayHello();
	}
}

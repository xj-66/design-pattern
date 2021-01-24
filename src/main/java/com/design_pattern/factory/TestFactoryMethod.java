package com.design_pattern.factory;

/**
 * @author wu
 * @date 2021/1/24 20:22
 */
public class TestFactoryMethod extends FactoryMethod{
	@Override
	MyTarget createTarget() {
		return new Target1();
	}
}

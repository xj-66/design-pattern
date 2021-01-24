package com.design_pattern.factory;

/**
 * @author wu
 * @date 2021/1/24 20:30
 */
public class TestAbstractFactory implements AbstractFactory{
	@Override
	public MyTarget createTarget() {
		return new Target1();
	}
}

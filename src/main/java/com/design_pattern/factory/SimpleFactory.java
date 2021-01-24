package com.design_pattern.factory;

/**
 *
 * 简单工厂
 */
public class SimpleFactory {

	public static MyTarget createTarget() {
		return new Target1();
	}
}

package com.design_pattern.factory;

/**
 * 抽象工厂模式：父类不一定是抽象类，也可以是接口
 */
public interface AbstractFactory {
	MyTarget createTarget();
}

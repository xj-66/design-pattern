package com.design_pattern.decortor;

/**
 * 这里可以是抽象类也可以是接口
 * <p>
 * 饮料
 *
 * @author wu
 * @date 2021/1/12 20:50
 */
public abstract class Beverage {
	String description;

	abstract double cost();

	public String getDescription() {
		return description;
	}
}

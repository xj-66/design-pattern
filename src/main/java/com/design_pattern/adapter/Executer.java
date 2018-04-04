package com.design_pattern.adapter;

/**
 * 
 * 适配器模式：客户端
 * 
 * @author coffee
 *
 */
public class Executer {

	private Target target;

	public Executer() {

	}

	public Executer(Target target) {
		this.target = target;
	}

	public void execute() {
		target.doSomething();
	}
}

package com.design_pattern.adapter;

/**
 * 
 * 适配器模式：客户端
 * 
 * @author coffee
 *
 */
public class Client {

	private Target target;

	public Client() {

	}

	public Client(Target target) {
		this.target = target;
	}

	public void execute() {
		target.doSomething();
	}
}

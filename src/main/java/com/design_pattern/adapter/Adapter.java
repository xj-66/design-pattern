package com.design_pattern.adapter;

/**
 * 
 * 适配器模式：组合实现
 * 
 * 实现Target 组合需要适配的类Adaptee到实现类Adapter
 * 
 * @author coffee
 *
 */
public class Adapter implements Target {

	private Adaptee adaptee;

	public Adapter() {

	}

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void doSomething() {

		System.out.println("我是适配器，正在适配旧方法...组合方式实现");
		adaptee.doSomethingOld();
	}

}

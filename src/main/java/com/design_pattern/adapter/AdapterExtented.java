package com.design_pattern.adapter;

/**
 * 
 * 适配器模式：继承方式
 * 
 * 实现接口Target 继承需要适配的类Adaptee到实现类AdapterExtented
 * 
 * @author coffee
 *
 */
public class AdapterExtented extends Adaptee implements Target {

	@Override
	public void doSomething() {

		System.out.println("我是适配器，正在适配旧方法...继承方式实现");
		this.doSomethingOld();
	}
}

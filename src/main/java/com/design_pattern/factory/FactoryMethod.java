package com.design_pattern.factory;

/**
 * @author wu
 * @date 2021/1/24 20:17
 */
public abstract class FactoryMethod {

	void run(){
		MyTarget target = createTarget();
		target.sayHello();
	}

	abstract MyTarget createTarget();
}

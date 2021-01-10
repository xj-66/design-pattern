package com.design_pattern.strategy;

/**
 * @author wu
 * @date 2021/1/10 21:36
 */
public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	void fly(){
		flyBehavior.fly();
	}

	void quack(){
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
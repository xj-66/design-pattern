package com.design_pattern.strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuckTest {

	@Test
	public void testDuck(){
		Duck duck = new MyDuck1();
		duck.setFlyBehavior(new Fly1()); // 设置飞行策略1
		duck.setQuackBehavior(new Quack1()); // 设置呱呱策略1

		duck.fly(); // 执行的是飞行策略1
		duck.quack(); // 执行的是叫声策略1

		// 动态改变策略
		duck.setFlyBehavior(new Fly2()); // 设置飞行策略2
		duck.setQuackBehavior(new Quack2()); // 设置叫声策略2

		duck.fly(); // 执行的是飞行策略2
		duck.quack(); // 执行的叫声策略2
	}

}
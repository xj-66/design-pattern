package com.design_pattern.observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverTest {

	@Test
	public void test() {
		Sub1 sub = new Sub1();

		Observer ob1 = new Ob1(sub, "这是原版输出的观察者");
		Observer ob2 = new Ob2(sub, "原版基础加一的观察者");

		sub.registerObserver(ob1);
		sub.registerObserver(ob2);

		// 有新状态发布
		// 此方法内部调用notifyObservers()通知各观察者。
		sub.measurementsChanged(10);
	}
}
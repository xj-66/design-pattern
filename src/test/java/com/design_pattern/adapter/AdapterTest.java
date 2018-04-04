package com.design_pattern.adapter;

import org.junit.Before;
import org.junit.Test;

public class AdapterTest {

	Adaptee adaptee = new Adaptee();

	@Before
	public void before() {
		adaptee.doSomethingOld();
		System.out.println("...这个方法已过时，接下来用适配器兼容这个方法以生成新的方法");
	}

	@Test
	public void testAdapter() {

		// 组合方式实现
		Target adapter = new Adapter(adaptee);

		Executer Executer = new Executer(adapter);
		Executer.execute();
	}

	@Test
	public void AdapterExtented() {

		// 继承方式实现
		Target adapter = new AdapterExtented();

		Executer Executer = new Executer(adapter);
		Executer.execute();
	}
}

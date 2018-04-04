package com.design_pattern.template;

/**
 * 
 * 实现父类未实现的部分,套用模板
 * 
 * @author coffee
 *
 */
public class Template extends AbstractTemplate{

	@Override
	protected void beforeLoad() {
		System.out.println("加载数据前...");
	}

	@Override
	protected void afterLoad() {
		System.out.println("加载数据后...");
	}
}

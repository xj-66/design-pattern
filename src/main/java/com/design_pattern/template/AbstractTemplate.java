package com.design_pattern.template;

/**
 * 
 * 模板模式
 * 1.一个框架,统一调用
 * 2.框架中包含可变和不变的部分
 * 3.可变的部分 延迟实现
 * 
 * @author coffee
 *
 */
public abstract class AbstractTemplate {

	//模板方法，汇总可变和不变的部分，final定义
	public final void execute(){
		//加载数据之前
		beforeLoad();
		//加载数据
		load();
		//加载数据之后
		afterLoad();
	}
	
	protected abstract void beforeLoad();
	
	private void load(){
		System.out.println("正在加载...");
	}
	
	protected abstract void afterLoad();
	
}

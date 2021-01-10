package com.design_pattern.observer;

public class Ob1 implements Observer {
    Subject subject;
    String name;

    /**
     * @param subject 主题实例，持有它，方便随时调用一些逻辑。
     * @param name    没啥用，标识一下当前对象的名称
     */
    public Ob1(Subject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update(int stat) {
    	// 接收通知，接收并处理数据（拉模型这里需要主动获取再处理）
        System.out.println(this.name + " - " + stat);
    }
}


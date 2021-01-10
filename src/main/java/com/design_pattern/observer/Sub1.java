package com.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Sub1 implements Subject {
	List<Observer> observerList = new ArrayList<>();
	int stat;

	@Override
	public void registerObserver(Observer subject) {
		observerList.add(subject);
	}

	@Override
	public void removeObserver(Observer subject) {
		observerList.remove(subject);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observerList) {
			observer.update(stat);
		}
	}

	/**
	 * 如果是拉模型，则在观察者类中进行调用
	 */
	public int getStat() {
		return stat;
	}

	void measurementsChanged(int stat) {
		this.stat = stat;
		this.notifyObservers();
	}
}

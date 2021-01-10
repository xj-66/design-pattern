package com.design_pattern.observer;

public interface Subject {
	void registerObserver(Observer subject);

	void removeObserver(Observer subject);

	void notifyObservers();
}

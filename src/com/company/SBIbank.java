package com.company;

import java.util.HashSet;
import java.util.Set;

public class SBIbank implements Bank {

	float interestRate;
	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
		notifyAllObserver();
	}

	Set<Media> observers = new HashSet<>();


	@Override
	public void addObserver(Media media) {
		this.observers.add(media);

	}

	@Override
	public void removeObserver(Media media) {
		this.observers.remove(media);

	}

	@Override
	public void notifyAllObserver() {
		for (Media media : observers) {
			media.printUpdate(interestRate);
		}

	}

}

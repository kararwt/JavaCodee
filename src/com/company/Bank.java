package com.company;

public interface Bank {
	
	public void addObserver(Media media);
	public void removeObserver(Media media);
	public void notifyAllObserver();
	

}

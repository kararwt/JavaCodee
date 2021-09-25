package com.company;

public class InternetMedia implements Media {
	@Override
	public void printUpdate(float interestRate) {
		System.out.println("Interest Rate changed to :" + interestRate);
		
	}
}

package com.company;

public class NewspaperMedia implements Media {

	@Override
	public void printUpdate(float interestRate) {
		System.out.println("News Interest Rate changed to :" + interestRate);
		
	}

}

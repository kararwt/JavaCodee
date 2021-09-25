package com.company;

public class ObserverApp {

	public static void main(String[] args) {
		Media np = new NewspaperMedia();

		Media ip = new InternetMedia();

		SBIbank bank = new SBIbank();
		bank.addObserver(np);
		bank.addObserver(ip);

		bank.setInterestRate(8.30f);

	}

}

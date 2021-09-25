package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Apple implements Phone {

	@Override
	public void modelNo() {
		System.out.println("model no 30");

	}

	@Override
	public void price() {
		System.out.println("price 10");
	}

}

class Samsung implements Phone {

	@Override
	public void modelNo() {
		System.out.println("model no 5");
	}

	@Override
	public void price() {
		System.out.println("price 5");
	}

}

class Moto implements Phone {

	@Override
	public void modelNo() {
		System.out.println("model no 2");

	}

	@Override
	public void price() {
		System.out.println("price 2");

	}

}

class ShopKeeper {
	private Apple apple;
	private Moto moto;
	private Samsung samsung;

	public ShopKeeper() {
		apple = new Apple();
		moto = new Moto();
		samsung = new Samsung();
	}

	public void iphoneSale() {
		apple.modelNo();
		apple.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void motoSale() {
		moto.modelNo();
		moto.price();
	}

}

public class FacadePattern {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int choice;
		do {

			System.out.println("===== Mobile Shop ======= ");
			System.out.println("1. Apple");
			System.out.println("Samsung");
			System.out.println("Moto");

			System.out.println("Enter your choice");

			//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			//choice = Integer.parseInt(bf.readLine());
			
			Scanner sc = new Scanner(System.in);
			choice = Integer.parseInt(sc.nextLine().trim());

			ShopKeeper sp = new ShopKeeper();

			switch (choice) {

			case 1:
				sp.iphoneSale();
				break;
			case 2:
				sp.samsungSale();
				break;
			case 3:
				sp.motoSale();
				break;
			default:
				System.out.println("invalid choice, exiting the application");
				return;

			}

		} while (choice != 4);
	}
}

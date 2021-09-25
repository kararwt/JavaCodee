package com.company;

class RealIA implements OfficeInternetAccess {

	@Override
	public void grandInernetAccess(String empName) {
		System.out.println("Access granted for emp :" + empName);

	}
}

class ProxyIA implements OfficeInternetAccess {

	private RealIA realIA;

	@Override
	public void grandInernetAccess(String empName) {
		if(!getAccessRole(empName))
			System.out.println("Not accessable");
		else {
			realIA = new RealIA();
			realIA.grandInernetAccess(empName);
		}
	}

	private boolean getAccessRole(String empName) {
		if(empName == "Kara")
			return true;
		else
			return false;
	}
}

public class InternetAccessClient {

	public static void main(String[] args) {	

		OfficeInternetAccess obj = new ProxyIA();
		obj.grandInernetAccess("abc");
		obj.grandInernetAccess("Kara");
		
	}
}


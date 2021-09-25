package com.company;

public class BuilderPattern {

	public static void main(String args[]) {

		LunchOrder.Builder obj1 = new LunchOrder.Builder();
		obj1.setBread("BrownBread").setDress("Top");
		LunchOrder obj2 = obj1.build();
		
		System.out.println(obj2.getBread());
	}
}

class LunchOrder {

	private String bread;
	private String dress;

	public static class Builder {
		private String bread;
		private String dress;

		public Builder setBread(String str) {
			this.bread = str;
			return this;
		}

		public Builder setDress(String str) {
			this.dress = str;
			return this;
		}

		public LunchOrder build() {
			return new LunchOrder(this);
		}

	}

	public String getBread() {
		return bread;
	}

	public String getDress() {
		return dress;
	}

	private LunchOrder(Builder builder) {
		this.bread = builder.bread;
		this.dress = builder.dress;
	}

}

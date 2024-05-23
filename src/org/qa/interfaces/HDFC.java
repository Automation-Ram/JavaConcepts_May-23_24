package org.qa.interfaces;

public class HDFC implements SBI {

	public void fundTrasfer() {
		System.out.println("Fund Transfer H");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void debit() {
		System.out.println("H D");

	}

	@Override
	public void credit() {
		System.out.println("H C");

	}

}

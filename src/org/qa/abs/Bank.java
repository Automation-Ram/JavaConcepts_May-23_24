package org.qa.abs;

import org.qa.interfaces.HDFC;

public class Bank extends HDFC {

	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.credit();
		obj.debit();
		obj.fundTrasfer();

	}

}

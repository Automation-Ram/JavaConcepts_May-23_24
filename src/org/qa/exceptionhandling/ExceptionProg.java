package org.qa.exceptionhandling;

import java.io.IOException;

public class ExceptionProg {

	void m() throws IOException {
		throw new IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {

			System.out.println("exception handled");
		} finally {
			System.out.println("Flow continues");
		}
	}

	public static void main(String args[]) {
		ExceptionProg obj = new ExceptionProg();
		obj.p();
		System.out.println("normal flow...");
	}

}

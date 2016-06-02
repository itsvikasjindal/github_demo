package com.ericsson.sidp.clm;

public class IncorrectCodingPractise {

	private void dummy() {
		System.out.println("Do Nothing");
	}
	
	public void badPractice() {
		String str1 = "Jinesh";
		String str2 = "Saurabh";
		
		if (str1 == str2) {
			System.out.println("wrong use of comparision");
		}
	}
	
	public void redundantNullCheck() {
		String str = null;
		
		if( str == null) {
			System.out.println("redundant null check of value known to be null");
		}
	}
	
	public void BadPerformance() {
		String str = "";
		
		for (int i = 0; i < 10; i++) {
			str = str + "a";
		}
	}
}

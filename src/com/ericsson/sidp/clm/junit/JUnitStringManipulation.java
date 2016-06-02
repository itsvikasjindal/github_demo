package com.ericsson.sidp.clm.junit;

import org.junit.Test;

import com.ericsson.sidp.clm.StringManipulation;

import static org.junit.Assert.assertEquals;

public class JUnitStringManipulation {
	String testString = "String to be tested";
	
	StringManipulation strMani = new StringManipulation(testString);
	
	@Test
	public void testPrintAndGetString() {
		assertEquals(testString, strMani.printAndGetString());
	}

}

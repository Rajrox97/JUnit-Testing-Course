package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest {

	
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	public StringHelperParameterizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	
	 
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] ={
				{"AACD","CD"},
				{"ACD","CD"}
				};
		return Arrays.asList(expectedOutputs); // Turning Arrays into Collection. 
	}
	
	@Before
	public void before() {
		helper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions(){
		// AACD =>CD , ACD=>CD , CDEF => CDEF , CDAA=>CDAA
		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));  
	}
	
//	@Test
//	public void testTruncateAInFirst2Positions2_AinFirstPosition(){
//		assertEquals(expectedOutput,helper.truncateAInFirst2Positions(input));
//	}
	
	
	
}

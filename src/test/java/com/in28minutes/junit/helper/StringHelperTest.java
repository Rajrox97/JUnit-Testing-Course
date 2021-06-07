package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	
	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions(){
		// AACD =>CD , ACD=>CD , CDEF => CDEF , CDAA=>CDAA
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));  
	}
	
	@Test
	public void testTruncateAInFirst2Positions2_AinFirstPosition(){
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testAreFirstandLastTwoCharectersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstandLastTwoCharectersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	
}

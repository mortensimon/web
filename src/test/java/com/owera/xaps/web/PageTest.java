package com.owera.xaps.web;

import static org.junit.Assert.*;

import org.junit.Test;

public class PageTest {
	@Test
	public void getByIdHandlesNullId() {
		// Given:
		String id = null;
		
		// When:
		Page p = Page.getById(id);
		
		// Then:
		assertEquals(Page.NONE, p);
	}
	
	@Test
	public void getUrlStartsWithCorrectPrefix() {
		
	}
}

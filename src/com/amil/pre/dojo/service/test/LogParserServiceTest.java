package com.amil.pre.dojo.service.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.amil.pre.dojo.service.LogParserService;

public class LogParserServiceTest {
	private static String PATH = System.getProperty("user.dir") + "/resources/test/logPreDojoWithTwoMatchs";

	@Test
	public void parseFileSuccess() {
		LogParserService instance = new LogParserService();
		List<String> result = instance.parseFile(PATH);
		assertTrue(result.size() == 13);
	}
	
	@Test
	public void parseFileFaill() {
		LogParserService instance = new LogParserService();
		List<String> result = instance.parseFile("");
		assertNull(result);
	}

}

package com.amil.pre.dojo.service;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LogParserService {
	
	public List<String >parseFile(String pathFile){
		
		List<String> result = null;
		Path path = Paths.get(pathFile);
		
		try {
			result = Files.readAllLines(path, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}

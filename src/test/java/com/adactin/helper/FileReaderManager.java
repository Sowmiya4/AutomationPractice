package com.adactin.helper;

public class FileReaderManager {
	
	private FileReaderManager() {
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager fr=new FileReaderManager();
		return fr;
	}
	
	public ConfigurationReader getCrInstance() throws Exception {
		ConfigurationReader cr=new ConfigurationReader();
		return cr;
		
	}

}

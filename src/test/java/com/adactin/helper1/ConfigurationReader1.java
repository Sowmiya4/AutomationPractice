package com.adactin.helper1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader1 {
	
	public static Properties p;

	public ConfigurationReader1() throws IOException {
		File f = new File(System.getProperty("user.dir") + "src\\test\\java\\com\\adactin\\properties");
		FileInputStream fis = new FileInputStream(f);
		
		p=new Properties();
		p.load(fis);
	}
	
	public String browsername1() {
		String browser = p.getProperty("browsername");
		return browser;
	}
	
	public String url1() {
		String url = p.getProperty("url");
		return url;
	}
	
	

}

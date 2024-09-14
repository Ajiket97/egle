package com.egle.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	private String filePath;
	public PropUtil(String path){
		this.filePath = path;
	}
       public  String readPropertiesFile(String filePath,String key) {
    	   FileInputStream fis =null;
		try {
			 fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String keyy = prop.getProperty(key);
		return keyy;

	}
}

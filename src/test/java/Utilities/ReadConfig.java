package Utilities;

import java.io.*;
import java.util.Properties;

public class ReadConfig {
	
	Properties pr;
	public ReadConfig()
	{
		try
		{
		File src=new File(".//Configuration//Config.properties");
		FileInputStream fis=new FileInputStream(src);
		pr=new Properties();
		pr.load(fis);
		}
		catch(Exception e)		
		{
			System.out.println("File not fount Exception.......");
		}
	}
	public String getApplicationURL()
	{
		return pr.getProperty("baseurl");
	}
	
	public String getUsername()
	{
		return pr.getProperty("username");
	}
	
	public String getPassword()
	{
		return pr.getProperty("password");
	}
	
}

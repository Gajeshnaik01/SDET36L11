package org.mavenproject.pratice;

import org.testng.annotations.Test;

public class PraticeTest1 {
	

	@Test
	public void test1() {
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		String un=System.getProperty("USERNAME");
		String pwd=System.getProperty("PASSWORD");
		System.out.println("test1 --> PraticeTest1");
		System.out.println("Browser --> "+browser);
		System.out.println("URL --> "+url);
		System.out.println("username --> "+un);
		System.out.println("password --> "+pwd);
		
	}
	
	@Test
	public void test2() {
		
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		
		
	}
	
	
	

}

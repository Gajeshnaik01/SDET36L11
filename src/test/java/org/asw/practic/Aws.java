package org.asw.practic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Aws {

	public static void main(String[] args) throws MalformedURLException {
		//step1
		URL url=new URL("http://43.205.140.202:4444/wd/hub");
		
		//step2 set desired Capablilties
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		
		RemoteWebDriver driver=new RemoteWebDriver(url, cap);
		
		driver.get("https://gmail.com/");
	}

}

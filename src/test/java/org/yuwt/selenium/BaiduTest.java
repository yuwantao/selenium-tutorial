package org.yuwt.selenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

/**
 * Created by yuwt on 2017/3/8.
 */
public class BaiduTest {
	@Test
	public void open_chrome() {
		String workingDir = System.getProperty("user.dir");
		String path = workingDir + File.separator + "chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.baidu.com");
		chromeDriver.close();
	}

	@Test
	public void get_working_dir() {
		String workingDir = System.getProperty("user.dir");
		System.out.println(workingDir);
	}
}

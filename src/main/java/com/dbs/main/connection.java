package com.dbs.main;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class connection {

    public static WebDriver webDriver = null;
    public static String browserType="CHROME";
    public static WebDriver openwebdriver(){
        switch (browserType)
        {
            case "CHROME":
                ChromeOptions chrome = new ChromeOptions();
                chrome.addArguments("start-maximized");
                System.setProperty("webdriver.chrome.driver", constants.chromeExePath);
                webDriver = new ChromeDriver(chrome);
            case "IE":
                // To be developed:
            case "FIREFOX":
                // To be developed :
        }
        return webDriver;

    }

    public static void closewebdriver()
    {
        webDriver.close();
        webDriver.quit();
    }
}

package com.tcs.smokeTests;

import com.dbs.main.connection;
import com.dbs.main.constants;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class loginToApplicationTest {
    public static WebDriver webdriver;
    @Before
    public void setUp() throws Exception {
        webdriver = connection.openwebdriver();
        webdriver.get(constants.applicationurl);
    }

    @After
    public void tearDown() throws Exception {
        connection.closewebdriver();
    }

    @Test
    public void testCaseOne()
    {
        webdriver.manage().window().fullscreen();
        webdriver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        String windowTitle = webdriver.getTitle();
        Assert.assertEquals(windowTitle,"YouTube");
    }
    @Test
    public void testCaseTwo()
    {
        final WebElement search = webdriver.findElement(By.id("search"));
        search.sendKeys("Steve Jobs");
        search.findElement(By.id("search-icon-legacy")).click();


    }
}
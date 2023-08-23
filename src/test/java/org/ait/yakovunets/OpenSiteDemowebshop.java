package org.ait.yakovunets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteDemowebshop {
    WebDriver driver;

    //before
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void OpenDemowebshopTest(){
        System.out.println("Open site!");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

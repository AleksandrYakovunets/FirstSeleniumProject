package org.ait.yakovunets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteTest {

    WebDriver driver;

    //before - setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //driver.navigate().to("https://www.google.com/");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();
    }
    //tests
    @Test
    public void openGoogleTest(){
        System.out.println("Opened google.com");
    }
    //after - tearDown
    @AfterMethod
    public void tearDown(){
        //driver.quit();//all tab
       // driver.close();//1 tab
    }
}

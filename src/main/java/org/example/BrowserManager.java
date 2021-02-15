package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util
{
        public static LoadProperty loadProperty = new LoadProperty();
        public static String BrowserName = loadProperty.getProperty("BrowserName");

        public void setBrowser() {
                if (BrowserName.equalsIgnoreCase("chrome"))
                {
                System.setProperty("webdriver.chrome.driver","src\\test\\resources\\BrowserDriver\\chromedriver.exe");
                driver =new ChromeDriver();
                } else {
                        System.setProperty("webdriver.gecko.driver","");
                                driver = new FirefoxDriver();
                }


                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().deleteAllCookies();
                driver.get(loadProperty.getProperty("url"));
                //driver.get("https://demoqa.com/");
        }
        //public void closeBrowser() {
                //driver.close();}// reusable method to close browser


}

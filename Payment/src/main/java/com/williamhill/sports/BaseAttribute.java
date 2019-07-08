package com.williamhill.sports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseAttribute
{
    protected static WebDriver driver ;

    public BaseAttribute()
    {
        if (driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssamal\\Downloads\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }
    }
}

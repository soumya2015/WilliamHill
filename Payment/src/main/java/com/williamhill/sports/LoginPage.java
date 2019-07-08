package com.williamhill.sports;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseAttribute
{
    private By logon = By.xpath("//span[contains(text(),'Login')]");
    private By uid = By.id("login-form-username");
    private By pwd = By.id("login-form-password");
    private By signin = By.id("login-form-submit-button");

    public void launchWebPage()
    {
        driver.get("https://www.williamhill.com");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    public void clickLogon()
    {
        driver.findElement(logon).click();
    }
    public void logonPage(String userid,String password)
    {
        driver.findElement(uid).sendKeys(userid);
        driver.findElement(pwd).sendKeys(password);
        driver.findElement(signin).click();
    }
}
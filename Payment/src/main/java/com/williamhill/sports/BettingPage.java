package com.williamhill.sports;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class BettingPage extends BaseAttribute
{
    private By Football= By.xpath("//a[@class='tabs__nav-item'][contains(text(),'Football')]");
    private By Betselect=By.xpath("//button[@id='OB_OU2445475862']//span[@class='betbutton__odds']");
    private By Inputbet=By.xpath("//input[starts-with(@id,'stake-input__24454')]");
    private By Cookies=By.xpath("//*[@id=\"toolbar\"]/div[1]/div/button");
    private By toReturn = By.xpath("//div[@class='betslip-footer__to-return-price-container']");
    private By totalStake = By.xpath("//div[@class='betslip-footer__total-stake-price-container']");
    //button[@class='cookie-disclaimer__button']

    public void gotoFootBall()
    {
        driver.findElement(Football).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Cookies).click();
    }
    public  void selectBet()
    {
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(Betselect).click();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    public void placeBet(String xxx)
    {
        driver.findElement(Inputbet).sendKeys(xxx);
    }

    public void stakeAndReturn()
    {
        Assert.assertEquals("£ 0.05",driver.findElement(totalStake).getText());
        Assert.assertTrue(!(driver.findElement(toReturn).getText()).isEmpty());
    }


}


package com.williamhill.sports;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PlaceBet
{

    private LoginPage loginPage;
    private BettingPage bettingPage;

    public  PlaceBet()
    {
       loginPage=new LoginPage();
       bettingPage=new BettingPage();
    }
    @Given("^that i am on the sports\\.williamhill\\.com/sr-admin-set-white-list-cookie\\.html website$")
    public void that_i_am_on_the_sports_williamhill_com_sr_admin_set_white_list_cookie_html_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        loginPage.launchWebPage();
    }

    @When("^I click on login page$")
    public void i_click_on_login_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        loginPage.clickLogon();
    }

    @When("^I log on with my userid \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_log_on_with_my_userid_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        loginPage.logonPage(arg1,arg2);
    }

    @Then("^navigate to a Premiership football event$")
    public void navigate_to_a_Premiership_football_event() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        bettingPage.gotoFootBall();
    }

    @When("^I click on select betting value$")
    public void i_click_on_select_betting_value() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        bettingPage.selectBet();
    }

    @When("^under Bet slip I put \"([^\"]*)\" pound$")
    public void under_Bet_slip_I_put_pound(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        bettingPage.placeBet(arg1);
    }

    @Then("^total Stake and return is calculated$")
    public void total_Stake_and_return_is_calculated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
        bettingPage.stakeAndReturn();
    }

}

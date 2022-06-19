package my_proj_bdd.steps;

import my_proj_bdd.pages.HerokuLoginPage;
import my_proj_bdd.pages.LoginPage;
import my_proj_bdd.testBase.TestBase;
import cucumber.api.java.en.Given; // situatia intitiala
import cucumber.api.java.en.Then; // concluzia finala, ce vrei sa verifici
import cucumber.api.java.en.When; // pasii intermediari

public class HerokuLoginSteps extends TestBase  {

    HerokuLoginPage loginPage = new HerokuLoginPage(driver);

    @Given("Login: I am on the Heroku Login page URL (.*)$")
    public void open_home_page(String url) {
        loginPage.openPage(url);
    }

    @When("Login: I enter user (.*)$")
    public void input_user(String user) {
        loginPage.inputUser(user);
    }

    @When("Login: I enter password (.*)$")
    public void input_pass(String password) {
        loginPage.inputPass(password);
    }

    @When("Login: When i click log in btn")
    public void click_log_in_btn() {
        loginPage.clickLogInBtn();
    }

    @When("Login: I click close btn")
    public void click_close_btn() throws InterruptedException {loginPage.clickCloseBtn();}

    @Then("Login: Message is displayed (.*)$")
    public void mssg_is_displayed(String msg){
        loginPage.verifyMessage(msg);
    }

    @Then("Login: Message is Not displayed")
    public void mssg_is_not_displayed(){
        loginPage.verifyMessageIsNotDisplayed();
    }
}

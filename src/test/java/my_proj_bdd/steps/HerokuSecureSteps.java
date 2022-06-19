package my_proj_bdd.steps;

import my_proj_bdd.pages.HerokuLoginPage;
import my_proj_bdd.pages.HerokuSecurePage;
import my_proj_bdd.pages.LoginPage;
import my_proj_bdd.testBase.TestBase;
import cucumber.api.java.en.Given; // situatia intitiala
import cucumber.api.java.en.Then; // concluzia finala, ce vrei sa verifici
import cucumber.api.java.en.When; // pasii intermediari

public class HerokuSecureSteps extends TestBase  {
    HerokuSecurePage secure = new HerokuSecurePage(driver);

    @When("Secure: When i click log out btn")
    public void click_log_out_btn(){
        secure.clickLogOtBtn();
    }
}

package my_proj_bdd.steps;

import my_proj_bdd.pages.LoginPage;
import my_proj_bdd.testBase.TestBase;
import cucumber.api.java.en.Given; // situatia intitiala
import cucumber.api.java.en.Then; // concluzia finala, ce vrei sa verifici
import cucumber.api.java.en.When; // pasii intermediari

public class LoginSteps extends TestBase {

    LoginPage loginPage = new LoginPage(driver);

    // step definition
    // se foloseste sintaxa gherkin: given, when, then (and, but)
    //given = deschidem pagina
    //when = pasii intermediari ce ii face un user
    //then = verificarile finale
    @Given("Login: I am on the Login page URL (.*)$")
    public void open_home_page(String url) {
        loginPage.openPage(url);
    }

    @When("Login: I enter email (.*)$")
    public void input_email(String email) {
        loginPage.inputEmail(email);
    }

    @When("Login: I login with valid credentials")
    public void valid_login() {
        loginPage.inputEmail("abc");
        loginPage.inputPass("123");
        loginPage.clickLogInBtn();

        // sau
        // loginPage.login("abc", "pass");
    }
    @When("Login: When i clik forgot password link")
    public void clik_forgot_pass_link() {
        loginPage.clickForgotPassLink();
    }


    @Then("Login: Following error is displayed (.*)$")
    public void verify_error(String error) {
        loginPage.verifyError(error);
    }
}

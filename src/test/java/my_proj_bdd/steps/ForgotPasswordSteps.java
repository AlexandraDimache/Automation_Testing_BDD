package my_proj_bdd.steps;

import my_proj_bdd.pages.ForgotPasswordPage;
import my_proj_bdd.testBase.TestBase;
import my_proj_bdd.testBase.TestBase;
import cucumber.api.java.en.Given; // situatia intitiala
import cucumber.api.java.en.Then; // concluzia finala, ce vrei sa verifici
import cucumber.api.java.en.When; // pasii intermediari

public class ForgotPasswordSteps extends TestBase {
    //1.aici facem legatura cu pagina corecta

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);

    //given exista doar pe pagina principala,pe pagina de pornire,restul o sa aiba doar when si then
    //2.implementam pasii pentru when

    @When("Forgot Pass: I enter email (.*)$")
    public void input_email(String email) {
       forgotPasswordPage.inputEmail(email);
    }
    //3.implementam verificarile (verificarile se fac tot timpul cu THEN )

    @Then("Forgot Pass: Button is disabled and error is displayed and correct ")
    public void verify_button_and_error() {
        //verificam ca butonul nu e activ
       forgotPasswordPage.verifySendEmailButtonEnabled();
       //verificam ca eroarea este vizibila
        forgotPasswordPage.verifyErrorDisplayed();
        //verificam ca mesajul erorii este corect
        forgotPasswordPage.verifyErrorMessageIsCorrect();
    }

    @Then("Forgot Pass: Button is enabled and error is not displayed ")
    public void verify_button_is_enabled_and_no_error() {
        //verificam ca butonul e activ
        forgotPasswordPage.verifySendEmailButtonEnabled();
        //verificam ca mesajul de eroare nu este vizibil
        forgotPasswordPage.verifyErrorNotDisplayed();

    }

}

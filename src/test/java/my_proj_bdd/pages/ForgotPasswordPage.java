package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ForgotPasswordPage extends BasePage {
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    //1.gasesti elementele cu  care vrei sa interactionezi
    // ELEMENTE private
    @FindBy(xpath = "//input[@placeholder='Enter your email']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@data-test-id='login-button']")
    private WebElement sendEmailBtn;

    @FindBy(xpath = "//p[text()='Please enter a valid email address!']")
    private List<WebElement> invalid_email_error_list;

    //metode sa interactionam cu elementele

    public void inputEmail(String user_email) {
        //scriem email in email input
        emailInput.sendKeys(user_email);
    }

    public void clicksendEmailBtn() {
        //dam click pe send email button
        sendEmailBtn.click();
    }

    //verificare
    public void verifySendEmailButtonEnabled() {
        //verificam ca butonul este activ
        Assert.assertTrue("Butonul nu este activ", sendEmailBtn.isEnabled());
    }

    public void verifySendEmailButtonNotEnabled() {
        //verificam ca butonul nu este activ
        Assert.assertFalse("Butonul este activ", sendEmailBtn.isEnabled());
    }

    //verificam textul de pe un element
    public void verifySendEmailText() {
        String excepted = "Send Email";//ce credem noi
        String actual = sendEmailBtn.getText();//ce ne da sistemul
        Assert.assertEquals("Textul de pe buton este gresit", excepted, actual);
    }

    //verificam ca eroarea este afisara
    public void verifyErrorDisplayed() {
        Assert.assertTrue("Eroarea nu este afisata", invalid_email_error_list.size() == 1);
    }
    //verificam ca eroarea NU este afisara
    public void verifyErrorNotDisplayed() {
        Assert.assertTrue("Eroarea este afisata in mod eronat", invalid_email_error_list.size() == 0);
    }


    public void verifyErrorMessageIsCorrect() {
        String excepted = "Please enter a valid email adress";//ce credem noi
        String actual =invalid_email_error_list.get(0).getText();//ce ne da sistemul
        Assert.assertEquals("Mesaj invalid pentru email invalid", excepted, actual);

    }
}

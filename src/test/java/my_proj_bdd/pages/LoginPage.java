package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //1.gasesti elementele cu  care vrei sa interactionezi dupa modelul e mai jos

    // ELEMENTE private
    @FindBy(xpath = "//input[@placeholder='Enter your email']")
    private WebElement emailInput;

    // dupa partial text
    @FindBy(xpath = "//p[contains(text(), 'Please enter a valid email address!')]")
    private List<WebElement> error_list;

    // locator/selector unic, folosind xpath, in functie de tip/atribut/valoare
    @FindBy(xpath = "//input[@placeholder='Enter your password']")
    private WebElement passInput;

    @FindBy(xpath = "//span[contains(text(), 'Log in')]")
    private WebElement logInBtn;

    //forgot password
    // locator/selector unic, folosind xpath, in functie de textul de pe element
    @FindBy(xpath = "//a[text()='Forgot password?']")
    private WebElement forgotPassLink;

    //2.interactionezi cu elementele folosind metode

    // SMALL STEPS
    // metode prin care interactionam cu elem
    public void inputEmail(String user_email){
        emailInput.sendKeys(user_email);
    }

    public void inputPass(String pass) {
        passInput.sendKeys(pass);
    }

    // dam click pe forgot pass ( in general pt click nu ne trebuie parametru)
    public void clickForgotPassLink() {
        forgotPassLink.click();
    }

    public void clickLogInBtn() {
        logInBtn.click();
    }

    public void verifyError(String expected) {
        String actual = error_list.get(0).getText();
        // sa fie afisata , daca lista are un element rezulta ca eroarea e afisata
        Assert.assertTrue("Error is NOT displayed", error_list.size()==1);
        // sa fie textul corect
        Assert.assertEquals("Not the expected error", expected, actual);
    }

    public void verifyErrorNotDisplayed() {
        // sa nu fie afisata , adica sa  aiba dimensiunea 0
        Assert.assertTrue("Error displayed wrongly", error_list.size() == 0);
    }
}

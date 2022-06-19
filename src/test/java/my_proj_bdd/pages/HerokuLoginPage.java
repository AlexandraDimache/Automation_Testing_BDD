package my_proj_bdd.pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HerokuLoginPage extends BasePage {
    public HerokuLoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='username']")
    private WebElement userInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement logInBtn;

    @FindBy(xpath = "//div[@id='flash']")
    private WebElement message;

    @FindBy(xpath = "//div[@id='flash']")
    private List<WebElement> messageList;

    @FindBy(xpath = "//a[@class='close']")
    private WebElement closeBtn;

    public void verifyMessage(String expected) {
        String actual = message.getText();
        // sa fie afisata , daca lista are un element rezulta ca eroarea e afisata
        Assert.assertTrue("Message is NOT displayed", message.isDisplayed());
        // sa fie textul corect
        Assert.assertTrue("Not the expected message",  actual.contains(expected));
    }
    public void verifyMessageIsNotDisplayed(){

        Assert.assertTrue("Message is displayed" , messageList.size()==0);
    }


    public void inputUser(String user){
        userInput.sendKeys(user);
    }
    public void inputPass(String pass){ passInput.sendKeys(pass);}
    public void clickLogInBtn() {
        logInBtn.click();
    }
    public void clickCloseBtn() throws InterruptedException {
        closeBtn.click();
        Thread.sleep(500);
    }






}

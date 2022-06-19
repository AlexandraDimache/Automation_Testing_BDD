package my_proj_bdd.pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HerokuSecurePage extends BasePage {
    public HerokuSecurePage(WebDriver driver) {
        super(driver); }
    @FindBy(xpath = "//a[@href='/logout']")
    private WebElement logOutBtn;

    public void clickLogOtBtn() {
        logOutBtn.click();
    }

}

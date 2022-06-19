package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private WebDriver driver;

    // inititializam webdriver
    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // metode comune
    public void openPage(String url) {
        driver.get(url);
    }

    // metode comune
    public void verifyPageUrl(String expected_url) {
        String actual_url = driver.getCurrentUrl();
        Assert.assertEquals("Url is not as expected", expected_url, actual_url);
    }
}

package Base;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseSetup {

    private WebDriver webDriver;

    public BaseSetup() {
        setUp();
        pageLoad();
    }

    public WebDriver getWebDriver() {
        return this.webDriver;
    }

    public void pageLoad() {
        webDriver.get("https://the-internet.herokuapp.com/");
    }

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\manager\\IdeaProjects\\herokuApp\\src\\test\\resources\\chromedriver.exe");

        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    public void tearDown(){
        getWebDriver().close();
    }

    public void waitElement() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void goToPreviousPage(){
        webDriver.navigate().back();
    }

}

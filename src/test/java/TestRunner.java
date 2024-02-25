import AvailableExamples.AddRemoveElements.AddRemoveElementsActions;
import AvailableExamples.BasicAuth.BasicAuthActions;
import Base.BaseSetup;
import jdk.jfr.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.How.CSS;


public class TestRunner {

    @Description("Add/Remove Element Page Test : Tests adding and removing an element using pertaining buttons.")
    @Test
    public void addRemoveElementTest() throws InterruptedException {
        AddRemoveElementsActions addRemoveElementsActions = new AddRemoveElementsActions();

        addRemoveElementsActions.getWebDriver().findElement(By.cssSelector("#content > ul > li:nth-child(2) > a")).click();
        addRemoveElementsActions.waitElement();
        addRemoveElementsActions.addElement();
        addRemoveElementsActions.waitElement();
        addRemoveElementsActions.deleteElement();
        addRemoveElementsActions.waitElement();
        addRemoveElementsActions.goToPreviousPage();
        addRemoveElementsActions.tearDown();
        addRemoveElementsActions.waitElement();
    }


    @Description("Basic Auth Page Test : Tests user login via popup with valid credentials")
    @Test
    public void basicAuth_ValidTest() throws InterruptedException {
        BasicAuthActions basicAuthActions  = new BasicAuthActions();
        basicAuthActions.getWebDriver().findElement(By.cssSelector("#content > ul > li:nth-child(3) > a")).click();
        basicAuthActions.goToBasicAuthPage();
    }


    @Description("Basic Auth Page Test : Tests user login via popup with invalid credentials")
    @Test
    public void basicAuth_InvalidTest(){}
}


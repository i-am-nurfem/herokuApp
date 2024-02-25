package AvailableExamples.BasicAuth;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BasicAuthPageElements {

    @FindBy(how = How.CSS, using = "")
    public WebElement usernameBox;

    @FindBy(how = How.CSS, using = "")
    public WebElement passwordBox;

    @FindBy(how = How.CSS, using = "")
    public WebElement loginButton;

    @FindBy(how = How.CSS, using = "")
    public WebElement cancelButton;
}

package AvailableExamples.AddRemoveElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.How.CSS;

public  class AddRemoveElementsPageElements {

    @FindBy(how = CSS, using = "#content > div > button")
    public WebElement addElementButton;

    @FindBy(how = CSS, using = "#elements > button")
    public WebElement deleteButton;

}

package AvailableExamples.AddRemoveElements;

import Base.BaseSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.How.CSS;


public class AddRemoveElementsActions extends BaseSetup {

    AddRemoveElementsPageElements addRemoveElementsPageElements = new AddRemoveElementsPageElements();

    public AddRemoveElementsActions(){
        super();
        PageFactory.initElements(super.getWebDriver(), addRemoveElementsPageElements);
    }

    public void addElement(){
        addRemoveElementsPageElements.addElementButton.click();
    }

    public void deleteElement(){
        addRemoveElementsPageElements.deleteButton.click();

    }
}

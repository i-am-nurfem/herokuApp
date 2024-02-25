package AvailableExamples.BasicAuth;

import Base.BaseSetup;

public class BasicAuthActions extends BaseSetup {

    public void goToBasicAuthPage() throws InterruptedException {
        super.waitElement();
        super.getWebDriver().get("http://admin:admin@the-internet.herokuapp.com");
        super.waitElement();
        super.goToPreviousPage();
        super.tearDown();
    }

}

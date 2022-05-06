package org.example.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CreateAnEngagementPage extends PageObject {

    public void triggerClick(String trigger) {

        WebElement ele = getDriver().findElement(By.xpath("//*[text()='"+trigger+"']"));
        ele.click();
    }

    public void getElementText(String text) {
        List<WebElement> listOfItems= getDriver().findElements(By.className("mat-title"));

        for (int s=1; s<listOfItems.size(); s++)
        {
            if(listOfItems.get(s).getText().equals(text)) {
                Assert.assertEquals(text, listOfItems.get(s).getText());
            }
        }
    }

    public void buttonEnabled() {
        List<WebElement> listOfButtons= getDriver().findElements(By.className("mat-button-wrapper"));

        for (int s=1; s<=listOfButtons.size(); s++)
        {
            if(s==3) {
                Assert.assertTrue(listOfButtons.get(s).isEnabled());
            }
        }
    }
}

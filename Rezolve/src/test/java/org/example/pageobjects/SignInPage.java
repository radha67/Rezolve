package org.example.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://create.rezolve.com/engagement-creation/")
public class SignInPage extends PageObject {

    @FindBy(className = "sign-in")
    static
    WebElementFacade signIn;

    @FindBy(name = "username")
    static
    WebElementFacade userName;

    @FindBy(name = "password")
    static
    WebElementFacade password;

    @FindBy(name = "action")
    static
    WebElementFacade signInButton;

    public static void setSignInLink() {
        signIn.click();
    }

    public static void signIn() {
        userName.sendKeys("radha111@gmail.com");
        password.sendKeys("abcd1234!");
        signInButton.click();
    }
}
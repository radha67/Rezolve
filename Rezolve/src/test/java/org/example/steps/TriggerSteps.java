package org.example.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.example.pageobjects.CreateAnEngagementPage;
import org.example.pageobjects.SignInPage;

public class TriggerSteps extends ScenarioSteps {

    SignInPage signInPage;
    CreateAnEngagementPage createAnEngagementPage;

    @Step
    public void openURL() {
        signInPage.open();
    }

    @Step
    public void signInLink() {
       SignInPage.setSignInLink();
    }

    @Step
    public void signIn() {
        SignInPage.signIn();
    }

    @Step
    public void triggerClick(String trigger) {
        createAnEngagementPage.triggerClick(trigger);
    }

    @Step
    public void getElementText(String text) {
        createAnEngagementPage.getElementText(text);
    }

    @Step
    public void buttonEnabled() {
        createAnEngagementPage.buttonEnabled();
    }
}

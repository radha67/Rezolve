package org.example.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.TriggerSteps;
import org.openqa.selenium.WebDriver;

public class StepDefs {

    @Managed
    WebDriver driver;

    @Steps
    TriggerSteps triggerSteps;

    @Given("^user is on Welcome to the Rezolve Experience Platform page$")
    public void user_is_on_Welcome_to_the_Rezolve_Experience_Platform_page() {
        triggerSteps.openURL();
    }

    @When("^login with valid credentials$")
    public void validCredentials() {
        triggerSteps.signIn();
    }

    @When("^user click on Sign-In link$")
    public void user_click_on_Sign_In_link() {
        triggerSteps.signInLink();
    }

    @Given("^User is on Create an Engagement page$")
    public void user_is_on_Create_an_Engagement_page() {
    }

    @When("^User click \"([^\"]*)\"$")
    public void user_click(String trigger) {
        triggerSteps.triggerClick(trigger);
    }

    @Then("^user can see \"([^\"]*)\"$")
    public void user_can_see(String text) {
        triggerSteps.getElementText(text);
    }

    @Then("^Browse for images button enabled$")
    public void browse_for_images_button_enabled() {
        triggerSteps.buttonEnabled();
    }

    @Then("^Browse for audio files button enabled$")
    public void browse_for_audio_files_button_enabled() {
        triggerSteps.buttonEnabled();
    }
}
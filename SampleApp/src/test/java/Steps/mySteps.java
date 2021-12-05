package Steps;

import Method.sampleMethods;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;


public class mySteps {

    sampleMethods sampleMethods = new sampleMethods();
    private static final Logger LOGGER = LoggerFactory.getLogger(mySteps.class);

    @Given("^I start the application$")
    public void navigeToTheMobileApp() throws MalformedURLException {
        sampleMethods.initializeTest();
    }


    @Then("^I close ad with coordinates$")
    public void closeAd() throws Throwable {
        sampleMethods.closeAd();
    }
    @Then("^I close ad if exists$")
    public void closeAdAlternative() throws Throwable {
        sampleMethods.closeAdAlternative();
    }
    @Then("^I close ad with right coordinates$")
    public void closeAdRight() throws Throwable {
        sampleMethods.closeAdRight();
    }

    @And("^I skip intro page$")
    public void SkipIntroPages() throws InterruptedException {
        sampleMethods.SkipIntroPages();
    }

    @Then("^I click categories$")
    public void GoToCategories() throws InterruptedException {
        sampleMethods.GoToCategories();
    }

    @Given("^I check elements in the first page$")
    public void checkElementsFirst() throws InterruptedException {
        sampleMethods.checkElementsFirst();
    }

    @Given("^I check elements in the second page$")
    public void checkElementsSecond() throws InterruptedException {
        sampleMethods.checkElementsSecond();
    }

    @Given("^I check elements in the third page$")
    public void checkElementsThird() throws InterruptedException {
        sampleMethods.checkElementsThird();
    }

    @Then("^I check elements in the home page$")
    public void checkElementsHome() throws InterruptedException {
        sampleMethods.checkElementsHome();
    }

    @Then("^I check elements in categories page$")
    public void catPageCheck() throws InterruptedException {
        sampleMethods.catPageCheck();
    }

    @Then("^I swipe until category dogs is seen$")
    public void swipeUntilDogs() throws InterruptedException {
        sampleMethods.swipeUntilDogs();
    }

    @Then("^I click my works$")
    public void GoToMyWorks() throws InterruptedException {
        sampleMethods.GoToMyWorks();
    }

    @Given("^I check elements in my works$")
    public void checkMyWorks() throws InterruptedException {
        sampleMethods.checkMyWorks();

    }@Then("^I click others$")
    public void GoToOthers() throws InterruptedException {
        sampleMethods.GoToOthers();
    }

    @Given("^I check elements in others$")
    public void checkOthers() throws InterruptedException {
        sampleMethods.checkOthers();
    }
    @And("^I change language to Danish$")
    public void changeLangDanish() throws InterruptedException {
        sampleMethods.changeLangDanish();
    }
}

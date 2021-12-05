package Method;

import Steps.mySteps;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import elementsSample.elementsSample;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;


public class sampleMethods extends configAbstract {
    private static final Logger LOGGER = LoggerFactory.getLogger(mySteps.class);



    public void initializeTest() throws MalformedURLException {
        initializeTest2();
    }

    public void closeAd() throws InterruptedException {
        untilElementAppear(elementsSample.adPage);
        TouchAction touchAction=new TouchAction(driver);
        touchAction.tap(103, 103).perform();
    }
    public void closeAdRight() throws InterruptedException {
        while (isElementExist(elementsSample.testAd, 3)) {
            TouchAction touchAction=new TouchAction(driver);
            touchAction.tap(1011, 67).perform();
        }
    }
        public void closeAdAlternative() throws InterruptedException {
            if (isElementExist(elementsSample.closeAddBtnAlternate, 5)) {
                click(elementsSample.closeAddBtnAlternate);
                untilElementAppear(elementsSample.catBtn);
            }
        }

    public void SkipIntroPages() throws InterruptedException {

        untilElementAppear(elementsSample.skipBtn);
        click(elementsSample.skipBtn);

    }public void GoToCategories() throws InterruptedException {
        click(elementsSample.catBtn);
        untilElementAppear(elementsSample.happyNewYear);

    }

    public void checkElementsFirst() {
             untilElementAppear(elementsSample.skipBtn);
             untilElementAppear(elementsSample.relaxText);
             untilElementAppear(elementsSample.backgroundImage);

}
public void checkElementsSecond() {
        untilElementAppear(elementsSample.beCreativeText);
        untilElementAppear(elementsSample.skipBtn);
        untilElementAppear(elementsSample.beCreativeText);
        untilElementAppear(elementsSample.unleashText);
        untilElementAppear(elementsSample.backgroundImage);

    }public void checkElementsThird() {
        untilElementAppear(elementsSample.fabPalDetail);
        untilElementAppear(elementsSample.fabPalettes);
        untilElementAppear(elementsSample.skipBtn);
        untilElementAppear(elementsSample.backgroundImage);

    }public void checkElementsHome() {
        untilElementAppear(elementsSample.sliderImage);
        untilElementAppear(elementsSample.pagerIndicator);
        untilElementAppear(elementsSample.crownIcon);
        untilElementAppear(elementsSample.homeBtn);
        untilElementAppear(elementsSample.othersBtn);
        untilElementAppear(elementsSample.myWork);
        untilElementAppear(elementsSample.catBtn);

    }
    public void catPageCheck() {
        untilElementAppear(elementsSample.catTitle);
        untilElementAppear(elementsSample.mandala);
        untilElementAppear(elementsSample.people);
        untilElementAppear(elementsSample.winter);
        untilElementAppear(elementsSample.catBtn);

    }
    public void swipeUntilDogs() {
        Dimension size = driver.manage().window().getSize();
        int width = (int) (size.width / 2);
        int startPoint = (int) (size.getHeight() * 0.70);
        int endPoint = (int) (size.getHeight() * 0.20);
        int duration = 2000;

        while (!isElementExist(elementsSample.dogs, 3)) {
            driver.swipe(533, 1863, 533, 234, 2000);
        }
    }
        public void GoToMyWorks() throws InterruptedException {
            click(elementsSample.myWork);
            untilElementAppear(elementsSample.emptyWorks);

        }
            public void checkMyWorks() throws InterruptedException {
                untilElementAppear(elementsSample.myWorksTitle);
                untilElementAppear(elementsSample.myWork);
                untilElementAppear(elementsSample.myWorksTitle);
                untilElementAppear(elementsSample.startPaintingBtn);
                untilElementAppear(elementsSample.emptyWorks);
    }
    public void checkOthers() throws InterruptedException {
        untilElementAppear(elementsSample.limitedAccessText);
        untilElementAppear(elementsSample.freeAccText);
        untilElementAppear(elementsSample.appLanguage);
        untilElementAppear(elementsSample.rateApp);
        untilElementAppear(elementsSample.termsAndPrivacy);
    }
    public void GoToOthers() throws InterruptedException {
        click(elementsSample.othersBtn);
        untilElementAppear(elementsSample.limitedAccessText);

    }
    public void changeLangDanish() throws InterruptedException {
            click(elementsSample.langEng);
            closeAdRight();
            untilElementAppear(elementsSample.catBtn);
            untilElementAppear(elementsSample.langEng);
            click(elementsSample.langDanish);
            untilElementAppear(elementsSample.freeAccTextDanish);
        }

    }





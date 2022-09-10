package selenide.mobile;

import com.codeborne.selenide.Condition;
import com.pages.mobile.HomePage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.page;

class ApiDemosAndroidTest extends AndroidTestSetUp {

    @Test
    void androidTest(){
        page(HomePage.class).clickViews()
                .getControlsElement().shouldHave(Condition.visible);
        //this assertion could have been written on page layer directly
        // just for readability I am asserting in test class
        // page(HomePage.class).clickViews().checkControlElementIsVisible();
    }
}

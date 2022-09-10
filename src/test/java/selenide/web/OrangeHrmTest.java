package selenide.web;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.pages.LoginPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

class OrangeHrmTest {

    @Test
    void test(){
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        SelenideElement element = page(LoginPage.class).login().fillEmployeeDetails();
        element.shouldHave(Condition.text("Freelancer"));
    }
}

package selenide.mobile;

import com.codeborne.selenide.Condition;
import com.pages.mobile.IosHomePage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.page;

class IosAppTest extends IosTestSetUp{

    @Test
    void testIosApp(){
        page(IosHomePage.class).calculateSum().shouldHave(Condition.text("10"));
    }
}

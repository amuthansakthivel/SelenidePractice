package selenide.mobile;

import com.codeborne.selenide.WebDriverRunner;
import com.drivermanager.AndroidDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;

public class AndroidTestSetUp {

    @BeforeEach
    public void setUp(){
        DesiredCapabilities caps = new DesiredCapabilities();
        WebDriverRunner.setWebDriver(new AndroidDriverManager().createDriver(caps));
        open();
    }
}

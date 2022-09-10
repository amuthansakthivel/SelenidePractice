package selenide.mobile;

import com.codeborne.selenide.WebDriverRunner;
import com.drivermanager.IosDriverManager;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;

public class IosTestSetUp {

    @BeforeEach
    public void setUp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPod touch (7th generation)");
        WebDriverRunner.setWebDriver(new IosDriverManager().createDriver(capabilities));
        open();
    }
}

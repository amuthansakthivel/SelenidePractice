package com.drivermanager;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class IosDriverManager implements WebDriverProvider {

    static {
        Configuration.browserSize = null;
        Configuration.browser = AndroidDriverManager.class.getName();
    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        XCUITestOptions options = new XCUITestOptions(capabilities);
        options.setApp(System.getProperty("user.dir")+"/TestApp-iphonesimulator.app");
        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}

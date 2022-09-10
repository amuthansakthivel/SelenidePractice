package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.utils.PageActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    @FindBy(name = "username")
    private WebElement searchBox;

    private static final String PASSWORD = "input[name='password']";
    private static final String LOGIN_BUTTON = "//button[@type='submit']";

    public HomePage login(){
        PageActions.perform($(searchBox).shouldBe(Condition.visible, Duration.ofSeconds(20)), e->e.setValue("Admin"));
        PageActions.perform($(PASSWORD).shouldBe(Condition.editable), e->e.setValue("admin123"));
        PageActions.perform($x(LOGIN_BUTTON).shouldBe(Condition.visible), SelenideElement::click);
        return page(HomePage.class);
    }
}

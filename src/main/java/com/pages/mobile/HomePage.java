package com.pages.mobile;

import com.codeborne.selenide.SelenideElement;
import com.utils.PageActions;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    @iOSXCUITFindBy(accessibility = "//*[@value='Email Address']")
    @AndroidFindBy(accessibility = "Animation")
    private SelenideElement animation;

    @AndroidFindBy(accessibility = "Controls")
    private SelenideElement controls;

    private static final String VIEWS = "//*[@text='Views']";
    private static final String WEB_VIEW_3 = "//*[@text='WebView3']";

    public void clickAnimation(){
        PageActions.perform(animation.shouldBe(visible), SelenideElement::click);
    }

    public HomePage clickViews(){
        PageActions.perform($x(VIEWS).shouldBe(visible),SelenideElement::click);
        return this;
    }

    public void clickWebView3(){
        PageActions.perform($x(WEB_VIEW_3),SelenideElement::click);
    }

    public SelenideElement getControlsElement(){
        return controls;
    }
}

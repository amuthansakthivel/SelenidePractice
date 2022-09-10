package com.pages.mobile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.utils.PageActions;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class IosHomePage {

    @iOSXCUITFindBy(accessibility = "IntegerA")
    private SelenideElement integerA;

    @iOSXCUITFindBy(accessibility = "IntegerB")
    private SelenideElement integerB;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"Compute Sum\" AND name == \"Compute Sum\"")
    private SelenideElement calculateSum;

    @iOSXCUITFindBy(accessibility = "Answer")
    private SelenideElement answer;

    public SelenideElement calculateSum(){
        PageActions.perform(integerA.shouldBe(Condition.visible), e->e.setValue("4"));
        PageActions.perform(integerB.shouldBe(Condition.visible),e->e.setValue("6"));
        PageActions.perform(calculateSum,SelenideElement::click);
        return answer.shouldBe(Condition.visible);
    }

}

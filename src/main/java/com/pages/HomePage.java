package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.utils.PageActions;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {

    private static final String EMPLOYEE_NAME = "//input[@placeholder='Type for hints...']";
    private static final String EMPLOYEE_STATUS = "//div[text()='-- Select --']";
    private static final String FREELANCE = "//*[text()='Freelance']";

    public SelenideElement fillEmployeeDetails(){
        PageActions.perform($x(EMPLOYEE_NAME).shouldBe(Condition.visible), e->e.setValue("amuthan"));
        PageActions.perform($x(EMPLOYEE_STATUS).shouldBe(Condition.visible), SelenideElement::click);
        PageActions.perform($x(FREELANCE).shouldBe(Condition.visible), SelenideElement::click);
        return $x(FREELANCE);
    }
}

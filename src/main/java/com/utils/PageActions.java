package com.utils;

import com.codeborne.selenide.SelenideElement;

import java.util.function.Consumer;

public final class PageActions {
    private PageActions(){}

    public static void perform(SelenideElement element, Consumer<SelenideElement> elementConsumer){
        elementConsumer.accept(element);
        //use this space for logging success event to reports
    }
}

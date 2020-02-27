package com.firestarters.steps;

import com.firestarters.page.AccountPage;
import com.firestarters.page.CheckoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class AccountSteps {

    @Steps
    CheckoutPage checkoutPage;

    @Step
    public void checkoutAsUser(){
        checkoutPage.clickOnContinueButtonFromBilling();
        checkoutPage.clickOnContinueButtonFromShipping();
        checkoutPage.clickOnShippingRadioButton();
        checkoutPage.clickOnShippingMethodContinueButton();
        checkoutPage.clickOnPaymentContinueButton();
        checkoutPage.clickOnPlaceOrderButton();
    }






}

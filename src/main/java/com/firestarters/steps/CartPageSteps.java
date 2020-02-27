package com.firestarters.steps;

import com.firestarters.page.CartPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;

public class CartPageSteps {

    CartPage cartPage;

    @Step
    public void proceedToCheckout(){
        assertEquals(2, cartPage.getNumberOfElementsFromCartProductsList());
        cartPage.proceedToCheckout();
    }

}


package com.firestarters.steps;

import com.firestarters.page.CartPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CartPageSteps {

    CartPage cartPage;

    //Ciuverca Ionut
    @Step
    public void proceedToCheckout(){
        assertEquals(2, cartPage.getNumberOfElementsFromCartProductsList());
        cartPage.proceedToCheckout();
    }

    public void verifyIfProductTableIsDisplayed(){
        assertTrue(cartPage.getProductTable().isDisplayed());
    }

}


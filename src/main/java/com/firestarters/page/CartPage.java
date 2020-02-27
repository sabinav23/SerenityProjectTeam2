package com.firestarters.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends  AbstractPage{

    @FindBy(css = "#shopping-cart-table > tbody tr")
    private List<WebElementFacade> cartProductsList;

    @FindBy(css = ".button[title*='Proceed']")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css = "#shopping-cart-table > tbody")
    private WebElementFacade listOfProductsInCart;


  //Ciuverca Ionut
    public int getNumberOfElementsFromCartProductsList(){

        return cartProductsList.size();
    }

   //Ciuverca Ionut
    public void proceedToCheckout(){
        proceedToCheckoutButton.click();
    }


}

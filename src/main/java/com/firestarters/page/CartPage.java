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
    @FindBy(css = ".product-cart-actions .link-wishlist")
    private WebElementFacade wishlistBtnInCart;
    @FindBy(css=".success-msg")
    private WebElementFacade successMsgAddedInWishlist;


  //Ciuverca Ionut
    public int getNumberOfElementsFromCartProductsList(){

        return cartProductsList.size();
    }

   //Ciuverca Ionut
    public void proceedToCheckout(){
        proceedToCheckoutButton.click();
    }


    public WebElementFacade getWishListBtnInCart(){
        return wishlistBtnInCart;
    }
    public WebElementFacade getSuccessMsgAddedInWishlist(){
        return successMsgAddedInWishlist;
    }

}

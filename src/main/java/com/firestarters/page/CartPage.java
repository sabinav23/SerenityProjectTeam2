package com.firestarters.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends  AbstractPage{

    @FindBy(css = "#shopping-cart-table > tbody tr")
    private List<WebElementFacade> cartProductsList;

    @FindBy(css = ".button[title*='Proceed']")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css = "#shopping-cart-table > tbody")
    private WebElementFacade listOfProductsInCart;

    //Agota
    @FindBy(css="#shopping-cart-table>tbody>tr>td[class='product-cart-price']")
    private List<WebElementFacade> listOfProductPricesInCart;
    @FindBy(css ="#shopping-cart-table>tbody>tr>td[class='product-cart-actions']>input")
    private List<WebElementFacade> listOfProductQtysInCart;
    @FindBy(css="#shopping-cart-table>tbody>tr>td[class='product-cart-actions']>button")
    private List<WebElementFacade> listOfProductUpdateButtonsToChangeQty;
    @FindBy(css=".product-cart-total>span span[class='price']")
    private List<WebElementFacade> listOfSubtotalsInCart;
    @FindBy(css = ".a-right>strong>span[class='price']")
    private WebElement totalPrice;

    //-------------------


  //Ciuverca Ionut
    public int getNumberOfElementsFromCartProductsList(){

        return cartProductsList.size();
    }

   //Ciuverca Ionut
    public void proceedToCheckout(){
        proceedToCheckoutButton.click();
    }


}

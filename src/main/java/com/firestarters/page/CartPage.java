package com.firestarters.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import static com.firestarters.utils.Utils.*;

@DefaultUrl("http://qa2.dev.evozon.com/checkout/cart/")
public class CartPage extends  AbstractPage{

    @FindBy(css = "#shopping-cart-table > tbody tr")
    private List<WebElementFacade> cartProductsList;

    @FindBy(css = ".button[title*='Proceed']")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css = "#shopping-cart-table > tbody")
    private WebElementFacade listOfProductsInCart;

    //Agota
    @FindBy(css="#shopping-cart-table>tbody>tr")
    private List<WebElementFacade> productList;
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
    public List<WebElementFacade> getCartProductsList() {
        return cartProductsList;
    }
    //Agota
    public Double getProductTotalPriceAsDouble(){
        //get the total price
        String priceTotal=totalPrice.getText();
        //eliminate $US from price and replace , with .
        String priceTotal1=stringReplace(priceTotal);
        //change price as string to double
        Double priceTotalAsDouble=convertStringToDouble(priceTotal1);
        return priceTotalAsDouble;
    }
    //return Product list from cart
    public List<WebElementFacade> getProductList() {
        return productList;
    }
}

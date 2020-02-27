package com.firestarters.steps;

import com.firestarters.page.CartPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.firestarters.utils.Utils.convertStringToDouble;
import static com.firestarters.utils.Utils.stringReplace;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.junit.Assert.assertEquals;

public class CartPageSteps {

    CartPage cartPage;

    //Ciuverca Ionut
    @Step
    public void proceedToCheckout() {
        assertEquals(2, cartPage.getNumberOfElementsFromCartProductsList());
        cartPage.proceedToCheckout();
    }

    //Agota
    @Step
    public void verifyIfSubtotalIsCorrect() {
        //product list
        List<WebElementFacade> productList = cartPage.getProductList();
        for (WebElementFacade product : productList) {
            String price = product.findElement(By.cssSelector(" td[class='product-cart-price']")).getText();
            String qty = product.findElement(By.cssSelector(" td[class='product-cart-actions']>input")).getAttribute("value");
            String subtotal = product.findElement(By.cssSelector(" .product-cart-total>span span[class='price']")).getText();

            Double correctPrice = convertStringToDouble(stringReplace(price));

            System.out.println(correctPrice);
            Double correctQty = convertStringToDouble(qty);
            System.out.println(correctQty);
            Double correctSubtotal = convertStringToDouble(stringReplace(subtotal));
            System.out.println(correctSubtotal);

            Assert.assertTrue(correctSubtotal.equals(correctPrice * correctQty));

        }
    }

}


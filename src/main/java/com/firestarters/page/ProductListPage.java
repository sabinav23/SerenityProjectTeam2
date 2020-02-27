package com.firestarters.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProductListPage extends AbstractPage {

    @FindBy(css = ".product-image[title*= 'Core']")
    private WebElementFacade specificProduct;

    @FindBy(css = ".products-grid .item.last")
    private List<WebElementFacade> porductsList;

    @FindBy(css = ".success-msg")
    private WebElementFacade successMessage;

    @FindBy(css = ".block-compare")
    private WebElementFacade compareProductsMenu;

    //Ciuverca Ionut
    public void selectAProduct(){
        specificProduct.click();
    }

    //Ciuverca Ionut
    public WebElementFacade getRandomProduct(){
        Random random = new Random();
        WebElementFacade randomProduct = porductsList.get(random.nextInt(porductsList.size()));
        return randomProduct;
    }

    //Ciuverca Ionut
    public void clickOnAddToCompare(){
        WebElementFacade randomProduct= getRandomProduct();
        String productTitle = randomProduct.findElement(By.cssSelector(".product-name")).getText().toLowerCase();
        randomProduct.findElement(By.cssSelector(".link-compare")).click();
        String message = successMessage.getText().toLowerCase();
        assertTrue(message.contains(productTitle));
    }

    //Ciuverca Ionut
    public void addToCompare(){
        WebElementFacade randomProduct = getRandomProduct();
        randomProduct.findElement(By.cssSelector(".link-compare")).click();
        assertTrue(compareProductsMenu.isDisplayed());

    }
}

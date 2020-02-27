package com.firestarters.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.Random;

public class ProductListPage extends AbstractPage {

    @FindBy(css = ".products-grid .product-image[title*= 'Core']")
    private WebElementFacade specificProduct;

    @FindBy(css = ".link-compare")
    private List<WebElementFacade> addToCompareLinksList;

    //Ciuverca Ionut
    public void selectAProduct(){
        specificProduct.click();
    }

    //Ciuverca Ionut
    public void clickOnAddToCompare(){
        Random random = new Random();
        WebElementFacade randomAdToCartLink = addToCompareLinksList.get(random.nextInt(addToCompareLinksList.size()));
        randomAdToCartLink.click();
    }
}

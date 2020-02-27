package com.firestarters.steps;

import com.firestarters.page.ProductListPage;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertTrue;

public class ProductPageSteps {

    ProductListPage productListPage;

    //Ciuverca Ionut
    @Step
    public void selectAProduct(){
        productListPage.selectAProduct();
    }

    //Ciuverca Ionut
    @Step
    public void selectAdToCompare(){
        productListPage.clickOnAddToCompare();
    }

    //Ciuverca Ionut
    @Step
    public void addToCompare(){
        productListPage.addToCompare();
    }
}

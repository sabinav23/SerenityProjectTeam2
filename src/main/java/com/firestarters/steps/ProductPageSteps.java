package com.firestarters.steps;

import com.firestarters.page.ProductListPage;
import net.thucydides.core.annotations.Step;

public class ProductPageSteps {

    ProductListPage productListPage;

    //Ciuverca Ionut
    @Step
    public void selectAProduct(){
        productListPage.selectAProduct();
    }
}

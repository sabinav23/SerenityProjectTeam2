package com.firestarters.steps;

import com.firestarters.page.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchPageSteps {

    SearchPage searchPage;

    @Step
    public void addProductFromSearch(){
        searchPage.searchProduct("Eye", "eye");
        searchPage.addToCartProduct();
    }
}

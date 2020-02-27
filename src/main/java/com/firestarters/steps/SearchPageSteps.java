package com.firestarters.steps;

import com.firestarters.page.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchPageSteps {

    SearchPage searchPage;

    @Step
    public void addProductFromSearch(String productInput, String titleComparatorString){
        searchPage.searchProduct(productInput, titleComparatorString);
        searchPage.addToCartProduct();
    }


}

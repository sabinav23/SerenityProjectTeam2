package com.firestarters.steps;

import com.firestarters.page.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchPageSteps {

    SearchPage searchPage;

//    public String searchWord, expectedWordInTitle;

    //Ciuverca Ionut
    @Step
    public void addProductFromSearch(String searchWord, String expectedWordInTitle){
        searchPage.searchProduct(expectedWordInTitle, expectedWordInTitle);
        searchPage.addToCartProduct();
    }

}

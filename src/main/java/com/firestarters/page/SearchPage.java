package com.firestarters.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.junit.Assert.assertTrue;


public class SearchPage extends AbstractPage {

    @FindBy(id = "search")
    private WebElementFacade searchInput;

    @FindBy(css = "button[title = 'Search']")
    private WebElementFacade searchSubmitButton;

    @FindBy(css = ".category-products>.toolbar .sort-by")
    private WebElementFacade sortByLabel;

    @FindBy(css = "div.page-title")
    private WebElementFacade searchTitle;

    @FindBy(css = "div>.btn-cart")
    private WebElementFacade addToCartButton;



    public void searchProduct(String product, String keyword){
        searchInput.clear();
        searchInput.type(product);
        searchSubmitButton.click();
        String searchTitleString = searchTitle.getText().toLowerCase();
        assertTrue(sortByLabel.isDisplayed());
        assertTrue(searchTitleString.contains(keyword));
    }

    public void addToCartProduct(){
        addToCartButton.click();
    }








}

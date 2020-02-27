package com.firestarters.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa2.dev.evozon.com/")
public class WishListPage extends AbstractPage {

    @FindBy(css ="a[title='My Wishlist']")
    private WebElementFacade wishListBtn;

    public WebElementFacade getWishListBtn(){
        return wishListBtn;
    }

}
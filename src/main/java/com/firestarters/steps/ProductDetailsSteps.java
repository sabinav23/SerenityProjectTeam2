package com.firestarters.steps;

import com.firestarters.page.ProductDetailsPage;
import net.thucydides.core.annotations.Step;

public class ProductDetailsSteps {

    ProductDetailsPage productDetailsPage;

//    @Step
//    public void selectARandomColor(){
//        productDetailsPage.selectAColor();
//    }
//
//    @Step
//    public void selectARandomSize(){
//        productDetailsPage.selectSize();
//    }
//
//    @Step
//    public void addToCart(){
//        productDetailsPage.addToCart();
//    }

    //Ciuverca Ionut ( here I grouped all the above)
    @Step
    public void configureProductAndAddToCart(){
        productDetailsPage.selectAColor();
        productDetailsPage.selectSize();
        productDetailsPage.addToCart();
    }

}

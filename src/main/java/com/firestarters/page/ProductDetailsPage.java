package com.firestarters.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductDetailsPage extends  AbstractPage {

    @FindBy(css = "div.input-box li.is-media")
    private List<WebElementFacade> colorList;

    @FindBy(css = "#configurable_swatch_size li[id*=opt]")
    private List<WebElementFacade> sizeList;

    @FindBy(css = "div>.btn-cart")
    private WebElementFacade addToCartButton;

    public void selectAColor(){
        Random color = new Random();
        WebElementFacade randomColor = colorList.get(color.nextInt(colorList.size()));
        randomColor.click();
    }

    public void selectSize(){
        Random size = new Random();
        WebElement randomSize = sizeList.get(size.nextInt(sizeList.size()));
        randomSize.click();
    }

    public void addToCart(){
        addToCartButton.click();
    }

}

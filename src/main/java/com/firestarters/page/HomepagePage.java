package com.firestarters.page;

import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class HomepagePage extends AbstractPage {


    public String getTitle() {
        return getDriver().getTitle();
    }

    public String getURL() {
        return getDriver().getCurrentUrl();
    }

    @FindBy(css = ".logo" )
    private WebElementFacade logo;

    @FindBy(css = " .skip-account " )
    private WebElementFacade accountButton;

    @FindBy(css = " #header-account " )
    private WebElementFacade accountDropDown;

    @FindBy(css = " #select-language > option " )
    private List<WebElementFacade> languageOptions;

    @FindBy(css = " #select-language " )
    private WebElementFacade languageOpt;

    @FindBy (css = " #search " )
    private WebElementFacade searchField;


    public WebElementFacade getLogo() {
        return logo;
    }

    public void navigateBack() {
        getDriver().navigate().forward();
    }

    public WebElementFacade getAccountButton() {
        return accountButton;
    }

    public WebElementFacade getAccountDropDown() {
        return accountDropDown;
    }

    public int getNumberOfOptions() {
        return languageOptions.size();
    }

    public void selectDropdownValues() {
        languageOpt.selectByVisibleText("French");
        assertThat(languageOpt.getSelectedVisibleTextValue(), is("French"));
    }

    public void clearSearchField(){
        searchField.clear();
        Assert.assertTrue( searchField.getText().isEmpty());
    }

    public void fillSearchField(String word){
        searchField.sendKeys(word);
        searchField.submit();

    }




}

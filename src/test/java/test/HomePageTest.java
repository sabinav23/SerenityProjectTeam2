package test;



import com.firestarters.steps.HeaderSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class HomePageTest extends BaseTest {

   @Steps
   HeaderSteps headerSteps;


   @Test
    public void checkTitleTest(){
        headerSteps.appearsOnHomepage();
    }

    @Test
    public void checkURL(){
       headerSteps.isTheCorrectURL();
    }

    @Test
    public void logoIsDisplayed(){
       headerSteps.logoIsDisplayed();
    }

    @Test
    public void clickOnLogo(){
       headerSteps.clickOnLogo();
    }

    @Test
    public void navigateBack(){
       headerSteps.navigateBack();
    }

    @Test
    public void clickOnAccount(){
       headerSteps.clickOnAccountButton();
    }

    @Test
    public void checkAccountDropDown(){
       headerSteps.isAccountDropDownDIsplayed();
    }

    @Test
    public void checkAccountTextIsCorrect(){
       headerSteps.checkAccountText();
    }

    @Test
    public void checkTheNumberOfLanguages(){
       headerSteps.verifyTheNumberOfLanguages();

    }

    @Test
    public void newLanguageIsSelected(){
       headerSteps.selectTheNewLanguage();

    }

    @Test
    public void clearSearchField() {
        headerSteps.clearsSearchField();
    }

    String word = "DRESS";
    @Test
    public void submitInSearch(String word){

    }

}

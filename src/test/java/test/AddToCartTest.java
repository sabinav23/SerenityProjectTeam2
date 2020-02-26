package test;


import com.firestarters.steps.HeaderSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class AddToCartTest extends BaseTest{

   @Steps
    HeaderSteps headerSteps;

    @Test
    public void addElementBySearching(){
        headerSteps.submitsInSearch();

    }




}

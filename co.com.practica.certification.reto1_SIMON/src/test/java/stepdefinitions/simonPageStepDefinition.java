package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Go;
import tasks.Register;

public class simonPageStepDefinition
{


    @Before
    public void setStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^that \"([^\"]*)\" wants to join in the aplication SIMON$")
    public void thatWantsToJoinInTheAplicationSIMON(String actor)
    {
        OnStage.theActorCalled(actor).wasAbleTo(Go.toSimonPage());
    }


    @When("^he fills the form in \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and$")
    public void heFillsTheFormInAnd(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8)
    {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.FillIn(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8));
       // OnStage.theActorCalled("wilson").wasAbleTo(Launch.youtubeHomepage ());
        //OnStage.theActorCalled("wilson").wasAbleTo(Search.yourFavoriteSong ()); OnStage.theActorCalled("wilson").wasAbleTo(Login.withCredentials(username
    }

    @And("^he acepted the politics$")
    public void heAceptedThePolitics()
    {
    }

    @Then("^the system shows him a new message$")
    public void theSystemShowsHimANewMessage()
    {
    }
}

package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.Responses;
import starter.utils.Constants;

import java.io.File;
import static org.hamcrest.Matchers.equalTo;

public class PostRegisterStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Register user with valid json {string}")
    public void registerUserWithValidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.PostRegisterUser(jsonFile);
    }

    @When("Send request post register user")
    public void sendRequestPostRegisterUser() {
        SerenityRest.when()
                .post(ReqresAPI.POST_REGISTER);
    }

    @And("Response body name should be {int}")
    public void responseBodyNameShouldBe(int id) {
        SerenityRest.and()
                .body(Responses.ID,equalTo(id));
    }

    //NEGATIVE
    @Given("Register user with valid json <JSON>")
    public void registerUserWithValidJsonJSON(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.PostRegisterUser(jsonFile);
    }

}

package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.utils.Constants;

import java.io.File;

public class PostLoginStepDef {
    @Steps
    ReqresAPI reqresAPI ;
    @Given("Login user with valid json {string}")
    public void loginUserWithValidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.PostLoginUser(jsonFile);
    }

    @When("Send request post login user")
    public void sendRequestPostLoginUser(){
        SerenityRest.when().post(ReqresAPI.POST_LOGIN);
    }

    @Given("Login user with invalid json {string}")
    public void loginUserWithInvalidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.PostLoginUser(jsonFile);
    }
}

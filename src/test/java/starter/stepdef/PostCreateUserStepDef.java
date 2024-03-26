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

public class PostCreateUserStepDef {
    @Steps
    ReqresAPI reqresAPI;
    @Given("Create user with valid json valid json {string}")
    public void createUserWithValidJsonValidJson(String json) {
        File jsonFile = new File(Constants.REQ_BODY+json);
        reqresAPI.postCreateUser(jsonFile);
    }

    @When("Send request create new User")
    public void sendRequestCreateNewUser() {
        SerenityRest.when()
            .post(ReqresAPI.CREATE_USER);
    }

    @And("Response body name should be {string} and {string}")
    public void responseBodyNameShouldBeAnd(String Name, String Job) {
        SerenityRest.and()
                .body(Responses.NAME,equalTo(Name))
                .body(Responses.JOB,equalTo(Job));
    }
}

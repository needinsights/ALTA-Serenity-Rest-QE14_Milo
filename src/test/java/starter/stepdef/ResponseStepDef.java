package starter.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.reqres.ReqresAPI;
import starter.reqres.Responses;
import starter.utils.Constants;

import java.io.File;

import static org.hamcrest.CoreMatchers.equalTo;

public class ResponseStepDef {

    @Steps
    ReqresAPI reqresAPI;
    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        SerenityRest.then()
                .statusCode(statusCode);
    }

    @And("Validate json schema {string}")
    public void validateJsonSchema(String arg0) {
    }

    @And("Response body page should be {string} and job is {string}")
    public void responseBodyPageShouldBeAndJobIs(String name, String job) {
        SerenityRest.and()
                .body(Responses.NAME, equalTo(name))
                .body(Responses.JOB, equalTo(job));
    }

    @Given("Update user with invalid json {string} and user id {int}")
    public void updateUserWithInvalidJsonAndUserId(String json, int id) {
        File jsonfile = new File(Constants.REQ_BODY + json);
        reqresAPI.putUpdateUser(id, jsonfile);
    }
}



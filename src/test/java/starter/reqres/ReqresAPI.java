package starter.reqres;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ReqresAPI {
    public static String BASE_URL = "https://reqres.in";

    public static String LIST_USERS = BASE_URL+"api/users?page={page}";

    @Step("Get List user with valid parameter page");
    public void getListUsers(int page){
        SerenityRest.given()
                .pathParam("page,",page);
    }

}

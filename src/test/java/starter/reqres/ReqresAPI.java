package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class ReqresAPI {

    public static String LIST_USERS = Constants.BASE_URL+"/api/users?page={page}";
    public static String CREATE_USER = Constants.BASE_URL+"/api/users";
    public static String UPDATE_USER = Constants.BASE_URL+"/api/users/{id}";
    public static String DELETE_USER = Constants.BASE_URL+"/api/users/{id}";
    public static String POST_LOGIN = Constants.BASE_URL+"/api/login";
    public static String POST_REGISTER = Constants.BASE_URL+"/api/register";
    public static String GET_SINGLE_USER = Constants.BASE_URL+"/api/users/{id}";

    // Tugas Get List User
    @Step("Get list user with valid parameter page")
    public void getListUsers(int page){
        SerenityRest.given()
                .pathParam("page", page);
    }

    // Tugas Post Create user
    @Step("Post create user with valid json")
    public void postCreateUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Update user with valid json and user id")
    public void putUpdateUser(int id, File json){
        SerenityRest.given()
                .pathParam("id",id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    // Delete User
    @Step("Delete user with valid user id")
    public void deleteUser(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }

    //
    @Step("Login with valid username and password")
    public void PostLoginUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
    @Step("Post Register User")
    public void PostRegisterUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

    // Get single user
    @Step("Get Single User")
    public void getSingleUser(int id){
        SerenityRest.given().pathParam("id", id);
    }
    @Step("Get Single User")
    public void getSingleUserWithInvalidId(String id){
        SerenityRest.given().pathParam("id", id);
    }
}
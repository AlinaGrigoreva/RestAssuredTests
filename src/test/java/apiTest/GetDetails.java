package apiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetDetails {
    @Test
    public void getUser() {
        RestAssured.baseURI = "https://reqres.in/api";
        Response res = given()
                .when().get(("/users/2"))
                .then().extract().response();
        System.out.println(res);
        int statusCode = res.getStatusCode();
        System.out.println(statusCode);

        String response = res.asString();
        System.out.println(response);
    }

    @Test
    public void getAllUsers() {
        RestAssured.baseURI = "https://reqres.in/api";
        Response res = given().queryParam("page", "2")
                .when().get(("/users"))
                .then().extract().response();
        System.out.println(res);
        int statusCode = res.getStatusCode();
        System.out.println(statusCode);

        String response = res.asString();
        System.out.println(response);
    }
}

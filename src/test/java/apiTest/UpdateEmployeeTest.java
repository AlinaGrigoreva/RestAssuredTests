package apiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateEmployeeTest {
    @Test
    public void UpdateEmployee() {
        String body = "{\n" +
                "    \"name\": \"morpheus\",\n" +
                "    \"job\": \"zion resident\"\n" +
                "}";
        RestAssured.baseURI = "https://reqres.in/api";
        Response res = given().header("Content-Type", "application/json")
                .body(body)
                .when().put("/users/2")
                .then().extract().response();
        String response = res.asString();
        System.out.println(response);
        System.out.println("Status Code " + res.getStatusCode());

    }
}

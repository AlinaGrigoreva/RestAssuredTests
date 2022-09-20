package apiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployeeTest {
    @Test
    public void deleteEmployee() {
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
        Response res = given()
                .when().delete("/delete/2")
                .then().extract().response();
        String response = res.asString();
        System.out.println(response);
        System.out.println(res.getStatusCode());
    }
}

package apiTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateEmployeeTest {
    @Test
    public void createEmployee() {

        String body = "{\n" +
                "\t\"name\":\"test\",\n" +
                "\t\"salary\":\"123\",\n" +
                "\t\"age\":\"23\"\n" +
                "}";
        RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
        Response res = given().header("Content-Type", "application/json")
                .body(body)
                .when().post("/create")
                .then().extract().response();
        String response = res.asString();
        System.out.println(response);
        System.out.println("StatusCode " + res.getStatusCode());
    }
}

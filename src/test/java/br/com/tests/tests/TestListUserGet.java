package br.com.tests.tests;

import br.com.tests.core.BaseTest;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class TestListUserGet extends BaseTest {
    @Test
    public void getRequest() {
        Response response = given()
                .get("/users?page=1");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
    }
}

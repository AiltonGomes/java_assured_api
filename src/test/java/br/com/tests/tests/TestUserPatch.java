package br.com.tests.tests;

import br.com.tests.core.BaseTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class TestUserPatch extends BaseTest {
    @Test
    public void postRequest() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "Ailton");
        requestParams.put("job", "Software Engineer SR");

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestParams.toJSONString())
                .post("/users/1");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201);

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        String name = response.jsonPath().get("name");
        Assert.assertEquals(name, "Ailton");

        String job = response.jsonPath().get("job");
        Assert.assertEquals(job, "Software Engineer SR");
    }
}

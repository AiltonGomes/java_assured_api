package br.com.tests.tests;

import br.com.tests.core.BaseTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
public class TestUserPost extends BaseTest {

    @Test
    public void postRequest() {

        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "John");
        requestParams.put("job", "Software Engineer");

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestParams.toJSONString())
                .post("/users");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 201);

        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

        String name = response.jsonPath().get("name");
        Assert.assertEquals(name, "John");

        String job = response.jsonPath().get("job");
        Assert.assertEquals(job, "Software Engineer");
    }
}

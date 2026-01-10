package com.mifx.api.test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;

public class UserApiTest {

	@Test
	public void getUserpage() {
		Response res = 
				RestAssured.given()
				.header("User-Agent", "Mozilla/5.0")
				.accept(ContentType.JSON)
				.when()
				.get("https://reqres.in/api/users?page=2")
				.then()
				.assertThat()
				.statusCode(200)
				.extract().response();
		Assert.assertTrue(res.getBody().asString().contains("page"));
		Assert.assertEquals(res.jsonPath().getInt("page"), 2);
		Assert.assertTrue(res.getBody().asString().contains("data"));
	}
	
	
	
	
}

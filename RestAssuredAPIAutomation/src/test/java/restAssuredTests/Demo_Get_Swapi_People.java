package restAssuredTests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.containsStringIgnoringCase;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Demo_Get_Swapi_People 
{
	@BeforeTest
    public  void beforeTest(){
        baseURI="https://swapi.co/api/people";
    }
	
	@Test
	@Ignore
	public void getPeople()
	{
		when()
		.request(Method.GET,"/2")
			.then()
				.statusCode(200)
				.log()
				.all();
	}
	
	@Test
	public void testSingleContent()
	{
//		when()
//		.request(Method.GET,"/2")
//			.then()
//				.statusCode(200)
//				.body(".name",equalTo("C-3PO"));
		
		JsonPath  response = given().when()
				.request(Method.GET,"/2")
				.then().extract().jsonPath();
		
//		System.out.println(response.get("films"));
//		System.out.println(response.get("name"));
//		System.out.println(response.get("birth_year"));
		
		//int statusCode = response.getStatusCode();
		String name = response.getString("name");
		String color = response.getString("skin_color");
		Assert.assertEquals(name, "C-3PO", "Correct name return");
		// Assert.assertEquals(color,containsStringIgnoringCase("gold"),"Correct name
		// return");
		assertThat(color, containsString("ld"));
		
		  
	}

}

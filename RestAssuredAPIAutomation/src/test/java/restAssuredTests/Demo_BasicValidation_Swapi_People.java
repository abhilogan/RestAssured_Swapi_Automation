package restAssuredTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import static org.hamcrest.MatcherAssert.*;


public class Demo_BasicValidation_Swapi_People 
{
	//1> test status code..
	@Test
	@Ignore
	public void testStatus()
	{
		//given()
		
				when()
//					.get("http://jsonplaceholder.typicode.com/posts/5")
				.get("https://swapi.co/api/people/1/")
						.then()
							.statusCode(200)
							.log()
							.all();
	}
	
	@Test
	//@Ignore
	public void testSingleContent()
	{
		Response response =given().when()
				.get("https://swapi.co/api/people/1/")
				.then().extract().response();
		
		JSONObject object = new JSONObject(response.asString());
		
		String name = object.getString("name");
		System.out.println(name);
		
		assertThat(name,containsString("ke"));
		
	}

}

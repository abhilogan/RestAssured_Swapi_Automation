package restAssuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

//{
//    "City": "Indore",
//    "Temperature": "21 Degree celsius",
//    "Humidity": "37 Percent",
//    "WeatherDescription": "clear sky",
//    "WindSpeed": "1.5 Km per hour",
//    "WindDirectionDegree": "30 Degree"
//}

public class Demo_Get_Request 
{
	@Test
	public void getWeatherDetails()
	{
			given()
				.when()
					.get("http://restapi.demoqa.com/utilities/weather/city/Indore")
				.then()
					.statusCode(200)
					.statusLine("HTTP/1.1 200 OK")
					.assertThat().body("City",equalTo("Indore"))
					.header("Content-Type", "application/json");
	}

}

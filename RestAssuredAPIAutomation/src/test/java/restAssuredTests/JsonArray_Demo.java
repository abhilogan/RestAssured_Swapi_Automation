package restAssuredTests;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class JsonArray_Demo 
{
	@Test
	public void jsonArray()
	{
		String string ="{\"total\":8228,\"businesses\":[{\"rating\":4,\"price\":\"25\",\"phone\":\"+14152520800\"},{\"rating\":5,\"price\":\"66\",\"phone\":\"+1546620800\"}],\"name\":\"abhishek\"}"; 
		
		JSONObject jsonObject = new JSONObject(string);
		
		System.out.println(jsonObject.get("total"));
		
		JSONArray array = (JSONArray) jsonObject.get("businesses");

		System.out.println(array.getJSONObject(0).get("phone"));
		System.out.println(array.getJSONObject(1).get("phone"));
		
	}

}

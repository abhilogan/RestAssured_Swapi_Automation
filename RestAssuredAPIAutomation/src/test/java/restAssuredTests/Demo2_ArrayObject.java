package restAssuredTests;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class Demo2_ArrayObject 
{
	@Test
	public void test()
	{
		String string = "{\"total\":8228,\"name\":\"CP03\",\"businesses\":[{\"rating\":4,\"price\":\"56\",\"phone\":\"+14155620800\",\"id\":\"four-barrel-coffee-san-francisco\",\"is_closed\":false,\"categories\":[{\"alias\":\"coffaee\",\"title\":\"Coffaee & Tea\"}]},{\"rating\":5,\"price\":\"45\",\"phone\":\"+14157420811\",\"id\":\"four-barrel-juice-san-francisco\",\"is_closed\":false,\"categories\":[{\"alias\":\"juice\",\"title\":\"juice & Tea\"}]},{\"rating\":6,\"price\":\"25\",\"phone\":\"+14187520822\",\"id\":\"four-barrel-apple-san-francisco\",\"is_closed\":false,\"categories\":[{\"alias\":\"apple\",\"title\":\"apple & Tea\"}]}]}";
		
		JSONObject jsonObject = new JSONObject(string);
		
		System.out.println("Total :: "+jsonObject.get("total"));
		System.out.println("\nName :: "+jsonObject.getString("name"));
		//System.out.println("\nBusiness :: "+jsonObject.getJSONArray("businesses").getJSONObject(0));
		
		System.out.println("\n");
		String jsonObject2 = (String) jsonObject.getJSONArray("businesses").getJSONObject(0).getJSONArray("categories").getJSONObject(0).get("title");
		System.out.println(jsonObject2);
		
		/*
		 * JSONArray categgory = jsonObject2.getJSONArray("categories");
		 * 
		 * System.out.println("\n"+categgory);
		 * 
		 * System.out.println("\n\n"+categgory.getJSONObject(0).get("title"));
		 */
	}
}

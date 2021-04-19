package files;

public class PayLoads {

	//We can write json value in another class and call the class and method in another parent class
	// here we have declared Addplace() method as static so that we can call it without initialization.
	
	public static String AddPlace()
	{
		
		return "{\n" + 
				"    \"location\": {\n" + 
				"        \"lat\": -38.383494,\n" + 
				"        \"lng\": 33.427362\n" + 
				"    },\n" + 
				"    \"accuracy\": 50,\n" + 
				"    \"name\": \"Punit Shukla\",\n" + 
				"    \"phone_number\": \"(+91) 8305218598\",\n" + 
				"    \"address\": \"29, side layout, cohen 09\",\n" + 
				"    \"types\": [\n" + 
				"        \"shoe park\",\n" + 
				"        \"shop\"\n" + 
				"    ],\n" + 
				"    \"website\": \"http://google.com\",\n" + 
				"    \"language\": \"French-IN\"\n" + 
				"}";
	}
}

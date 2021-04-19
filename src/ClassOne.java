import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.jvnet.staxex.StAxSOAPBody.Payload;

import files.PayLoads;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ClassOne {

	public static void main(String[] args) {

		// given
		// then
		// when

		RestAssured.baseURI = "https://rahulshettyacademy.com";// Defining base url

		// below payloads class is called , in payload class requet body is written
		// which can be called here ,

		String output = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(PayLoads.AddPlace()).when().post("/maps/api/place/add/json").then()
				.header("Server", "Apache/2.4.18 (Ubuntu)").body("scope", equalTo("APP")).log().all().assertThat()
				.statusCode(200).extract().response().asString();// here equal to validating the response with app

		System.out.println(output);
	
		/*
		 * to show results in console declared it as a String and reference variable
		 * output
		 * 
		 * Q-How to Extract something from Json response , here we have extracted place
		 * id value from response and shown to results. With using Jsonpath from
		 */
		
		JsonPath js = new JsonPath(output);

		String placeId = js.getString("place_id");
		System.out.println(placeId);

	//	System.out.println(js.getString("status"));

// get api
//		
//        String getplaceResponse =		given().log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId).
//		when().get("/maps/api/place/add/json").
//		then().assertThat().log().all().statusCode(200).extract().response().asString();
//
//        JsonPath js1 = new JsonPath(getplaceResponse);
//  //      String  actual_address = js1.getString("address");
//        System.out.println(js1.getString(getplaceResponse));

	}

}

package Org.Testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.given;

import Org.Testing.Payloads.PojoBodyData;


public class HttpMethods {

	static Properties Pr;
	
	public HttpMethods(Properties Pr)
	{
		HttpMethods.Pr=Pr;
	}
	
	public Response GetRequest(String id, String URI)
	{
		Response Res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(Pr.getProperty(URI));
		
		return Res;
	}

	public Response PostRequest(PojoBodyData Body, String URI)
	{
		Response Res=
				given()
				.contentType(ContentType.JSON)
				.body(Body)
				.when()
				.post(Pr.getProperty(URI));
		
		return Res;
	}
	
	public Response DeleteData(String id, String URI)
	{
		String FinalUri = (String) Pr.getProperty(URI)+"/"+id;
		
		Response Res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(FinalUri);
		
		return Res;
	}
	
	public Response PutRequest(PojoBodyData Body, String URI, String id)
	{
		
		String FinalUri = (String) Pr.getProperty(URI)+"/"+id;
		
		Response Res=
				given()
				.contentType(ContentType.JSON)
				.body(Body)
				.when()
				.put(FinalUri);
		
		return Res;
	}

}

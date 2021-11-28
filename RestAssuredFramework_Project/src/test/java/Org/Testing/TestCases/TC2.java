package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import com.jayway.restassured.response.Response;

import Org.Testing.Payloads.PojoBodyData;
import Org.Testing.Payloads.PojoSimpleBody;
import Org.Testing.TestResponseValidation.ResponseValidations;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;

public class TC2 {

	static String JsonKeyValue;

	public void testcase2() throws IOException {
		
		System.out.println("Executing Test Case 2");
		// Step 1: Load the Property file in the Object of Property class Pr
		Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredFrameWork_Project/Env.properties");
		// Step 2: Initialize the Properties object of HttpMethods Class with Pr of Step
		// 1.
		HttpMethods http = new HttpMethods(Pr);
		// Step 3: Called GetBodyData method of class PojoSimpleBody which return simple
		// Json data Object
		PojoBodyData Body = PojoSimpleBody.GetBodyData();
		/*
		 * Step 4: PostRequest Method of HttpMethods class is called passing Body data
		 * and URI And Response Returned by this method is collected in Res Object of
		 * Response class
		 */
		Response Res = http.PostRequest(Body, "QA_URI1");
		// Step 5: Res is sent to the ResponseValidation method of class
		// ResponseValidations
		ResponseValidations.ResponseStatusCodeVal(201, Res);
		System.out.println("Status code checked and found Ok");
		// Step 6: Storing the value of “id” in static variable of class parsing from
		// Response
		JsonKeyValue = JsonResParsing.JsonResDataParsing(Res, "id");
		System.out.println("The value of Json Key fecthed is :" + JsonKeyValue);
		
		//Step 7: Validating the Response Data with expected data in this case value of “id”
		ResponseValidations.ResponseDataValid("999", JsonKeyValue);
		
	}

}

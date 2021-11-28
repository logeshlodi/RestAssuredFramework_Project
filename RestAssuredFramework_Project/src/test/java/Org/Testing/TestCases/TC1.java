package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import com.jayway.restassured.response.Response;

import Org.Testing.TestResponseValidation.ResponseValidations;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;

public class TC1 {

	public void testcase1() throws IOException {
		System.out.println("\nExecuting Test Case 1");
		// STEP 1: Loading the property file in Pr object and we will pass it in calling
		// method
		Properties Pr = PropertiesFileLoad.PropFileLoad("../RestAssuredFrameWork_Project/Env.properties");
		// STEP 12Intitalizing the HttpMethods class with latest value of Properties
		// Object
		HttpMethods http = new HttpMethods(Pr);
		// STEP 3: Calling the GetRequest method, Passing URI Key and Collecting
		// Response
		Response Res = http.GetRequest(TC2.JsonKeyValue, "QA_URI1");
		// STEP 4: Validating the Response by calling ResponseValidation method and
		// passing Response data
		ResponseValidations.ResponseStatusCodeVal(200, Res);
		// STEP 5: Printing the Response Data on the Console for particular id
		String ParseData = JsonResParsing.JsonResDataParsing(Res, "firstName");
		System.out.println("The value of Json Key fecthed is :" + ParseData);
		ResponseValidations.ResponseDataValid("Arshbir", ParseData);
		System.out.println(Res.asString() + "\n");
	}

}
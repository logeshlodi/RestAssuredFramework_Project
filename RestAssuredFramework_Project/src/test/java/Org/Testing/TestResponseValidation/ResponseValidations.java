package Org.Testing.TestResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseValidations {

	public static void ResponseStatusCodeVal(int ExpStatCode, Response Res)
	{
		Assert.assertEquals(Res.getStatusCode(), ExpStatCode);
		System.out.println("Response Status Validated");
	}
	
	public static void ResponseDataValid(String  ExpData, String ActualData)
	{
		Assert.assertEquals(ExpData, ActualData);
		System.out.println("Response Data Validated");
	}

}

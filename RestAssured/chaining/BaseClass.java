package rest.jira.chaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	public static String id;
	public static RequestSpecification inputRequest;
	
	@BeforeMethod
	public void preConfiguration() {
		RestAssured.baseURI="https://api-training.atlassian.net/rest/api/2/issue";
	 inputRequest=RestAssured
			.given()
			.auth()
			.preemptive()
			.basic("hari.radhakrishnan@testleaf.com", "qQFYdkXF6eVr6o49g73W015C");
}
}
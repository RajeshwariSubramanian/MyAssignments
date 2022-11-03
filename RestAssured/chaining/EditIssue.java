package rest.jira.chaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EditIssue extends BaseClass{
@Test(dependsOnMethods="rest.jira.chaining.CreateIssue.createIssueJira")
public void editJiraIssue()
{
	
	 inputRequest.contentType(ContentType.JSON)
			.body("{ \"fields\": {\"description\": \"Issue updated via RestAssured for second time\"}}");
	
	Response getResponse=inputRequest.put(id);
	getResponse.prettyPrint();
	System.out.println("Status Code:"+getResponse.statusCode());
	
}	
}

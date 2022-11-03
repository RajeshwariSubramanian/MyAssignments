package rest.jira.chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetJiraIssue extends BaseClass{
@Test(dependsOnMethods="rest.jira.chaining.CreateIssue.createIssueJira")
	public void getAllIssuesTypes() {
		RestAssured.baseURI = "https://api-training.atlassian.net/rest/api/2/issue";

		inputRequest.accept(ContentType.JSON);
		
		Response getResponse = inputRequest.get(id);
		getResponse.prettyPrint();
		
		System.out.println("Status Code:" + getResponse.statusCode());

}
}

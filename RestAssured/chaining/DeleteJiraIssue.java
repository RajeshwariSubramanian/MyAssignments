package rest.jira.chaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteJiraIssue extends BaseClass{

@Test(dependsOnMethods="rest.jira.chaining.EditIssue.editJiraIssue")
public void deleteIssue()
{
		Response getResponse=inputRequest.delete(id);
		System.out.println("Status Code:"+getResponse.statusCode());
		getResponse.prettyPrint();

}
}

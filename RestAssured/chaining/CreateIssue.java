package rest.jira.chaining;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIssue extends BaseClass {

@Test
public void createIssueJira()
{
	
	File inputFile=new File("./data/CreateJiraIssue.json");
	
		inputRequest.contentType(ContentType.JSON).body(inputFile);
	
	Response getResponse=inputRequest.post();
	getResponse.prettyPrint();
	System.out.println("Status Code:"+getResponse.statusCode());
	id=getResponse.jsonPath().get("id");
	System.out.println("Issue Id:"+id);
			
}
}

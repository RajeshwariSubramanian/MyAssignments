package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/features/CreateLead.feature",
		                    "src/test/java/features/Editlead.feature",
		                    "src/test/java/features/Deletelead.feature",
		                    "src/test/java/features/Duplicate.feature",
		                    "src/test/java/features/Mergelead.feature"},		

                  glue="steps")
public class RunTest extends AbstractTestNGCucumberTests{

}

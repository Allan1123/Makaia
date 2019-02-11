package testcaseCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="src/main/java/feature/EditLead.feature", glue= {"pages","testcaseCucumber"},monochrome=true,tags="@SmokeTest")
@RunWith(Cucumber.class)
public class Runner {


}

package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/sampleee.feature",  glue="stepdefinition",
                  plugin="html:C:\\cucumber-html-report",
                  tags={"@category,@Sub-Category"})
public class sampleee1 {

}

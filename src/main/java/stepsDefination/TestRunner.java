
package stepsDefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/feature", glue="stepsDefination")
public class TestRunner extends AbstractTestNGCucumberTests {


}
package lims.loginpage.ui;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lims.stepdefinition.JvmReport;


@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\xvd71\\eclipse-workspace\\LimsLogin\\src\\test\\resources\\Feature",glue= "lims.stepdefinition",
dryRun=false,monochrome=true,plugin= {"json:C:\\Users\\xvd71\\eclipse-workspace\\LimsLogin\\Report\\JsonReport\\BsResult.json"})
public class TestRunner {
	
	@AfterClass
	public static void report() {
    JvmReport.generateJvmReport("C:\\Users\\xvd71\\eclipse-workspace\\LimsLogin\\Report\\JsonReport\\BsResult.json");

	}
	
	

	
	

}

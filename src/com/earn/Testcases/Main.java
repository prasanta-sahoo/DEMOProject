package com.earn.Testcases;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Main {
	
	
	private static ExtentReports extent;

    public static void main(String[] args) 
    {
        extent = new ExtentReports("file-path", true);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.startTest("My First login Test", "login successful");

        // log(LogStatus, details)
        test.log(LogStatus.INFO, "This step shows usage of log(logStatus, details)");

        // report with snapshot
        String img = test.addScreenCapture("img-path");
        test.log(LogStatus.INFO, "Image", "Image example: " + img);
        
        // end test
        extent.endTest(test);
        
        // calling flush writes everything to the log file
        extent.flush();
    }

}

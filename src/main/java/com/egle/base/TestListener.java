package com.egle.base;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class TestListener extends Base implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
   
        driver = ((Base) result.getInstance()).driver;
      //  String FileName = "login";
        
      
        takeScreenshot( result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       
    }

    @Override
    public void onTestSkipped(ITestResult result) {
       
    }

    @Override
    public void onTestStart(ITestResult result) {
      
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
       
    }

    @Override
    public void onStart(ITestContext context) {
       
    }

    @Override
    public void onFinish(ITestContext context) {
        
    }
}

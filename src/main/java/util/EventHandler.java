package util;		

import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;		

public class EventHandler implements ITestListener						
{		

  	
    public void onFinish(ITestContext Result) {					
        System.out.println("Testcase Finished"+Result.getName());			
        		
    }		

    		
    public void onStart(ITestContext Result) {					
       System.out.println("Testing started"+Result.getName());			
        		
    }		

    		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
       		
        		
    }		

    		
    public void onTestFailure(ITestResult Result) {					
    	System.out.println("testcase failed"+Result.getName());					
        		
    }		

    		
    public void onTestSkipped(ITestResult Result) {					
        // TODO Auto-generated method stub				
        		
    }		

    		
    public void onTestStart(ITestResult Result) {					
        // TODO Auto-generated method stub				
        		
    }		

    		
    public void onTestSuccess(ITestResult Result) {					
    	System.out.println("Test passed"+Result.getName());					
        		
    }		
}		
package com.TestNG.Features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyser implements IRetryAnalyzer{

	int start = 1;
	int end = 2;
	public boolean retry(ITestResult result) {

		if(start<=end) {
			start++;
			
			return true;
		}
		
		
		return false;
	}

	
	
	
}

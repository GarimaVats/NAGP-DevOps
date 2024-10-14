package commonFunction;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class RetryFailedTestCases implements ITestListener {
    private int retryCount = 0;
    // If there are any failed test cases, then it runs 2 times
    private int maxRetryCount = 1;

    public boolean retry(ITestResult arg0) {
        if (retryCount < maxRetryCount) {
            System.out.println("Retrying the failed test cases.");
            retryCount++;
            return true;
        }
        return false;
    }

}

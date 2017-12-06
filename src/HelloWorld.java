import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class HelloWorld {
	public static void main(String[] args) {
		String sms = getMessage();
		System.out.println(sms);
		
		 Result result = JUnitCore.runClasses(TestJUnit.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	}
	
	public static String getMessage() {
		return "Hello World - Jenkins";
	}
}

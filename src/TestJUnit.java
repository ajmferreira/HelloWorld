import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestJUnit {
	  @Test
	   public void testAdd() {
	      String str= HelloWorld.getMessage();
	      assertEquals("Hello World - Jenkins",str);
	   }
}

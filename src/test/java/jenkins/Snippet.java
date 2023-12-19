package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snippet {
	@Test
	public void parameterTest() {
		String deee = System.getProperty("Browser");
		Reporter.log(deee,true);
	}
}


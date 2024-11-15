package gitHub;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
public void deleteMessage() {
	Reporter.log("Welcome to GitHub", true);
}
	@Test
	public void mergeMessage() {
		Reporter.log("Welcome to GitHub", true);
}
}

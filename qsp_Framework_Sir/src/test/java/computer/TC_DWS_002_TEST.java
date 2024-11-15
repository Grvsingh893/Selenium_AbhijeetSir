package computer;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import objectRepository.HomePage;

@Listeners
public class TC_DWS_002_TEST extends BaseClass {
	@Test
	public void clickOnComputers() throws EncryptedDocumentException, IOException {
		test = extReport.createTest("clickOnComputers");
		hp = new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Computers", 1, 0),
				"Computers page is not displayed");
		test.log(Status.PASS, "Computers page is displayed");

	}

}
package electronics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtility.BaseClass;
import objectRepository.HomePage;

public class TC_DWS_004_Test extends BaseClass {
	
	@Test
	public void clickOnElectronics() throws EncryptedDocumentException, IOException {
		test = extReport.createTest("clickOnElectronics");
		hp = new HomePage(driver);
		Assert.assertEquals(driver.getTitle(), eUtil.getStringDataFromExcel("Electronics", 1, 0),"Electronics should not be displayed");
		test.log(Status.PASS, "Electronics page is displayed");
	}

}
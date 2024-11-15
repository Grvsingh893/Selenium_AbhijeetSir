package genericUtility;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	/**
	 * This method is used to maximize the window.
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to capture the size of a window.
	 * 
	 * @param driver
	 * @return
	 */
	public Dimension getSize(WebDriver driver) {
		return driver.manage().window().getSize();// return type will chnage it into dimension.
	}

	/**
	 * This method is used to switch driver control to window based on url
	 * 
	 * @param driver
	 * @param url
	 */

	public void switchToWindow(WebDriver driver) {
		// step 1: capture window id's
		Set<String> allWindowIds = driver.getWindowHandles();
		// step 2: navigate through all the windows
		for (String id : allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(actUrl)) {
				break;

			}
		}

	}

	/**
	 * This method is used to right click by the mouse
	 * 
	 * @param driver
	 */

	public void rightClick(WebDriver driver) {
		Actions act = new Actions(driver);
		act.contextClick().perform();

	}

	/**
	 * This methos is used to click and hold by the mouse
	 * 
	 * @param driver
	 * @param element
	 */

	public void clickAndHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	/**
	 * This method is used to move the mouse pointer.
	 * 
	 * @param driver
	 * @param element
	 */

	public void mouseHoover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * This method is used to drag and drop on a particular position.
	 * 
	 * @param driver
	 * @param element
	 */

	public void dragAndDrop(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.dragAndDrop(element, element);
	}

	/**
	 * This method is used to switch driver through index
	 * 
	 * @param driver
	 * @param Index
	 */

	public void switchToFrame(WebDriver driver, int Index) {
		Actions act = new Actions(driver);
		driver.switchTo().frame(Index);
	}

	/**
	 * his method is used to switch driver through name or id
	 * 
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrame(WebDriver driver, String nameOrId) {
		Actions act = new Actions(driver);
		driver.switchTo().frame(nameOrId);

	}

	/**
	 * his method is used to switch driver through element.
	 * 
	 * @param driver
	 * @param frameElement
	 */

	public void switchToFrame(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	/**
	 * his method is used to switch driver to main page.
	 * 
	 * @param driver
	 */

	public void switchBackToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * This method is used to drop the element by index.
	 * 
	 * @param element
	 * @param index
	 */

	public void selectDropDownByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * This method is used to drop the element by value.
	 * 
	 * @param element
	 * @param value
	 */
	public void selectDropDownByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
	}

	/**
	 * This method is used to drop the element by text.
	 * 
	 * @param element
	 * @param Text
	 */
	public void selectDropDownByText(WebElement element, String Text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(Text);
	}

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void switchToAlertAndSendKeys(WebDriver driver, String data) {
		driver.switchTo().alert().sendKeys(data);
	}
	public void javaScroll (WebDriver driver, int x, int y) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}
}

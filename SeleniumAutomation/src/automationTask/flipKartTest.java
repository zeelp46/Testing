package automationTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class flipKartTest {
	String driverPath =  System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

  @Test
  public void function() {
	  driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys("Flipkart");
		WebDriverWait wait = new WebDriverWait(driver, 15);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"wM6W7d\"]//span")));
		java.util.List<WebElement> data = driver.findElements(By.xpath("//*[@class=\"wM6W7d\"]//span"));
		for (WebElement str : data) {
		System.out.println(str.getText());
		}
		driver.findElement(By.xpath("//*[@title=\"Search\"]")).sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Flipkart")));		
		driver.findElement(By.partialLinkText("Flipkart")).click();
		if (driver.findElement(By.xpath("//*[@class=\"_2QfC02\"]")).isDisplayed()) {
		driver.findElement(By.xpath("//*[@class=\"_2QfC02\"]//button")).click();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,0)"); // Scroll down as per pixel
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@alt=\"Appliances\"]"));
		action.moveToElement(element);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Televisions')]")));
		driver.findElement(By.xpath("//a[contains(.,'Televisions')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(.,'TVs & Appliances')]")));
		WebElement element2 = driver.findElement(By.xpath("//span[contains(.,'TVs & Appliances')]"));
		element2.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title=\"Window ACs\"]")));
		driver.findElement(By.xpath("//*[@title=\"Window ACs\"]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class=\"_1fQZEK\"]//label/div")));
		java.util.List<WebElement> tutorialsList1 = driver.findElements(By.xpath("//*[@class=\"_1fQZEK\"]//label/div"));
		tutorialsList1.get(1).click();
		js.executeScript("window.scrollBy(0,500)"); // Scroll down as per pixel
		tutorialsList1.get(3).click();
		tutorialsList1.get(5).click();
		driver.findElement(By.xpath("//*[@class=\"_3hShhO\"]//span")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class=\"col col-3-12 _1Z-FPJ\"]//*[@class=\"_3L_M2k\"]")));
		java.util.List<WebElement> productName = driver.findElements(By.xpath("//*[@class=\"col col-3-12 _1Z-FPJ\"]//*[@class=\"_3L_M2k\"]"));
		for (WebElement str1 : productName) {
		System.out.println("product name is : " + str1.getText());
		}
		java.util.List<WebElement> price = driver
		.findElements(By.xpath("//*[@class=\"col col-3-12 _1Z-FPJ\"]//*[@class=\"_30jeq3\"]"));
		for (WebElement str2 : price) {
		System.out.println("product price is : " + str2.getText());
		}
		java.util.List<WebElement> productName1 = driver.findElements(By.xpath("//*[@class=\"col col-3-12 _1Z-FPJ\"]//*[@class=\"_3L_M2k\"]"));
		productName1.get(0).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"row\"]")));
		driver.findElement(By.xpath("//*[@class=\"row\"]//button[contains(.,'ADD TO CART')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"VUS-tD eBV0fb\"]//button")));
		driver.navigate().back();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"_3hShhO\"]//span")));
		driver.findElement(By.xpath("//*[@class=\"_3hShhO\"]//span")).click();
		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class=\"col col-3-12 _1Z-FPJ\"]//*[@class=\"_3L_M2k\"]")));
		/*
		 * java.util.List<WebElement> productName2 = driver.findElements(By.
		 * xpath("//*[@class=\"col col-3-12 _1Z-FPJ\"]//*[@class=\"_3L_M2k\"]"));
		 * productName2.get(1).click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//*[@class=\"row\"]//button[contains(.,'ADD TO CART')]")));
		 * driver.findElement(By.
		 * xpath("//*[@class=\"row\"]//button[contains(.,'ADD TO CART')]")).click();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//*[@class=\"VUS-tD eBV0fb\"]//button"))); driver.navigate().back();
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//*[@class=\"_3hShhO\"]//span"))); driver.navigate().refresh();
		 * wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.
		 * xpath("//*[@class=\"col col-3-12 _1Z-FPJ\"]//*[@class=\"_3L_M2k\"]")));
		 */		java.util.List<WebElement> productName3 = driver.findElements(By.xpath("//*[@class=\"col col-3-12 _1Z-FPJ\"]//*[@class=\"_3L_M2k\"]"));
		productName3.get(2).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"row\"]//button[contains(.,'ADD TO CART')]")));
		driver.findElement(By.xpath("//*[@class=\"row\"]//button[contains(.,'ADD TO CART')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"VUS-tD eBV0fb\"]//button")));
		driver.findElement(By.xpath("//*[@placeholder=\"Enter delivery pincode\"]")).sendKeys("380015");
		driver.findElement(By.xpath("//*[@class=\"UgLoKg\"]")).click();	
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	// scroll till the end of page	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"_3fSRat\"]//div[@class=\"_1tBBEs\"]")));
		String availabilityMessage = driver.findElement(By.xpath("//*[@class=\"_3fSRat\"]//div[@class=\"_1tBBEs\"]")).getText();
		System.out.println("Availability of stock message is: " + availabilityMessage);
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");	// scroll till the end of page	
		driver.findElement(By.xpath("//*[@class=\"_3gc7Vf\"]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@placeholder=\"Enter delivery pincode\"]")));
		driver.findElement(By.xpath("//*[@placeholder=\"Enter delivery pincode\"]")).sendKeys("400008");
		driver.findElement(By.xpath("//*[@class=\"UgLoKg\"]")).click();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	// scroll till the end of page	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class=\"_3fSRat\"]//div[@class=\"_1tBBEs\"]")));
		String availabilityMessage2 = driver.findElement(By.xpath("//*[@class=\"_3fSRat\"]//div[@class=\"_1tBBEs\"]")).getText();
		System.out.println("Availability of stock message is: " + availabilityMessage2);
	    driver.close();

  }
}

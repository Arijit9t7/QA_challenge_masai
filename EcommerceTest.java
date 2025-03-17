package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


  }

public class EcommerceTest {
	WebDriver driver;
	  @Test
	  public void testEcommerceWorkFlow() {
		  driver.get("https://www.demoblaze.com/");
		  driver.findElement(By.id("username")).sendKeys("test@emaxple.com");
		  driver.findElement(By.id("password")).sendKeys("Test@123");
		  driver.findElement(By.cssSelector(".btn-primary")).click();
		  
		  driver.findElement(By.cssSelector("input[placeholder='Search']")).sendKeys("Samsung galaxy s6");
		  
		  driver.findElement(By.xpath("//buttton[contains(text().'Add to cart')]")).click();
		  
		  driver.findElement(By.cssSelector("col-sm-12 col-md-6 col-lg-6")).click();
		  
		  System.out.println("Test Passed- Item Added to shop");
	  }
	  @BeforeTest
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chrome-win32\\chrome-win32");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
	  }

	  @AfterTest
	  public void tearDown() {
		  driver.quit();
	  }

}

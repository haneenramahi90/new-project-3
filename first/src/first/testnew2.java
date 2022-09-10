package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testnew2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe")    ;
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://stage.dadan.io/signIn");
		//driver.findElement(By.linkText("Create an Account")).getText();
		//driver.findElement(By.linkText("Create an Account")).click();
		//driver.findElement(By.tagName("input")).sendKeys("hiiii");
		
		
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("link5@mailinator.com");
		driver.findElement (By.cssSelector("input.form-control[name^= 'pass']")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();

	}

}

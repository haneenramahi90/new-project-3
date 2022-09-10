package loginuser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginusredadan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe")    ;
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://stage.dadan.io/signIn");
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("link5@mailinator.com");
		driver.findElement (By.cssSelector("input.form-control[name^= 'pass']")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button.btn-secondary")).click();
	
		
	}

}

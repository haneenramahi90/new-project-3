package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Haneen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe")    ;
WebDriver driver = new ChromeDriver() ;

       driver.get("https://ar-ar.facebook.com/");
       
       
       driver.findElement(By.id("email")).sendKeys("mar7aba@gmail.com");
       driver.findElement(By.id("pass")).sendKeys("mar7aba");
       driver.findElement(By.cssSelector("button._6lth")).click();


	}

}

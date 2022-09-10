package loginuser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrayaassigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe")    ;
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("http://127.0.0.1:5500/Qa-automation-7thmar/index.html");
		
		
		List<WebElement> options =driver.findElements(By.className("op"));
		
		
		
		for (WebElement option :options )
		{
			if (option.getText().contains("yazan")) {
				
			
				break;
			}
			
			else {
				
				driver.findElement(By.id("remove")).click();
				
			}
			
			
			
		}

	}

}

package loginuser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe")    ;
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("http://127.0.0.1:5500/Qa-automation-7thmar/index.html");
		
//		//static 
//		
//		int[] numbers = new int [10] ;
//		numbers [0] = 9 ;
//		numbers [1] = 9;
//		numbers [2] = 5;
//		numbers [3] = 4;
//		numbers [4] = 5;
//		numbers [5] = 5;
//		numbers [6] = 5;
//		numbers [7] = 4;
//		numbers [8] = 5;
//		//numbers [9] = 5;
//		//numbers [10] = 7;
//		
//		System.out.print(numbers [8]); 
//		
//		System.out.println();
//		
//		
//		//Dynamic 
//		
//		String [] nameOfStudents = {"EHAB", "HNAEEN","ALAA" ,"SULTAN ", "SURA" };
//		
//		System.out.println(nameOfStudents[3]);
//		System.out.println(nameOfStudents.length);
		
		
		// array list
		
		ArrayList <String> std = new ArrayList();
		
		std.add("aya");
		std.add("haneen");
		std.add("batool");
		std.add("hussam");
		std.add("laith");
		std.add("khaled");
		
		System.out.println(std.get(3));
	
		List<WebElement> options =driver.findElements(By.className("op"));
		int mid = options.size()/2;
		
		
		for (int i = 0 ; i< options.size (); i++ )
		{
			if(i == mid)
				break;
			System.out.println(options.get(i).getText());
			driver.findElement(By.id("remove")).click();
		}
		
	}

}

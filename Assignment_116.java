package Assignments_Selenium;
//Launch Amazon.in and Click on 1.UAE 2.UK 3.US,using partial link text.
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_116 {
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.partialLinkText("United")).click();
		String name ="United";
		for(int i=0;i<3;i++) {
			System.out.println(driver.findElement(By.partialLinkText("United")));
		}
		
	}

}

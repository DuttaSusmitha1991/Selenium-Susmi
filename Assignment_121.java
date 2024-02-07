package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch GrowTechminds registration form,locate every element except Dropdowns
//and Upload file button and perform action on each element using WebElement
public class Assignment_121 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	WebElement element =driver.findElement(By.name("fname"));
	element.sendKeys("Dutta");	
	WebElement element1=driver.findElement(By.name("lname"));
	element1.sendKeys("Susmitha");
	WebElement element2 = driver.findElement(By.name("Username"));
	element2.sendKeys("Dutta Susmitha");
	WebElement element3 =driver.findElement(By.xpath("//input[@type='password']"));
	element3.sendKeys("Susmi@199111");
	WebElement element4 = driver.findElement(By.name("FeMale"));
	element4.click();
	WebElement element5 =driver.findElement(By.name("w3review"));
	element5.sendKeys("A-407,Allwyn Colony,Kukatpally,Hyderabad");
	WebElement element6= driver.findElement(By.xpath("//textarea[@id='Address']"));
	element6.sendKeys("A-407,Allwyn Colony,Kukatpally,Hyderabad");
	WebElement element7 =driver.findElement(By.id("Pincode"));
	element7.sendKeys("500072");
	WebElement element8 =driver.findElement(By.id("Agree"));
	element8.click();
	WebElement element9 =driver.findElement(By.xpath("(//input[@value='Submit'])[2]"));
	element9.click();
}
}

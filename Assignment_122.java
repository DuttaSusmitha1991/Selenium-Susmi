package Assignments_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//Launch GrowTechminds registration form,Enter "Manish Kumar Tiwari" in 
//the firstname and copy paste in all 4 text fields using keys
import org.openqa.selenium.chrome.ChromeDriver;
//Launch GrowTechminds registration form,Enter "Manish Kumar Tiwari" in the firstname and copy paste 
//in all 4 text fields using keys
public class Assignment_122 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.name("fname"));
		element.sendKeys("Manish Kumar Tiwari");
		element.sendKeys(Keys.CONTROL +"a");
		element.sendKeys(Keys.CONTROL +"C");
		driver.findElement(By.name("lname")).sendKeys(Keys.CONTROL +"V");
		driver.findElement(By.name("Username")).sendKeys(Keys.CONTROL +"V");
		driver.findElement(By.name("password")).sendKeys(Keys.CONTROL +"V");
			}
}

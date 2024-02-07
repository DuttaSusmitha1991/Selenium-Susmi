package Assignments_Selenium;
//launch amazon.in select category dropdown,select Books using arrow down key then search 
//for software in search text field and press enter using keys function.
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_119 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://amazon.in/");
	driver.manage().window().maximize();
	WebElement element = driver .findElement(By.id("searchDropdownBox"));
	Thread.sleep(3000);
	for(int i=0;i<11;i++) {
	element.sendKeys(Keys.ARROW_DOWN);}
	 WebElement element1= driver.findElement(By.id("twotabsearchtextbox"));
	 Thread.sleep(3000);
	 element1.sendKeys("software");
	 element1.sendKeys(Keys.ENTER);
}
}

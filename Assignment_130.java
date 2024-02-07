package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch online sbi link,click on login button, and inspect /
//username,password and captcha
public class Assignment_130 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement login =driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		login.click();
		WebElement User =driver.findElement(By.id("username"));
		User.sendKeys("DuttaSusmitha");
		WebElement pass =driver.findElement(By.name("password"));
		pass.sendKeys("Susmi@1991");
		WebElement catche =driver.findElement(By.id("loginCaptchaValue"));
		catche.sendKeys("AcSWe");
			}

}

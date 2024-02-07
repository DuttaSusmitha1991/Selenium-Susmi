package Assignments_Selenium;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;
//Get the title of flipkart.com and save each word in an array
public class Assignment_111 {
public static void main(String[] args) {
		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://www.flipkart.com/");
		String title =  c1.getTitle();
		System.out.println(title);
		String aa[]= title.split(" ");
		System.out.println(Arrays.toString(aa));
		String one =aa[0];
		System.out.println(one);
		String two = aa[1];
		System.out.println(two);
		String three =aa[2];
		System.out.println(three);//Similarly we can print all by using aa[index num]    
		c1.quit();
	}
}

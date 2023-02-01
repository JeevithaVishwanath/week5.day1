package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAbsoluteUsage {

	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");
		String text1 = driver.findElement(By.xpath("(//table)[1]//tr//td[text()='70.4%']")).getText();
		System.out.println("Absolute Usage of jQuery is " + text1 );
		String text2 = driver.findElement(By.xpath("(//table)[1]//tr//td[text()='12.4%']")).getText();
		System.out.println("Absolute Usage of Bootstrap is " + text2);
		String text3 = driver.findElement(By.xpath("(//table)[1]//tr//td[text()='10.5%']")).getText();
		System.out.println("Absolute Usage of Modernizr is " + text3);
		

	}

}

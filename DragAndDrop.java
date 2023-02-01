package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.leafground.com/drag.xhtml");
		  WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		  Actions builder =new Actions(driver);
		  builder.dragAndDropBy(drag, 300, 300).perform();
		  WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		  WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		  Actions droppable =new Actions(driver);
		  droppable.dragAndDrop(source, target).perform();
		  String text = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
		  System.out.println(text);
		  
		 
		  

	}

}

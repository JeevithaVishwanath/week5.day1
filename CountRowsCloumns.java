package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRowsCloumns {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://html.com/tags/table/");

		 List<WebElement> ColumnCount1 = driver.findElements(By.xpath("(//table)[1]//th"));
		 System.out.println("Column count of first table is "+ ColumnCount1.size());
		 List<WebElement> RowCount1 = driver.findElements(By.xpath("(//table)[1]//tr"));
		 System.out.println("Row count of first table is" + RowCount1.size());
		 List<WebElement> ColumnCount2 =
		 driver.findElements(By.xpath("(//table)[2]//th"));
         System.out.println("Column count of second table is" + ColumnCount2.size());
		 List<WebElement> RowCount2 =
	     driver.findElements(By.xpath("(//table)[2]//tr"));
	     System.out.println("Row count of second table is " + RowCount2.size());
		 
		 
	}

}

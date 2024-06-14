package week3.day2assingments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='facet-linkfref ']//following::label[@for='Men']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='rilrtl-list ']//following::label[@for='Men - Fashion Bags']")).click();
		//driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet-linkname-l1l3nestedcategory')])[2]")).click();

	}

}

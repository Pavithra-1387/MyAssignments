package week4assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		List<String> windows =new ArrayList<String>(windowhandles);
		driver.switchTo().window(windows.get(1));
		String ratings = driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative']/span[@class='a-size-base a-color-base'])[1]")).getText();
		System.out.println(ratings);
		driver.findElement(By.xpath("//div[@class='imgTagWrapper']/img")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement musvr = driver.findElement(By.xpath("//div[@class='ivThumb selected']"));
		Actions act= new Actions(driver);
		act.moveToElement(musvr).perform();
		File src=driver.getScreenshotAs(OutputType.FILE);
		File img=new File("screenshot.png");
		FileUtils.copyFile(src, img);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-close'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String cartprice=driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("cart price ="+cartprice);
		if(price==cartprice) {
			System.out.println("first item price and cart price matched");	
		}
		else {
			System.out.println("price not matched");
		}
		driver.quit();
		
	}

}

package week4assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBastket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement mouseover = driver.findElement(By.xpath("//div[@class='Header___StyledCategoryMenu2-sc-19kl9m3-13 ibVaum']//a[text()='Foodgrains, Oil & Masala']"));
		Actions act =new Actions(driver);
		act.moveToElement(mouseover).perform();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement movsr = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(movsr).perform();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.xpath("(//div[@class='flex flex-col p-2.5 border border-silverSurfer-200 rounded-2xs '])[2]//input[@for='i-BBRoyal']")).click();
		driver.findElement(By.xpath("(//section[@class='slug___StyledMotionSection-sc-1pgl3kl-1 gzSUtc']//following::label[@for='i-BBRoyal'])")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni')]/ancestor::a")).click();
		//driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']")).click();
		Set<String> windowhandles=driver.getWindowHandles();
		List<String> windows =new ArrayList<String>(windowhandles);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("//span[text()='5 kg']")).click();
		String price=driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']")).getText();
		System.out.println(price);
		String priceReplace=price.replaceAll("Price: ₹","");
		System.out.println(priceReplace);
		driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		//String add_cart_message=driver.findElement(By.xpath("p[@class='mx-4 flex-1']")).getText();
		//System.out.println(add_cart_message);
		


	}

}

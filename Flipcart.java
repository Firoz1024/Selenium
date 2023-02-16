package objectRepository;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");

		WebElement popUpElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		if (popUpElement.isEnabled()) {
			popUpElement.click();
		}

		driver.findElement(By.name("q")).sendKeys("ipad");

		driver.findElement(By.xpath("//span[text()='ipad']")).click();

		driver.findElement(By.xpath("//div[@class='_1TmfNK']")).click();

		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();

		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();

		driver.findElement(By.xpath("//span[text()='Place Order']")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9535718116");

	}

}

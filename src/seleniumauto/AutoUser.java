package seleniumauto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class AutoUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Open chrome browser
		
		//2.facebook home page
		
		System.setProperty("webdriver.chrome.driver", "/home/sivaops7/Devops/selenium/chrome/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?");
		
		//click signin page
		
		WebElement sigUp= driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		sigUp.click();
		
		WebElement sigMail= driver.findElement(By.name("email_create"));
		sigMail.sendKeys("sivabalanam91@icloud.com");
		
		WebElement suCreate= driver.findElement(By.name("SubmitCreate"));
		suCreate.click();
		
		// driver.quit();

	}

}

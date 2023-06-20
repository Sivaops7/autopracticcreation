package seleniumauto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select; 

public class AutoUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Open chrome browser
		
		//2.automationpractice home page
		
		System.setProperty("webdriver.chrome.driver", "/home/sivaops7/Devops/selenium/chrome/chromedriver");
		
		
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		ChromeOptions coptions =new ChromeOptions();
		coptions.merge(dc);
		
		WebDriver driver = new ChromeDriver(coptions);
		
		//driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account#account-creation");
		
		driver.get("http://www.automationpractice.pl/index.php?");
		
		//click signin page
		
		WebElement sigUp= driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		sigUp.click();
		
		WebElement sigMail= driver.findElement(By.name("email_create"));
		sigMail.sendKeys("sivabalanam91@icloud.com");
		
		WebElement suCreate= driver.findElement(By.name("SubmitCreate"));
		suCreate.click();
		
		
		WebElement GenDer= driver.findElement(By.name("id_gender"));
		
		Select select = new Select(GenDer);
		
		select.selectByValue("1");
				
		WebElement creName= driver.findElement(By.name("customer_firstname"));
		creName.sendKeys("siva");
		
		WebElement laName= driver.findElement(By.name("customer_lastname"));
		laName.sendKeys("Balan");
		
		WebElement passWord= driver.findElement(By.name("passwd"));
		passWord.sendKeys("siva1234");
		
		WebElement dropDown1= driver.findElement(By.name("days"));
		
		Select select1 = new Select(dropDown1);
		
		select.selectByValue("7");
		
		WebElement dropDown2= driver.findElement(By.name("months"));
		
		Select select2 = new Select(dropDown2);
		
		select.selectByValue("4");
		
		WebElement dropDown3= driver.findElement(By.name("year"));
		
		Select select3 = new Select(dropDown3);
		
		select.selectByValue("1992");
		
		
		
		
		// driver.quit();

	}

}

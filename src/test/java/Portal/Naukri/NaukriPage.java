package Portal.Naukri;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class NaukriPage {
	
	WebDriver driver; //this.driver
	By login=By.linkText("LOGIN");
	By userName1=By.xpath("//input[@placeholder='Enter your active Email ID / Username']");
	By  password1 = By.xpath("//input[@placeholder='Enter your password']");
	By  loginButton = By.cssSelector("#root > div.naukri-drawer.right.open > div.drawer-wrapper > div > form > div:nth-child(6) > button");
	By viewAll = By.cssSelector("div#root>div>div>span>div>div>div>div:nth-of-type(2)>div>div>section>div:nth-of-type(2)>div>div:nth-of-type(3)>a");
	By notifications = By.xpath("//div[@class='topIcon notify']");
	By search = By.xpath("//input[@placeholder='Search jobs by Skills, Designation, Companies']");
	By submit = By.xpath("//button[@type='submit']");
	
	

public NaukriPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver = driver;
}

	//create function for action 
	public void clicklogin() throws InterruptedException {
	driver.findElement(login).click();	
	Thread.sleep(1000);
	
}

	public void setuserName1(String user) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(userName1).sendKeys(user);
		Thread.sleep(2000);
		
	}

	public void setPassword1(String pass) {
		// TODO Auto-generated method stub
		driver.findElement(password1).sendKeys(pass);		

		
	}
	
	public void loginButton() throws InterruptedException {
		driver.findElement(loginButton).click();	
		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	      Thread.sleep(5000);
	      js.executeScript("window.scrollBy(0,500)");
	      Thread.sleep(10000);
	}
	      
	 public void viewAll() throws InterruptedException {
		 driver.findElement(viewAll).click();
	      Thread.sleep(1000);
	      
	 }
	 
	

	public void notifications() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(notifications).click();
	      Thread.sleep(2000);
	      driver.navigate().back();
	      
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      Thread.sleep(5000);
	      js.executeScript("window.scrollBy(0,-500)");
	      Thread.sleep(10000);
		
	}
	
	public void setsearch(String user) {
		driver.findElement(search).sendKeys(user);
	    driver.findElement(submit).click();
	
	}

		}

	




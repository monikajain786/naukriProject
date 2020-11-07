package Portal.Naukri;

import org.testng.annotations.Test;

import Portal.Naukri.NaukriPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NaukriLogin {
	
	

	
	WebDriver driver =null;
	NaukriPage login=null;
	
  @Test
  public void f() throws InterruptedException{
	  login.clicklogin();
	  login.setuserName1("monika6.jain2015@gmail.com");
	  login.setPassword1("omsainath7869");
	  login.loginButton();
	  Thread.sleep(5000);
	  login.viewAll();
	  login.notifications();
	  Thread.sleep(2000);
	  login.setsearch("deloitte");
  }
  
 
  @BeforeTest
  public void beforeTest()  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver_win32t\\chromedriver.exe");  
	  driver =new ChromeDriver();
	  driver.get("https://www.naukri.com/");
	  driver.manage().window().maximize();
	  login = new NaukriPage(driver);
	 
	  
	  
  }


}



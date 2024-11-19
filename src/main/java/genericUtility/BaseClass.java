package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import objectRepo.HomePage;
import objectRepo.LoginPage;

public class BaseClass {
 
	public WebDriver driver;

	public PropertiesUtility pu=new PropertiesUtility();
	public ExcelUtility ex=new ExcelUtility();
	public JavaUtility jx=new JavaUtility();
	public SeleniumUtility su=new SeleniumUtility();
	@BeforeSuite
	public void DBConnection()
	{
		System.out.println("db connection created");
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void launchBrowser(@Optional("chrome")String BROWSER )throws Exception
	{
		if(BROWSER.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver= new ChromeDriver();
		su.implicitwait(driver,20);
		su.MaximizeWindow(driver);
		String Url=pu.getDataFromPropertiesFile("url");
		su.NavigateToUrl(driver, Url);
		System.out.println("browser launch succesfully");
	}
	@BeforeMethod(alwaysRun=true)
	public void loginOperation()throws Exception
	{
		String UN=pu.getDataFromPropertiesFile("username");
		String PWD=pu.getDataFromPropertiesFile("password");
		LoginPage l=new LoginPage(driver);
		l.loginToApp(UN, PWD);
		System.out.println("login done succesfully");
	}
	@AfterMethod(alwaysRun=true)
	public void loginOutOperation()throws Exception
	{
		HomePage h=new HomePage(driver);
		h.getsignOut(driver);
		System.out.println("logout done");
	}
	@AfterClass(alwaysRun=true)
	public void CloseBrowser()
	{
		driver.close();
		System.out.println("browser close succesfully");
	}
	@AfterSuite(alwaysRun=true)
	public void SingOutOperation()
	{
		System.out.println("close the db connection");
	}

}


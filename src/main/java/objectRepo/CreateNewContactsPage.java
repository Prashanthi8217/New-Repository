package objectRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage {
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastName;
	@FindBy(xpath="//input[@name='title']")
	private WebElement Title;
	@FindBy(xpath="//input[@class='crmButton small save']")
	private WebElement SaveButton;
	public CreateNewContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	
	public WebElement getTitle() {
		return Title;
	}
	
	public WebElement getSaveButton() {
		return SaveButton;
	}
	public void createNewContact(String fname,String lname,String title)
	{
		getFirstName().sendKeys(fname);
		getLastName().sendKeys(lname);
		getTitle().sendKeys(title);
	}

}

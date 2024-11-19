package TC_Repo;
	import org.openqa.selenium.WebDriver;
	import org.testng.annotations.Test;

	import objectRepo.CreateNewLeadPage;
	import objectRepo.HomePage;
	import objectRepo.LeadsPage;
	import genericUtility.BaseClass;

	public class LE_003 extends BaseClass {
		@Test
		public void TestCase3 ()throws Exception
		{
				HomePage h=new HomePage(driver);
				h.clickoncontactsmenu();
				LeadsPage led=new LeadsPage(driver);
				led.getCreateNewLeadIcon();
				CreateNewLeadPage cn=new CreateNewLeadPage(driver);
				 String fname=ex.getDataFromExcel("Leads", 7, 1);
				 String lastName=ex.getDataFromExcel("Leads", 7, 2);
				 String Company=ex.getDataFromExcel("Leads", 7, 3);
				 cn.CreateNewLead(lastName, lastName,  Company);

		}
	}
	

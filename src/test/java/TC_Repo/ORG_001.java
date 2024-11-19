package TC_Repo;

	import org.testng.annotations.Test;

	import objectRepo.CreateNewOrganizationPage;
	import objectRepo.HomePage;
	import objectRepo.OrganizationPage;
	import genericUtility.BaseClass;

	public class ORG_001 extends BaseClass{
		@Test(groups="smoke")
		public void org_001() throws Exception
		{
	       
			HomePage h=new HomePage(driver);
			h.clickoncontactsmenu();
			OrganizationPage og=new OrganizationPage(driver);
			og.clickOnCreateNewOrganizationIcon();
			CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
			String orgname=ex.getDataFromExcel("Organizations", 1,1);
			String website=ex.getDataFromExcel("Organizations", 1,2);
			String empname=ex.getDataFromExcel("Organizations", 1,3);
			co.CreateNewOrganization(orgname, website, empname);
			System.out.println("testcase org1 is executed");
		}

	}


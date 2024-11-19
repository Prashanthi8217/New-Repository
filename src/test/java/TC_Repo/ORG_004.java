package TC_Repo;

	import org.testng.annotations.Test;

	import objectRepo.CreateNewOrganizationPage;
	import objectRepo.HomePage;
	import objectRepo.OrganizationPage;
	import genericUtility.BaseClass;

	public class ORG_004 extends BaseClass{
		@Test
		public void org_004() throws Exception
		{
			HomePage h=new HomePage(driver);
			h.clickonorganizationmenu();
			OrganizationPage og=new OrganizationPage(driver);
			og.clickOnCreateNewOrganizationIcon();
			CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
			String orgname=ex.getDataFromExcel("Organizations", 10,1);
			String website=ex.getDataFromExcel("Organizations", 10,2);
			String empname=ex.getDataFromExcel("Organizations", 10,3);
			String phn=ex.getDataFromExcel("Organizations", 10, 4);
			String otherphn=ex.getDataFromExcel("Organizations", 10, 5);
			String email=ex.getDataFromExcel("Organizations", 10, 6);
			String billingAddress=ex.getDataFromExcel("Organizations", 10,7);
			String billingCity=ex.getDataFromExcel("Organizations", 10, 8);
			String billingState=ex.getDataFromExcel("Organizations", 10, 9);
			co.CreateNewOrganization(orgname, website, empname, phn, otherphn, email, billingAddress, billingCity, billingState);

		}

	}


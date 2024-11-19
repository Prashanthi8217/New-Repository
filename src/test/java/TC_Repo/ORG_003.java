package TC_Repo;

	import org.testng.annotations.Test;

	import objectRepo.CreateNewOrganizationPage;
	import objectRepo.HomePage;
	import objectRepo.OrganizationPage;
	import genericUtility.BaseClass;

	public class ORG_003 extends BaseClass {
		@Test
		public void org_003() throws Exception
		{
			HomePage h=new HomePage(driver);
			h.clickonorganizationmenu();
			OrganizationPage og=new OrganizationPage(driver);
			og.clickOnCreateNewOrganizationIcon();
			CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
			String orgname=ex.getDataFromExcel("Organizations", 7,1);
			String website=ex.getDataFromExcel("Organizations", 7,2);
			String billingAddress=ex.getDataFromExcel("Organizations", 7,3);
			String billingCity=ex.getDataFromExcel("Organizations", 7, 4);
			String billingState=ex.getDataFromExcel("Organizations", 7, 5);
			co.CreateNewOrganization(orgname, website, billingAddress, billingCity, billingState);

		}

	}


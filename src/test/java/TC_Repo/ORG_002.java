package TC_Repo;

	import org.testng.annotations.Test;

	import objectRepo.CreateNewOrganizationPage;
	import objectRepo.HomePage;
	import objectRepo.OrganizationPage;
	import genericUtility.BaseClass;

	public class ORG_002 extends BaseClass {
		@Test(groups= {"smoke","Regression"})
		public void org_002() throws Exception
		{
		HomePage h=new HomePage(driver);
		h.clickonorganizationmenu();
		OrganizationPage og=new OrganizationPage(driver);
		og.clickOnCreateNewOrganizationIcon();
		CreateNewOrganizationPage co=new CreateNewOrganizationPage(driver);
		String orgname=ex.getDataFromExcel("Organizations", 4,1);
		String website=ex.getDataFromExcel("Organizations", 4,2);
		String empname=ex.getDataFromExcel("Organizations", 4,3);
		String phn=ex.getDataFromExcel("Organizations", 4, 4);
		String otherphn=ex.getDataFromExcel("Organizations", 4, 5);
		String email=ex.getDataFromExcel("Organizations", 4, 6);
		co.CreateNewOrganization(orgname, website, empname, phn, otherphn, email, phn, otherphn, email);
		System.out.println("testcase org2 is executed");
		}
	}

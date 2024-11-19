package TC_Repo;
import org.testng.annotations.Test;

import objectRepo.CreateNewLeadPage;
import objectRepo.HomePage;
import objectRepo.LeadsPage;
import genericUtility.BaseClass;

public class LE_001 extends BaseClass {
	@Test
	public void le_001() throws Exception
	{
		System.out.println("Test method started");
		HomePage h=new HomePage(driver);
		h.clickonleedsmenu();
		LeadsPage l= new LeadsPage(driver);
		l.clickOnCreateNewLeadIcon();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		String fname=ex.getDataFromExcel("Leads", 1, 1);
		String lname=ex.getDataFromExcel("Leads", 1, 2);
		String company=ex.getDataFromExcel("Leads", 1, 3);
		cn.CreateNewLead(fname, lname, company);

	}

}

package TC_Repo;

	import org.testng.annotations.Test;
	import objectRepo.ContactsPage;
    import objectRepo.CreateNewContactsPage;
    import objectRepo.HomePage;
	import genericUtility.BaseClass;

	public class CON_001 extends BaseClass {
		@Test
		public void con_001() throws Exception
		{
			HomePage h=new HomePage(driver);
			h.clickoncontactsmenu();
			ContactsPage cp=new ContactsPage(driver);
			cp.clickOnCreateContact();
			CreateNewContactsPage cnp=new CreateNewContactsPage(driver);
			String fname=ex.getDataFromExcel("Contacts", 1, 1);
			String lname=ex.getDataFromExcel("Contacts", 1, 2);
			String title=ex.getDataFromExcel("Contacts", 1, 3);
			cnp.createNewContact(fname, lname, title);

		}
		
		

	}


package busbooking;


	import com.busbooking.pages.BusBookingPage;
	import com.busbooking.utils.ExcelReader;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import java.io.IOException;

	public class BusBookingTest {
	    WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        // Setup WebDriver (ChromeDriver example)
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");
	    }

	    @Test(dataProvider = "busBookingData")
	    public void testBusBooking( String from, String to, String date) {
	        BusBookingPage bookingPage = new BusBookingPage(driver);
	        
	        bookingPage.selectFromPlace(from);
	        bookingPage.selectToPlace(to);
	        bookingPage.selectTravelDate(date);
	        bookingPage.clickSearchButton();

	        // Verifying that search results are displayed after clicking the search button
	        Assert.assertTrue(bookingPage.isSearchResultDisplayed(), "Search results not displayed!");
	    }

	    @DataProvider(name = "busBookingData")
	    public Object[][] getData() throws IOException {
	        return ExcelReader.getTestData("src/test/resources/testdata/BusBookingData.xlsx", "Sheet1");
	    }
	}


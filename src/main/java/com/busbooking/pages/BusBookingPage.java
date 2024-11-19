package com.busbooking.pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class BusBookingPage {
	    WebDriver driver;

	    // Locators
	    private By fromDropdown = By.id("txtOriginGeneral");
	    private By toDropdown = By.id("txtDestinationGeneral");
	    private By dateField = By.id("txtDepartDateBooking");
	    private By searchButton = By.id("btnBusSearchNewGeneral");

	    public BusBookingPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Actions
	    public void selectFromPlace(String fromPlace) {
	        driver.findElement(By.id("txtOriginGeneral")).sendKeys("Cameron HighLands");
	    }

	    public void selectToPlace(String toPlace) {
	        driver.findElement( By.id("txtDestinationGeneral")).sendKeys("Kaula lampur");
	    }

	    public void selectTravelDate(String date) {
	        driver.findElement(By.id("txtDepartDateBooking")).sendKeys("20-12-2024");
	    }

	    public void clickSearchButton() {
	        driver.findElement(By.id("btnBusSearchNewGeneral")).click();
	    }

	    public boolean isSearchResultDisplayed() {
	        WebElement result = driver.findElement(By.className("class='btn btn-orange w-100"));
	        return result.isDisplayed();
	    }
	}





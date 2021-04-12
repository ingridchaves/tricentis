    package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Vehichle extends BaseClass {

    public Vehichle(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }
    
    
    @FindBy (id = "make")
    @CacheLookup
    private WebElement make;

    
    @FindBy (id = "engineperformance")
    @CacheLookup
    private WebElement enginePerformance;
    
    @FindBy (id = "dateofmanufacture")
    @CacheLookup
    private WebElement dateOfManuFacture;
    
    @FindBy (id = "numberofseats")
    @CacheLookup
    private WebElement numberOfSeats;
    
    @FindBy (id = "fuel")
    @CacheLookup
    private WebElement fuel;
    
    @FindBy (id = "listprice")
    @CacheLookup
    private WebElement listPrice;
    
    @FindBy (id = "licenseplatenumber")
    @CacheLookup
    private WebElement licensePlateNumber;
    
    @FindBy (id = "annualmileage")
    @CacheLookup
    private WebElement annualMileage;
    
    @FindBy (id = "nextenterinsurantdata")
    @CacheLookup
    private WebElement nextEnterInsurantData;
    
    public boolean vehicleDataPageIsDisplayed() {

        WaitUntilElementVisible(make);
        make.isDisplayed();
        WaitUntilElementVisible(enginePerformance);
        enginePerformance.isDisplayed();
        WaitUntilElementVisible(dateOfManuFacture);
        dateOfManuFacture.isDisplayed();
        WaitUntilElementVisible(numberOfSeats);
        numberOfSeats.isDisplayed();
        WaitUntilElementVisible(fuel);
        fuel.isDisplayed();
        WaitUntilElementVisible(listPrice);
        listPrice.isDisplayed();
        WaitUntilElementVisible(licensePlateNumber);
        licensePlateNumber.isDisplayed();
        WaitUntilElementVisible(annualMileage);
        annualMileage.isDisplayed();
        WaitUntilElementVisible(nextEnterInsurantData);
        nextEnterInsurantData.isDisplayed();
        return true;
    }
    public void fillMakeData() {
        WaitUntilElementVisible(make);
        make.isEnabled();
        Select dropdown= new Select(make);
        dropdown.selectByVisibleText("BMW");
    }
    public void fillPerformanceData() {
          WaitUntilElementVisible(enginePerformance);
          enginePerformance.isEnabled();
          enginePerformance.sendKeys("500");
      }
    public void fillDateOfManufactureData() {
          WaitUntilElementVisible(dateOfManuFacture);
          dateOfManuFacture.isEnabled();
          dateOfManuFacture.sendKeys("01/01/2000");
      }
    public void fillnumberOfSeatsData() {
          WaitUntilElementVisible(numberOfSeats);
          numberOfSeats.isEnabled();
          Select dropdown= new Select(numberOfSeats);
          dropdown.selectByVisibleText("5");
      }
    public void fillfuelData() {
        WaitUntilElementVisible(fuel);
        fuel.isEnabled();
        Select dropdown= new Select(fuel);
        dropdown.selectByVisibleText("Petrol");
    }
    public void filllistPriceData() {
        WaitUntilElementVisible(listPrice);
        listPrice.isEnabled();
        listPrice.sendKeys("50000");
    }
    public void filllicensePlateNumberData() {
        WaitUntilElementVisible(licensePlateNumber);
        licensePlateNumber.isEnabled();
        licensePlateNumber.sendKeys("12345");
    }
    public void fillannualMileageData() {
        WaitUntilElementVisible(annualMileage);
        annualMileage.isEnabled();
        annualMileage.sendKeys("5000");
    }
    public void clickSignInButton() {

        WaitUntilElementVisible(nextEnterInsurantData);
        nextEnterInsurantData.isEnabled();
        nextEnterInsurantData.click();
    }
    
}
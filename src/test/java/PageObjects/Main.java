package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main extends BaseClass {

    public Main(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    private final String insuranceForm = "[id = 'insurance-form']";    
    
    @FindBy (id = insuranceForm + "[id = 'make']")
    @CacheLookup
    private WebElement make;
    
    @FindBy (id = insuranceForm + "[id = 'enginePerformance']")
    @CacheLookup
    private WebElement engineperformance;
    
    @FindBy (id = insuranceForm + "[id = 'dateOfManuFacture']")
    @CacheLookup
    private WebElement dateOfManuFacture;
    
    @FindBy (id = insuranceForm + "[id = 'numberofSeats']")
    @CacheLookup
    private WebElement numberofSeats;
    
    @FindBy (id = insuranceForm + "[id = 'fuel']")
    @CacheLookup
    private WebElement fuel;
    
    @FindBy (id = insuranceForm + "[id = 'listprice']")
    @CacheLookup
    private WebElement listprice;
    
    @FindBy (id = insuranceForm + "[id = 'licensePlateNumber']")
    @CacheLookup
    private WebElement licensePlateNumber;
    
    @FindBy (id = insuranceForm + "[id = 'annualMileage']")
    @CacheLookup
    private WebElement annualMileage;
    
    @FindBy (id = insuranceForm + "[id = 'nextEnterInsurantData']")
    @CacheLookup
    private WebElement nextEnterInsurantData;
    
    

}
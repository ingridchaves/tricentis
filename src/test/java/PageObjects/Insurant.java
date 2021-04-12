package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insurant extends BaseClass {

    public Insurant(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

 private final String insuranceForm = "[id = 'insurance-form']";    
    
    @FindBy (id = insuranceForm + "[id = 'firstName']")
    @CacheLookup
    private WebElement firstName;
    
    @FindBy (id = insuranceForm + "[id = 'lastName']")
    @CacheLookup
    private WebElement lastName;
    
    @FindBy (id = insuranceForm + "[id = 'birthdate']")
    @CacheLookup
    private WebElement birthdate;
    
    @FindBy (id = insuranceForm + "[id = 'genderMale']")
    @CacheLookup
    private WebElement genderMale;
    
    @FindBy (id = insuranceForm + "[id = 'streetAddress']")
    @CacheLookup
    private WebElement streetAddress;
    
    @FindBy (id = insuranceForm + "[id = 'country']")
    @CacheLookup
    private WebElement country;
    
    @FindBy (id = insuranceForm + "[id = 'zipCode']")
    @CacheLookup
    private WebElement zipCode;
    
    @FindBy (id = insuranceForm + "[id = 'city']")
    @CacheLookup
    private WebElement city;
    
    @FindBy (id = insuranceForm + "[id = 'occupation']")
    @CacheLookup
    private WebElement occupation;
    
    @FindBy (id = insuranceForm + "[id = 'speeding']")
    @CacheLookup
    private WebElement speeding;
    
    @FindBy (id = insuranceForm + "[id = 'website']")
    @CacheLookup
    private WebElement website;
    
    @FindBy (id = insuranceForm + "[id = 'open']")
    @CacheLookup
    private WebElement open;
    
    @FindBy (id = insuranceForm + "[id = 'nextenterproductdata']")
    @CacheLookup
    private WebElement nextenterproductdata;
    
    


}
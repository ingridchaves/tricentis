package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Insurant extends BaseClass {

    public Insurant(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }
    
    @FindBy (id ="firstname")
    @CacheLookup
    private WebElement firstName;
    
    @FindBy (id = "lastname")
    @CacheLookup
    private WebElement lastName;
    
    @FindBy (id = "birthdate")
    @CacheLookup
    private WebElement birthdate;
    
    @FindBy (css = "#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span")
    @CacheLookup
    private WebElement genderMale;

    
    @FindBy (id = "streetaddress")
    @CacheLookup
    private WebElement streetAddress;
    
    @FindBy (id = "country")
    @CacheLookup
    private WebElement country;
    
    @FindBy (id = "zipcode")
    @CacheLookup
    private WebElement zipCode;
    
    @FindBy (id = "city")
    @CacheLookup
    private WebElement city;
    
    @FindBy (id = "occupation")
    @CacheLookup
    private WebElement occupation;
    
    @FindBy (css = "#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span")
    @CacheLookup
    private WebElement speeding;
    
    @FindBy (id = "website")
    @CacheLookup
    private WebElement webSite;
    
    @FindBy (id = "open")
    @CacheLookup
    private WebElement open;
    
    @FindBy (id = "nextenterproductdata")
    @CacheLookup
    private WebElement nextEnterProductData;
    
    public boolean insurantDataPageIsDisplayed() {

        WaitUntilElementVisible(firstName);
        firstName.isDisplayed();
        WaitUntilElementVisible(lastName);
        lastName.isDisplayed();
        WaitUntilElementVisible(birthdate);
        birthdate.isDisplayed();
        WaitUntilElementVisible(genderMale);
        genderMale.isDisplayed();
        WaitUntilElementVisible(streetAddress);
        streetAddress.isDisplayed();
        WaitUntilElementVisible(country);
        country.isDisplayed();
        WaitUntilElementVisible(zipCode);
        zipCode.isDisplayed();
        WaitUntilElementVisible(city);
        city.isDisplayed();
        WaitUntilElementVisible(occupation);
        occupation.isDisplayed();
        WaitUntilElementVisible(speeding);
        speeding.isDisplayed();
        WaitUntilElementVisible(webSite);
        webSite.isDisplayed();
        WaitUntilElementVisible(open);
        occupation.isDisplayed();
        WaitUntilElementVisible(nextEnterProductData);
        nextEnterProductData.isDisplayed();
        return true;
    }
    
    public void fillFirstNameData() {
        WaitUntilElementVisible(firstName);
        firstName.isEnabled();
        firstName.sendKeys("Joao");
    }
    
    public void fillLastNameData() {
        WaitUntilElementVisible(lastName);
        lastName.isEnabled();
        lastName.sendKeys("Silva");
    }

    public void fillBirthdateData() {
	    WaitUntilElementVisible(birthdate);
	    birthdate.isEnabled();
	    birthdate.sendKeys("01/01/2000");
    }
    
    public void filGenderMaleData() {
        WaitUntilElementVisible(genderMale);
        genderMale.isEnabled();
        genderMale.click();
	}

	public void fillStreetAddressData() {
        WaitUntilElementVisible(streetAddress);
        streetAddress.isEnabled();
        streetAddress.sendKeys("xxxxxx , 00");
		}
    
	public void fillCountryData() {
        WaitUntilElementVisible(country);
        country.isEnabled();
        Select dropdown= new Select(country);
        dropdown.selectByVisibleText("Brazil");
    }
    
    public void fillZipCodeData() {
    WaitUntilElementVisible(zipCode);
    zipCode.isEnabled();
    zipCode.sendKeys("87654321");
	}
    
    public void fillCityData() {
    WaitUntilElementVisible(city);
    city.isEnabled();
    city.sendKeys("xxxxxxxx xxxxxxx");
	}
    	 
    public void fillOcupationData() {
        WaitUntilElementVisible(occupation);
        occupation.isEnabled();
        Select dropdown= new Select(occupation);
        dropdown.selectByVisibleText("Public Official");
    }
    
    public void filHobbiesData() {
        WaitUntilElementVisible(speeding);
        speeding.isEnabled();
        speeding.click();
	}
    
	public void fillWebSiteData() {
        WaitUntilElementVisible(webSite);
        webSite.isEnabled();
        webSite.sendKeys("www.xxxx.com.br");
		}
    
    public void clickSignInButton() {
        WaitUntilElementVisible(nextEnterProductData);
        nextEnterProductData.isEnabled();
        nextEnterProductData.click();
    }

}
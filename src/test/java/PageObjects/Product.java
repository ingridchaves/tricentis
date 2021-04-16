package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product extends BaseClass {

    public Product(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }
    @FindBy (id = "startdate")
    @CacheLookup
    private WebElement startdate;
    
    @FindBy (id = "insurancesum")
    @CacheLookup
    private WebElement insurancesum;
    
    @FindBy (id = "meritrating")
    @CacheLookup
    private WebElement meritrating;
    
    @FindBy (id = "damageinsurance")
    @CacheLookup
    private WebElement damageinsurance;
    
    @FindBy (css = "#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span")
    @CacheLookup
    private WebElement optionalProducts;
    
    @FindBy (id = "courtesycar")
    @CacheLookup
    private WebElement courtesycar;
    
    @FindBy (id = "nextselectpriceoption")
    @CacheLookup
    private WebElement nextselectpriceoption;
    
    public boolean productDataPageIsDisplayed() {
        WaitUntilElementVisible(startdate);
        startdate.isDisplayed();
        WaitUntilElementVisible(insurancesum);
        insurancesum.isDisplayed();
        WaitUntilElementVisible(meritrating);
        meritrating.isDisplayed();
        WaitUntilElementVisible(damageinsurance);
        damageinsurance.isDisplayed();
        WaitUntilElementVisible(optionalProducts);
        optionalProducts.isDisplayed();
        WaitUntilElementVisible(courtesycar);
        courtesycar.isDisplayed();
        WaitUntilElementVisible(nextselectpriceoption);
        nextselectpriceoption.isDisplayed();
        return true;
    }
    public void fillStartDateData() {
	    WaitUntilElementVisible(startdate);
	    startdate.isEnabled();
	    startdate.sendKeys("05/31/2021");
    }
	public void fillInsuranceSumyData() {
        WaitUntilElementVisible(insurancesum);
        insurancesum.isEnabled();
        Select dropdown= new Select(insurancesum);
        dropdown.selectByVisibleText("3.000.000,00");
    }
	public void fillMeritratingData() {
        WaitUntilElementVisible(meritrating);
        meritrating.isEnabled();
        Select dropdown= new Select(meritrating);
        dropdown.selectByVisibleText("Bonus 9");
    }

	public void fillDamageInsuranceData() {
        WaitUntilElementVisible(damageinsurance);
        damageinsurance.isEnabled();
        Select dropdown= new Select(damageinsurance);
        dropdown.selectByVisibleText("No Coverage");
    }
    public void fillOptionalProductsData() {
        WaitUntilElementVisible(optionalProducts);
        optionalProducts.isEnabled();
        optionalProducts.click();
	}
	public void fillCourtesyCarData() {
        WaitUntilElementVisible(courtesycar);
        courtesycar.isEnabled();
        Select dropdown= new Select(courtesycar);
        dropdown.selectByVisibleText("Yes");
    }

    public void clickSignInButton() {
        WaitUntilElementVisible(nextselectpriceoption);
        nextselectpriceoption.isEnabled();
        nextselectpriceoption.click();
    }

}
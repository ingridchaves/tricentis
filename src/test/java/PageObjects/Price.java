package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Price extends BaseClass {

    public Price(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }
	@FindBy (css = "#priceTable > tfoot > tr > th.group > label:nth-child(4) > span")
	@CacheLookup
	private WebElement choosePrice;
	
	@FindBy (id = "nextsendquote")
	@CacheLookup
	private WebElement nextSendQuote;
	 
    public boolean priceOptionPageIsDisplayed() {
        WaitUntilElementVisible(choosePrice);
        choosePrice.isDisplayed();
        return true;
    }
    public void selectChoosePriceData() {
        WaitUntilElementVisible(choosePrice);
        choosePrice.isEnabled();
        choosePrice.click();
	}
    
    public void fillNextSendQuoteData() {
        WaitUntilElementVisible(nextSendQuote);
        nextSendQuote.isEnabled();
        nextSendQuote.click();
	}
}
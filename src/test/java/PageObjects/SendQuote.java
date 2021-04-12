package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendQuote extends BaseClass {

    public SendQuote(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    private final String headerMainMenu = "//div[@class='row main-menu-merchant']";
    private final String cartMenu = "//div[@class='navbar-cart']//a[@href='/cart']";
    private final String nav = "[nav = 'idealsteps-nav']";    
    
    @FindBy (id = nav + "[id = 'entervehicledata']")
    @CacheLookup
    private WebElement vehiclePage;
    
    @FindBy (id = nav + "[id = 'enterinsurantdata']")
    @CacheLookup
    private WebElement insurantPage;
    
    @FindBy (id = nav + "[id = 'enterproductdata']")
    @CacheLookup
    private WebElement productPage;
    
    @FindBy (id = nav + "[id = 'selectpriceoption']")
    @CacheLookup
    private WebElement pricePage;
    
    @FindBy (id = nav + "[id = 'sendquote']")
    @CacheLookup
    private WebElement sendPage;


}
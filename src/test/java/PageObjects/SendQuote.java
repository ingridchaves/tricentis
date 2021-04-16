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

    
    @FindBy (id ="email")
    @CacheLookup
    private WebElement email;
    
    @FindBy (id = "phone")
    @CacheLookup
    private WebElement phone;
    
    @FindBy (id = "username")
    @CacheLookup
    private WebElement username;
    
    @FindBy (id = "password")
    @CacheLookup
    private WebElement password;
    
    @FindBy (id = "confirmpassword")
    @CacheLookup
    private WebElement confirmpassword;
    
    @FindBy (id = "sendemail")
    @CacheLookup
    private WebElement sendemail;

    @FindBy(css = "body > div.sweet-alert.showSweetAlert.visible > h2")
    @CacheLookup
    private WebElement menssage;
    
    public boolean sendQuotePageIsDisplayed() {

        WaitUntilElementVisible(email);
        email.isDisplayed();
        WaitUntilElementVisible(phone);
        phone.isDisplayed();
        WaitUntilElementVisible(username);
        username.isDisplayed();
        WaitUntilElementVisible(password);
        password.isDisplayed();
        WaitUntilElementVisible(confirmpassword);
        confirmpassword.isDisplayed();
        WaitUntilElementVisible(sendemail);
        sendemail.isDisplayed();
        return true;
    }
    
   public void fillEmailData() {
	    WaitUntilElementVisible(email);
	    email.isEnabled();
	    email.sendKeys("test@test.com");
    }
   public void fillUserNameData() {
	    WaitUntilElementVisible(username);
	    username.isEnabled();
	    username.sendKeys("JOAOSILVA");
   }
   public void fillPasswordData() {
	    WaitUntilElementVisible(password);
	    password.isEnabled();
	    password.sendKeys("Test123");
   }

   public void fillConfirmpasswordData() {
	    WaitUntilElementVisible(confirmpassword);
	    confirmpassword.isEnabled();
	    confirmpassword.sendKeys("Test123");
    }
   public void clickSendInButton() {
       WaitUntilElementVisible(sendemail);
       sendemail.isEnabled();
       sendemail.click();
   }
	public boolean checkMenssage(){
		System.out.println("------------------começo \n");
		WaitUntilElementVisible(menssage);
		System.out.println("------------------chegou1 \n");
		menssage.isDisplayed();
		return true;
	}
    
}
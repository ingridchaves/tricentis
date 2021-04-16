package StepDefinitions;


import PageObjects.Vehichle;
import PageObjects.Insurant;
import PageObjects.Product;
import PageObjects.Price;
import PageObjects.SendQuote;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormSteps {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;

    public FormSteps() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.wait = new WebDriverWait(driver, propertiesReader.getTimeout());
    }


  @Given("^que eu esteja no forumulário de Enter Vehicle Data$")
  public void que_eu_esteja_no_forumulário_de_Enter_Vehicle_Data() throws Throwable {
	  Vehichle vehichle = new Vehichle(driver, wait);
	  vehichle.vehicleDataPageIsDisplayed();
  }

  @When("^eu clico em next enviando o formulário da aba Enter Vehicle Data preenchido$")
  public void eu_clico_em_next_enviando_o_formulário_da_aba_Enter_Vehicle_Data_preenchido() throws Throwable {
	  Vehichle vehichle = new Vehichle(driver, wait);
	  vehichle.fillMakeData();
	  vehichle.fillModelData();
	  vehichle.fillCylinderCapacityData();
	  vehichle.fillPerformanceData();
	  vehichle.fillDateOfManufactureData();
	  vehichle.filllistPriceData();
	  vehichle.fillnumberOfSeatsData();
	  vehichle.fillNumberOfSeatsMotorcycleData();
	  vehichle.fillfuelData();
	  vehichle.fillPayloadData();
	  vehichle.fillCotalWeightData();
	  vehichle.filllicensePlateNumberData();
	  vehichle.fillannualMileageData();
	  vehichle.clickSignInButton();

	  
  }

  @When("^eu clico em next enviando o formulário da aba Enter Insurant Data preenchido$")
  public void eu_clico_em_enviando_o_formulário_da_aba_Enter_Insurant_Data_preenchido() throws Throwable {
	  Insurant insurant = new Insurant(driver, wait);
	  insurant.insurantDataPageIsDisplayed();
	  insurant.fillFirstNameData();
	  insurant.fillLastNameData();
	  insurant.fillBirthdateData();
	  insurant.filGenderMaleData();	  
	  insurant.fillStreetAddressData();
	  insurant.fillCountryData();
	  insurant.fillZipCodeData();
	  insurant.fillCityData();
	  insurant.fillOcupationData();
	  insurant.filHobbiesData();
	  insurant.fillWebSiteData();
	  insurant.clickSignInButton();
  }

  @When("^eu clico em next enviando o formulário da aba Enter Product Data preenchido$")
  public void eu_clico_em_enviando_o_formulário_da_aba_Enter_Product_Data_preenchido() throws Throwable {
	  Product product= new Product(driver, wait);
	  product.productDataPageIsDisplayed();
	  product.fillStartDateData();
	  product.fillInsuranceSumyData();
	  product.fillMeritratingData();
	  product.fillDamageInsuranceData();
	  product.fillOptionalProductsData();
	  product.fillCourtesyCarData();
	  product.clickSignInButton();
  }

  @When("^eu clico em next enviando o formulário da aba Select Price Option preenchido$")
  public void eu_clico_em_enviando_o_formulário_da_aba_Select_Price_Option_preenchido() throws Throwable {
	  Price price= new Price(driver, wait);
	  System.out.println("------------------ 1");
	  price.priceOptionPageIsDisplayed();
	  System.out.println("------------------ 2");
	  price.selectChoosePriceData();
	  System.out.println("------------------ 3");
	  price.fillNextSendQuoteData();
  }

  @When("^eu clico em next enviando o formulário da aba Send Quote preenchido$")
  public void eu_clico_em_enviando_o_formulário_da_aba_Send_Quote_preenchido() throws Throwable {
	  SendQuote quote= new SendQuote(driver, wait);
	  quote.sendQuotePageIsDisplayed();
	  quote.fillEmailData();
	  quote.fillUserNameData();
	  quote.fillPasswordData();
	  quote.fillConfirmpasswordData();
	  quote.clickSendInButton();
	  
  }

  @Then("^a mensagem Sending e-mail success! é exibida na tela$")
  public void a_mensagem_Sending_e_mail_success_é_exibida_na_tela() throws Throwable {
	  SendQuote quote= new SendQuote(driver, wait);
	  System.out.println("------------------chegou2 \n");
	  quote.checkMenssage();
  }
}
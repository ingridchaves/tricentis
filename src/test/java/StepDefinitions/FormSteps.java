package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.Vehichle;
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
	  System.out.println("------------------ 1 \n");
	  Vehichle vehichle = new Vehichle(driver, wait);
	  vehichle.vehicleDataPageIsDisplayed();
	  System.out.println("------------------ 3 \n");
  }

  @When("^eu clico em next enviando o formulário da aba Enter Vehicle Data preenchido$")
  public void eu_clico_em_next_enviando_o_formulário_da_aba_Enter_Vehicle_Data_preenchido() throws Throwable {
	  System.out.println("------------------ 5 \n");
	  Vehichle vehichle = new Vehichle(driver, wait);
	  System.out.println("-------------------2/n");
	  vehichle.fillMakeData();
	  vehichle.fillPerformanceData();
	  vehichle.fillDateOfManufactureData();
	  vehichle.filllistPriceData();
	  vehichle.fillnumberOfSeatsData();
	  vehichle.fillfuelData();
	  vehichle.filllicensePlateNumberData();
	  vehichle.fillannualMileageData();
	  vehichle.clickSignInButton();

	  
  }

  @When("^eu clico em \"([^\"]*)\" enviando o formulário da aba Enter Insurant Data preenchido$")
  public void eu_clico_em_enviando_o_formulário_da_aba_Enter_Insurant_Data_preenchido(String arg1) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }

  @When("^eu clico em \"([^\"]*)\" enviando o formulário da aba Enter Product Data preenchido$")
  public void eu_clico_em_enviando_o_formulário_da_aba_Enter_Product_Data_preenchido(String arg1) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }

  @When("^eu clico em \"([^\"]*)\" enviando o formulário da aba Select Price Option preenchido$")
  public void eu_clico_em_enviando_o_formulário_da_aba_Select_Price_Option_preenchido(String arg1) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }

  @When("^eu clico em \"([^\"]*)\" enviando o formulário da aba Send Quote preenchido$")
  public void eu_clico_em_enviando_o_formulário_da_aba_Send_Quote_preenchido(String arg1) throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }

  @Then("^a mensagem “Sending e-mail success!” é exibida na tela$")
  public void a_mensagem_Sending_e_mail_success_é_exibida_na_tela() throws Throwable {
      // Write code here that turns the phrase above into concrete actions
      throw new PendingException();
  }
}
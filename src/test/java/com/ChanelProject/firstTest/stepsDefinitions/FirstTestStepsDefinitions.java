package com.ChanelProject.firstTest.stepsDefinitions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ChanelProject.utils.CommonMethods;
import com.ChanelProject.firstTest.pages.FirstTestPage;
import com.ChanelProject.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstTestStepsDefinitions extends CommonMethods{
	
	public WebDriver driver;
	private FirstTestPage firstTestPage = new FirstTestPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public  FirstTestStepsDefinitions() {
		
		driver = Setup.driver;
		PageFactory.initElements(driver, FirstTestPage.class);
		
        }
	
	@Given("^je navigue sur le site chanel$")
	public void je_navigue_sur_le_site_chanel() throws Throwable {
		
		logger.info("^je navigue sur le site chanel$");
		commonMethods.openURLWithConfigFile("url1");
	 
	}

	@Then("^je verifie si le site saffiche$")
	public void je_verifie_si_le_site_saffiche() throws Throwable {
		
		logger.info("^je verifie si le site saffiche$");
		String url1 = commonMethods.readUrl();
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.equals(url1));
		System.out.println(url1);
	}

	@When("^Je clique sur la barre de recherche$")
	public void je_clique_sur_la_barre_de_recherche() throws Throwable {
		
		
		logger.info("^Je clique sur la barre de recherche$");
		commonMethods.explicitWait(20, FirstTestPage.buttonSearch);
		firstTestPage.clickSearch();
	}

	@And("^Je Cherche le mot \"([^\"]*)\"$")
	public void je_Cherche_le_mot(String productSearch) throws Throwable {
		
		logger.info("^Je Cherche le mot \\\"([^\\\"]*)\\\"$");
		firstTestPage.searchProduct(productSearch);
		firstTestPage.click_on_search_icon();

	  
	}

	@Then("^Je Vérifie si les éléments de la liste affichée contiennent le mot \"([^\"]*)\"$")
	public void je_Vérifie_si_les_éléments_de_la_liste_affichée_contiennent_le_mot(String productSend)
			throws Throwable {

		commonMethods.explicitWait(20, FirstTestPage.viewMoreButton);
		try {
			commonMethods.scrollerBottomdown(2000);
			while (FirstTestPage.viewMoreButton.isEnabled()) {

				firstTestPage.click_on_view_more();
				Thread.sleep(3000);
			}
		} catch (Exception e) {
			logger.info(" **********  Thers's no more products to display  **********");
		}		
		int taille = firstTestPage.title_of_all_product().size();
		for (int i = 0; i < taille; i++) {
			firstTestPage.title_of_all_product();

			String title = (String) firstTestPage.title_of_all_product().get(i);

			logger.info("title of product number " + (i + 1) + " is : " + title);

			if (title.toUpperCase().contains(productSend)) {

				logger.info("product number " + (i + 1) + " contains the word \" ROUGE ALLURE \" ");
			} else

				logger.info("product number " + (i + 1) + " doesn't contains the word \" ROUGE ALLURE \" ");

		}

	}
	
	


	

}

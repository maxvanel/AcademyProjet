package com.ChanelProject.secondTest.stepsDefinitions;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ChanelProject.utils.CommonMethods;
import com.ChanelProject.firstTest.pages.FirstTestPage;
import com.ChanelProject.secondTest.pages.SecondTestPage;
import com.ChanelProject.utils.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecondTestStepsDefinitions extends CommonMethods{
	
	public WebDriver driver;
	private SecondTestPage secondTestPage = new SecondTestPage();
	private CommonMethods commonMethods = new CommonMethods();
	
	public  SecondTestStepsDefinitions() {
		
		driver = Setup.driver;
		PageFactory.initElements(driver, SecondTestPage.class);
		
	  }
	
	@When("^Accès à la catégorie Makeup$")
	public void accèsÀLaCatégorieMakeup() throws Throwable {
	    
		
		secondTestPage.click_on_makeup_category();
		commonMethods.explicitWaitVisibility(20, SecondTestPage.lipstik);
	}

	@When("^je choisie le categorie Lipstick$")
	public void jeChoisieLeCategorieLipstick() throws Throwable {
		commonMethods.scrollerBottomdown(800);
		commonMethods.explicitWaitVisibility(20, SecondTestPage.lipstik);
		secondTestPage.click_on_lipstick();

	}

	@When("^je Clique sur le produit ROUGE ALLURE$")
	public void jeCliqueSurLeProduitROUGEALLURE() throws Throwable {
		
		commonMethods.scrollerBottomdown(1400);
		secondTestPage.click_on_rouge_allure();

	}

	@When("^j Ajoute le produit au panier$")
	public void jAjouteLeProduitAuPanier() throws Throwable {
		
		commonMethods.explicitWait(20, SecondTestPage.addTOBagButton);
		secondTestPage.click_on_add_to_bag();
		commonMethods.explicitWait(20, SecondTestPage.reviewBagButton);
		secondTestPage.click_on_review_bag_button();
	}

	@Then("^verifie si le Nom de produit \"([^\"]*)\" est dans le panier$")
	public void verifieSiLeNomDeProduitEstDansLePanier(String product) throws Throwable {
		
		commonMethods.scrollerBottomdown(350);
		assertEquals(secondTestPage.check_name_product(), product);
		logger.info( "The quantity is equal to : " + secondTestPage.check_name_product() );
		
		
	}

	@Then("^verifie la quantité de produit  est egal \"([^\"]*)\"$")
	public void verifieLaQuantitéDeProduitEstEgal(String quantite) throws Throwable {
		
		
		assertEquals(secondTestPage.check_qty(), quantite);
		logger.info( "The quantity is equal to : " + secondTestPage.check_qty() );

	}

	@Then("^verifie le total panier est égal au prix du produit \"([^\"]*)\"$")
	public void verifieLeTotalPanierEstÉgalAuPrixDuProduit(String price) throws Throwable {

		commonMethods.scrollerBottomdown(500);
		System.out.println(secondTestPage.check_total_price());
		assertEquals(secondTestPage.check_total_price().contains("$45.00"),true);
		
		//logger.info("The quantity is equal to : " + secondTestPage.check_total_price());

	}


	}
	
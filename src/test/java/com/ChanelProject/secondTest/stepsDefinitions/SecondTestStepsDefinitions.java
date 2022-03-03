package com.ChanelProject.secondTest.stepsDefinitions;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	}

	@When("^je choisie le categorie Lipstick$")
	public void jeChoisieLeCategorieLipstick() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(secondTestPage.getLipstik()));
		commonMethods.scrollToElement(driver,secondTestPage.getLipstik());
		secondTestPage.click_on_lipstick();
		

	}

	@When("^je Clique sur le produit ROUGE ALLURE$")
	public void jeCliqueSurLeProduitROUGEALLURE() throws Throwable {
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.elementToBeClickable(secondTestPage.getRougeAllure()));
		//commonMethods.scrollToElement(driver, secondTestPage.getRougeAllure());
		
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
		
		Thread.sleep(3000);
		System.out.println(secondTestPage.check_name_product());
		//assertEquals(secondTestPage.check_name_product(), product);
		//logger.info( "The quantity is equal to : " + secondTestPage.check_name_product() );
		
		
	}

	@Then("^verifie la quantité de produit  est egal \"([^\"]*)\"$")
	public void verifieLaQuantitéDeProduitEstEgal(String quantite) throws Throwable {
		
		
		assertEquals(secondTestPage.check_qty(), quantite);
		logger.info( "The quantity is equal to : " + secondTestPage.check_qty() );

	}

	@Then("^verifie le total panier est égal au prix du produit \"([^\"]*)\"$")
	public void verifieLeTotalPanierEstÉgalAuPrixDuProduit(String price) throws Throwable {

		
		System.out.println(secondTestPage.check_total_price());
		assertEquals(secondTestPage.check_total_price().contains("$45.00"),true);
		
		//logger.info("The quantity is equal to : " + secondTestPage.check_total_price());

	}


	}
	
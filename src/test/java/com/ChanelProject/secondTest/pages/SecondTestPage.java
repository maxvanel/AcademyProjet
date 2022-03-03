package com.ChanelProject.secondTest.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.ChanelProject.utils.Setup;

public class SecondTestPage {
	
	WebDriver driver;

	public SecondTestPage() {
		driver = Setup.driver;
	}

final static String MAKEUP_CATEGORY = "makeup";
final static String LIPSTICK = "//a[@data-linkname=\"Lipstick\"]";
final static String ROUGE_ALLURE = "//a[@href=\"/us/makeup/p/151107/rouge-allure-luminous-intense-lip-colour/\"]";
final static String ADD_TO_BAG_BUTTON = "pos-cnc-btn";
final static String REVIEW_BAG_BUTTON = "//span[@data-test=\"btnReviewBagAndContinue\"]";
final static String QUANTITY= "prd0";
final static String TOTAL_PRICE  = "//tbody/tr[4]/td[1]";
final static String ROUGE_ALLURE_PANIER = "//span[@data-test=\"lblProductTitle_151107\"]";

	/* @FindBy */
	
	@FindBy(how = How.ID, using = MAKEUP_CATEGORY)
	public static WebElement makeupCategory;
	
	@FindBy(how = How.XPATH, using = LIPSTICK)
	public static WebElement lipstik;
	
	@FindBy(how = How.XPATH, using = ROUGE_ALLURE)
	public static WebElement rougeAllure;
	
	@FindBy(how = How.XPATH, using = ROUGE_ALLURE_PANIER)
	public static WebElement rougeAllurePanier;

	@FindBy(how = How.ID, using = ADD_TO_BAG_BUTTON)
	public static WebElement addTOBagButton;
	
	@FindBy(how = How.XPATH, using = REVIEW_BAG_BUTTON)
	public static WebElement reviewBagButton;
	
	@FindBy(how = How.ID, using = QUANTITY)
	public static WebElement quantity;
	
	@FindBy(how = How.XPATH, using = TOTAL_PRICE)
	public static WebElement totalPrice;

	
	
	/* Method */
	
public void click_on_makeup_category() {
		
	makeupCategory.click();
		
	}
	
	public void click_on_lipstick() {
		
		lipstik.click();
		
	}
	


	public void click_on_rouge_allure() {
		
		rougeAllure.click();
	}
	
	public void click_on_add_to_bag() {
		
		addTOBagButton.click();
	}
	
	public void click_on_review_bag_button() {
		
		reviewBagButton.click();
	}
	
	
	public String  check_qty() {
		
		Select select= new Select(quantity);
		
		select.getFirstSelectedOption();
		
	return select.getFirstSelectedOption().getText();
		
	}
	
	public String check_total_price() {

		return totalPrice.getText();

	}
public String check_name_product() {
		
		return rougeAllurePanier.getText();
		
	}

/* Getter & Setter Method */

public static WebElement getRougeAllure() {
	return rougeAllure;
}

public static void setRougeAllure(WebElement rougeAllure) {
	SecondTestPage.rougeAllure = rougeAllure;
}

public static WebElement getLipstik() {
	return lipstik;
}

public static void setLipstik(WebElement lipstik) {
	SecondTestPage.lipstik = lipstik;
}
}

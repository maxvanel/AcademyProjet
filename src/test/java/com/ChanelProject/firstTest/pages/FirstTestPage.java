package com.ChanelProject.firstTest.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.ChanelProject.utils.Setup;

public class FirstTestPage {
	
	WebDriver driver;

	public FirstTestPage() {
		driver = Setup.driver;
	}

final static String BUTTON_SEARCH = "//header/div[1]/div[1]/div[1]/div[1]/ul[2]/li[1]";
final static String SEARCH_BAR = "//input[@id='searchInput']";
final static String ICON_SEARCH = "//body/div[@id='new-search-overlay']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[2]/*[1]";
final static String VIEW_MORE_BUTTON = "//button[@role='button']";
final static String LISTALLPRODUCT = "//h4//span[@role='presentation']";
final static String SECOND_ELEMENT = "//div[@class=\"product-list-inline\"][2]";
final static String SECOND_TITLE = "//div//span[@class='heading product-details__title ']";
final static String TITLE_ALLPRODUCT = "//h4//span[@role='presentation']";

	/* @FindBy */
	
	@FindBy(how = How.XPATH, using = BUTTON_SEARCH)
	public static WebElement buttonSearch;
	
	@FindBy(how = How.XPATH, using = SEARCH_BAR)
	public static WebElement searchBar;
	
	@FindBy(how = How.XPATH, using = ICON_SEARCH)
	public static WebElement iconSearch;

	@FindBy(how = How.XPATH, using = VIEW_MORE_BUTTON)
	public static WebElement viewMoreButton;
	
	@FindBy(how = How.XPATH, using = LISTALLPRODUCT)
	public static WebElement listAllProduct;
	
	@FindBy(how = How.XPATH, using = SECOND_ELEMENT)
	public static WebElement secondElement;
	
	@FindBy(how = How.XPATH, using = SECOND_TITLE)
	public static WebElement secondTitle;
	
	@FindBy(how = How.XPATH, using = TITLE_ALLPRODUCT)
	public static List <WebElement> titleAllProduct;
	
	
	/* Method */
	
	public void clickSearch() {
		buttonSearch.click();
	}
	
	public void searchProduct(String product) {

		searchBar.sendKeys(product);

	}
	
	public void click_on_search_icon() {

		iconSearch.click();
	}
	
	public void click_on_view_more() {

		viewMoreButton.click();
	}
	
	public void clickSecondProduct() {

		secondElement.click();

	}
	
	public  List title_of_all_product() {
		final List <String> titles = new ArrayList<>() ;
		
		for (int i= 0; i< titleAllProduct.size() ;i++)
		{
			 String title = titleAllProduct.get(i).getText() ;
			 
			 titles.add(title);
			 
		}
		
		return titles;
		}

}

package com;

import java.util.ArrayList;
import java.util.List;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.steps.HomePageSteps;

@RunWith(ThucydidesRunner.class)
public class HomeSearchTest {

	@Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://www.bestauto.ro")
    public Pages pages;

    @Steps
	public HomePageSteps homePageSteps;

	String brand = "VW";
	String model = "Bora";
	String price = "6000";
	String buildDate = "2001";
	String kilometers = "200000";
	String fuel = "Diesel";

    @Test
    public void homeSearch() {
    	homePageSteps.selectBrand(brand);

    }
}

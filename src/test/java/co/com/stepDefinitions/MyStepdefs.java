package co.com.stepDefinitions;

import co.com.drivers.Drivers;
import co.com.pageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs extends Drivers {
    HomePage homePage;

    @Given("^el usuario se encuentra en la pagina de google (.*)$")
    public void el_usuario_se_encuentra_en_la_pagina_de_google_www_google_com(String url) {
        web().get(url);
    }

    @When("^ingresa la palabra (.*)$")
    public void ingresa_la_palabra_pruebaz(String word) {
        homePage = new HomePage(useDriver());
        homePage.googleSearch();
        homePage.inputWord(word);
        homePage.clickOnButton();
    }

    @Then("^se muestran los resultado en pantalla$")
    public void se_muestran_los_resultado_en_pantalla() {
        homePage.resultSearch();
        homePage.listResultSearch();
    }
}

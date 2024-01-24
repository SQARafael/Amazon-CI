package com.amazon.stepDefinitions;
/*
 * @(#) AddProductStepDefinitions.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.questions.ProductValidateQuestion;
import com.amazon.tasks.DetailsProductTask;
import com.amazon.tasks.HomeTask;
import com.amazon.tasks.ProductSelectTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class AddProductStepDefinitions {



    @Before
    public void setupActor() {
        setTheStage(new OnlineCast());
    }
    @Given("that user open page Amazon and search any product")
    public void thatUserOpenPageAmazonAndSearchAnyProduct() {
        theActorCalled("user").wasAbleTo(
                HomeTask.on()
        );


    }
    @When("user click  on  product tittle and user click on add to cart")
    public void userClickOnProductTittleAndUserClickOnAddToCart() {
        theActorInTheSpotlight().attemptsTo(
                ProductSelectTask.on(),
                DetailsProductTask.on()
        );

    }
    @Then("user can view the product into cart.")
    public void userCanViewTheProductIntoCart() {

        theActorInTheSpotlight().should(
              seeThat(
                      ProductValidateQuestion.from(),
                      Matchers.equalTo(true)
              )

        );
    }
}

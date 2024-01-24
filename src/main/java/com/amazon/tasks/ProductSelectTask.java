package com.amazon.tasks;
/*
 * @(#) ProductSelectTask.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.interactions.SelectRandom;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.List;
import java.util.Random;

import static com.amazon.UI.ProductsUI.LBL_PRODUCTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductSelectTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SelectRandom.click()

        );

    }

    public static ProductSelectTask on(){
        return instrumented(ProductSelectTask.class);
    }
}

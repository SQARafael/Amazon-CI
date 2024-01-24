package com.amazon.tasks;
/*
 * @(#) DetailsProductTask.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.amazon.interactions.GetNameProduct;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.UI.ProductDetailsUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class DetailsProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                GetNameProduct.getName(),
                Click.on(BTN_ADDTOCART),
                Click.on(BTN_CART)
        );

    }
    public static DetailsProductTask on(){

        return instrumented(DetailsProductTask.class);
    }
}

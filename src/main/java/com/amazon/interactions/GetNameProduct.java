package com.amazon.interactions;
/*
 * @(#) GetNameProduct.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static com.amazon.UI.ProductDetailsUI.LBL_NAMEPRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class GetNameProduct implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String nameProduct = LBL_NAMEPRODUCT.resolveFor(actor).getText();
        actor.remember("product",nameProduct);
    }

    public static GetNameProduct getName(){
        return instrumented(GetNameProduct.class);
    }
}

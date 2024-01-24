package com.amazon.questions;
/*
 * @(#) ProductValidateQuestion.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.amazon.UI.CartUI.LBL_NAMEproduct;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductValidateQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String producto = LBL_NAMEproduct.resolveFor(actor).getText();
        String name1 = producto.replaceAll("\u2026", "");
        //String[] name = producto.split("\\.");
        String productoInicial = actor.recall("product");
        return productoInicial.contains(name1);
    }

    public static Question<Boolean> from(){
        return new ProductValidateQuestion();
    }
}

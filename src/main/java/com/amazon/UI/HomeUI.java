package com.amazon.UI;
/*
 * @(#) HomeUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */


import net.serenitybdd.screenplay.targets.Target;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class HomeUI {
    public static Target TXT_SEARCH=Target.the("input search")
            .locatedBy("//input[@id='twotabsearchtextbox']");

}

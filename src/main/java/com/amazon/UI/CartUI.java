package com.amazon.UI;
/*
 * @(#) CartUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class CartUI {
    public static Target LBL_NAMEproduct=Target.the("Name product cart")
            .locatedBy("//span[@class='a-truncate-cut']");
}

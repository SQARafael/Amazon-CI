package com.amazon.UI;
/*
 * @(#) ProductsUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductsUI {
    public static Target LBL_PRODUCTS=Target.the("products list")
            .locatedBy("//span[@class='a-size-medium a-color-base a-text-normal']");
}

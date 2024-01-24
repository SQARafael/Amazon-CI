package com.amazon.UI;
/*
 * @(#) ProductDetailsUI.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.screenplay.targets.Target;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ProductDetailsUI {
    public static Target LBL_NAMEPRODUCT=Target.the("Name product")
            .locatedBy("//span[@id='productTitle']");

    public static Target BTN_ADDTOCART=Target.the("btn add to cart")
            .locatedBy("//input[@id='add-to-cart-button']");

    public static Target BTN_CART=Target.the("btn cart")
            .locatedBy("//div[@id='nav-cart-count-container']");
}

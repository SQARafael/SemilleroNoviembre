package com.spotify.steps;
/*
 * @(#) LoginSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.spotify.pageObject.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class LoginSteps {

    @Page
    LoginPage loginPage;

    @Step
    public void sendCredencials(){
        loginPage.getDriver().findElement(loginPage.getTxtUserName())
                .sendKeys("user@mail.com");

        loginPage.getDriver().findElement(loginPage.getTxtPassword())
                .sendKeys("1234");
    }

    @Step
    public void clickLogin(){
        loginPage.getDriver().findElement(loginPage.getBtnLogin())
                .click();

    }
}

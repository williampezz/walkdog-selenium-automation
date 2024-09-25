package br.william.pipeline.firstautomation;

import org.openqa.selenium.WebDriver;

public class BasePage {

    //toda classe que herdar, vai ter acesso a esse atributo
    protected WebDriver navegador;


    //construtor
    public BasePage(WebDriver navegador) {
        this.navegador = navegador;
    }
}

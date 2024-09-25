package br.william.pipeline.firstautomation.pages;

import br.william.pipeline.firstautomation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {


    private  By ButtonSignUp = By.xpath("//a");


    public HomePage(WebDriver navegador) {
        super(navegador);
    }

    public void openSite() {
        navegador.get("https://walkdog.vercel.app");
        navegador.manage().window().maximize();
    }

    public void clickSignUp() {
        navegador.findElement(ButtonSignUp).click();

    }


    }

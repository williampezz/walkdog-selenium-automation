package br.william.pipeline.firstautomation.pages;

import br.william.pipeline.firstautomation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {



    @FindBy (xpath = "//a")
    WebElement wantBeDogWalker;


    public HomePage(WebDriver navegador) {
        super(navegador);
        this.navegador = navegador;
        PageFactory.initElements(navegador, this);
    }

    public void openSite() {
        navegador.get("https://walkdog.vercel.app");
        navegador.manage().window().maximize();
    }

    public void clickSignUp() {
        wantBeDogWalker.click();

    }


}

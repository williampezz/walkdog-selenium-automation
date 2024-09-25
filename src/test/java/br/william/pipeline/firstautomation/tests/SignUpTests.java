package br.william.pipeline.firstautomation.tests;

import br.william.pipeline.firstautomation.core.Hooks;
import br.william.pipeline.firstautomation.pages.HomePage;
import br.william.pipeline.firstautomation.pages.SignUpPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Tests automatizados da funcionalidade de SignUp")
public class SignUpTests extends Hooks {



    Hooks hook = new Hooks();



    @Test
    @DisplayName("Registrar um novo usuario com dados validos")
    public void testSignUpUser() throws InterruptedException {
        hook.setUp();
        WebDriver navegador = new ChromeDriver();

        HomePage homePage = new HomePage(navegador);
        SignUpPage signUpPage = new SignUpPage(navegador);

        homePage.openSite();
        homePage.clickSignUp();
        signUpPage.verifyCadForm();
        signUpPage.insertDadosForm();
        signUpPage.insertCEP();
        signUpPage.fileUpload();
        signUpPage.clickSignUp();

       // navegador.close();

    }


}

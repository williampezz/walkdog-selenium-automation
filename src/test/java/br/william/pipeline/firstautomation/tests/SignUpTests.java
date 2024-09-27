package br.william.pipeline.firstautomation.tests;

import br.william.pipeline.firstautomation.core.Hooks;
import br.william.pipeline.firstautomation.pages.HomePage;
import br.william.pipeline.firstautomation.pages.SignUpPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@DisplayName("Tests automatizados da funcionalidade de SignUp")
public class SignUpTests extends Hooks {


    @Test
    @DisplayName("Registrar um novo usuario com dados validos")
    public void testSignUpUser() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Executar o Chrome sem interface gráfica
        options.addArguments("--no-sandbox"); // Necessário para evitar problemas de permissão
        options.addArguments("--disable-dev-shm-usage"); // Para otimizar o uso de memória em ambientes limitados

        WebDriver navegador = new ChromeDriver(options);

        HomePage homePage = new HomePage(navegador);
        SignUpPage signUpPage = new SignUpPage(navegador);


        homePage.openSite();
        homePage.clickSignUp();

        signUpPage.verifyCadForm();
        signUpPage.enterUsername("William");
        signUpPage.enterCPF("50954071085");
        signUpPage.enterEmail("williamteste2@gmail.com");
        signUpPage.enterCEP("04870470");
        signUpPage.enterNumber("80");
        signUpPage.btSearchCep();
        signUpPage.btActivity();

        signUpPage.fileUpload();
        signUpPage.btSignUp();

        navegador.close();

    }


}

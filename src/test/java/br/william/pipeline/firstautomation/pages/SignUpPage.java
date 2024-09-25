package br.william.pipeline.firstautomation.pages;

import br.william.pipeline.firstautomation.BasePage;
import br.william.pipeline.firstautomation.core.Hooks;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.util.Base64;

public class SignUpPage extends BasePage {

    Hooks hooks = new Hooks();


    public SignUpPage(WebDriver navegador) {
        super(navegador);
    }

    public void verifyCadForm() {
        String titleElem = navegador.findElement(By.xpath("//*[text() = 'Faça seu cadastro']")).getText();
        Assertions.assertEquals("Faça seu cadastro", titleElem);

    }

    public void insertDadosForm() {
        WebElement nameInput = navegador.findElement(By.name("name"));
        nameInput.sendKeys("William");

        WebElement emailInput = navegador.findElement(By.name("email"));
        emailInput.sendKeys("williamteste@gmail.com");

        WebElement cpfInput = navegador.findElement(By.name("cpf"));
        cpfInput.sendKeys("50954071085");
    }

    public void insertCEP() {
        WebElement cepInput = navegador.findElement(By.name("cep"));
        cepInput.sendKeys("04870470");

        WebElement numberInput = navegador.findElement(By.name("addressNumber"));
        numberInput.sendKeys("88");

        navegador.findElement(By.cssSelector("input[type='button']")).click();
        navegador.findElement(By.xpath("//img[@alt='Cuidar']")).click();


    }

    public void fileUpload() {
        File uploadFile = new File("/Users/williampez/Documents/Automacoes /selenium/FirstAutomation/src/test/java/br/william/pipeline/firstautomation/utils/IMG_0159.PNG");

        WebElement fileInput = navegador.findElement(By.cssSelector("input[type=file]"));
        fileInput.sendKeys(uploadFile.getAbsolutePath());

    }

    public void clickSignUp() {
        navegador.findElement(By.className("button-register")).click();
    }
}

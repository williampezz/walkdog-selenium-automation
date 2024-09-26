package br.william.pipeline.firstautomation.pages;

import br.william.pipeline.firstautomation.BasePage;
import br.william.pipeline.firstautomation.core.Hooks;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
public class SignUpPage extends BasePage {

    Hooks hooks = new Hooks();


   /* public SignUpPage(WebDriver navegador) {
        super(navegador);
    } */


    @FindBy (name = "name")
    WebElement userNameField;

    @FindBy (name = "email")
    WebElement userEmailField;

    @FindBy (name = "cpf")
    WebElement userCpfField;

    @FindBy (name = "cep")
    WebElement userCepField;

    @FindBy (name = "addressNumber")
    WebElement userNumberField;

    @FindBy (css = "input[type='button']")
    WebElement searchCepBt;

    @FindBy (xpath = "//img[@alt='Cuidar']")
    WebElement imgActivity;

    @FindBy (css = "input[type=file]")
    WebElement uploadDoc;

    @FindBy (className = "button-register")
    WebElement signUpBt;


    // Construtor da classe LoginPage
    public SignUpPage(WebDriver navegador) {
        super(navegador);
        this.navegador = navegador;
        // Inicializa os elementos da página
        PageFactory.initElements(navegador, this);
    }




    public void verifyCadForm() {
        String titleElem = navegador.findElement(By.xpath("//*[text() = 'Faça seu cadastro']")).getText();
        Assertions.assertEquals("Faça seu cadastro", titleElem);

    }

    public void enterUsername(String username) {
        userNameField.sendKeys(username);
    }

    public void enterEmail(String email) {
        userEmailField.sendKeys(email);
    }

    public void enterCPF(String cpf) {
        userCpfField.sendKeys(cpf);
    }

    public void enterCEP(String cep) {
        userCepField.sendKeys(cep);
    }

    public void enterNumber(String number) {
        userNumberField.sendKeys(number);
    }

    public void btSearchCep() {
        searchCepBt.click();
    }

    public void btActivity() {
        imgActivity.click();
    }

    public void fileUpload() {
        File uploadFile = new File("/Users/williampez/Documents/Automacoes /selenium/FirstAutomation/src/test/java/br/william/pipeline/firstautomation/utils/IMG_0159.PNG");
        uploadDoc.sendKeys(uploadFile.getAbsolutePath());
    }

    public void btSignUp() {
        signUpBt.click();
    }


}

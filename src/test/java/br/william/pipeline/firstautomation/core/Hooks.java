package br.william.pipeline.firstautomation.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Hooks {

    public void setUp() {
        WebDriverManager.chromedriver().setup();

    }
}


package br.william.pipeline.firstautomation.core;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

    public void setUp() {
        WebDriverManager.chromedriver().setup();

    }
}


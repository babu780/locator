package com.mccoynet.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator {

    public WebDriver driver;


    @Test
    public void test(){
         driver = new ChromeDriver();


    }
    @Test
    public void test2(){

        driver = new EdgeDriver();

    }




}

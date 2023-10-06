package com.mccoynet.qa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public  class Google {

@Test
public  void main() {

}

    {
        WebDriver babu = new ChromeDriver();
        babu.get("https://www.bestbuy.com");
        babu.manage().window().maximize();
        babu.findElement(By.xpath("//*[@id=\"shop-header-58507641\"]/div/div[1]/header/div[2]/nav/div/ul/li[5]/a")).click();
    }




}


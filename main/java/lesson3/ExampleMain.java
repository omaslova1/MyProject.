package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ExampleMain {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.livejournal.com/media");

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div/nav[2]/ul/li[2]/a"));
        webElement1.click();

        WebElement emailInputField = driver.findElement(By.xpath("//*[@id=\"user\"]"));
        emailInputField.click();
        emailInputField.sendKeys("adgfghgjhk");

        WebElement passwordInputField = driver.findElement(By.xpath("//*[@id=\"lj_loginwidget_password\"]"));
        passwordInputField.click();
        passwordInputField.sendKeys("FGGHkkJ5359");


        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div/div[2]/form[1]/button"));
        loginButton.click();
        loginButton.sendKeys("Войти");


        WebElement Button = driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/header/div/nav[2]/ul/li[4]/a"));
        Button.click();
        Button.sendKeys("Написать");


        WebElement webElement2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/header/section/div/nav/a[3]"));
        webElement2.click();
        webElement2.sendKeys("Топ");

    }




}

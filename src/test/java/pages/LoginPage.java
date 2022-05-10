package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Digitar nome do usuário
    public void writeUsername(String username){
        driver.findElement(By.id("user-name")).sendKeys(username);

    }

    // Digitar senha do usuário
    public void writePassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);

    }

    // Clicar no botão "Login"
    public void clickButtonLogin(){

    }

    // Login automatizado Default
    public void loginDefaultUser(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();
    }
}

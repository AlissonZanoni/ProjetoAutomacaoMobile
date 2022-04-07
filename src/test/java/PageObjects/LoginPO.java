package PageObjects;
import Settings.DriverSettings;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPO extends DriverSettings {

    int TimeExplicitWait = 30;

    By inputUsuario = By.id("edtUSER");
    By inputSenha = By.id("edtSENHA");
    By btnEntrar = By.id("btnENTRAR");

    public LoginPO(AppiumDriver driver){this.Driver = driver;}

    public void PreencherLogin(String usuario,String senha){

       WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(TimeExplicitWait));
       wait.until(ExpectedConditions.elementToBeClickable(inputUsuario)).sendKeys(usuario);

//        Driver.findElement(inputSenha).sendKeys(senha);
//        Driver.findElement(btnEntrar).click();
    }
}


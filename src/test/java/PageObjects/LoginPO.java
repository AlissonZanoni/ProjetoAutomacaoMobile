package PageObjects;
import Settings.DriverSettings;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPO extends DriverSettings {

    int TimeExplicitWait = 30;

    By inputUsuario = By.id("edtUSER");
    By inputSenha = By.id("edtSENHA");
    By btnEntrar = By.id("btnENTRAR");
    By btnAvancar = By.id("btnavancar");

    public LoginPO(AppiumDriver driver){this.Driver = driver;}

    public void PreencherLogin(String usuario,String senha) throws Exception{

       WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(TimeExplicitWait));
       Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

       wait.until(ExpectedConditions.elementToBeClickable(inputUsuario)).sendKeys(usuario);
       Driver.findElement(inputSenha).sendKeys(senha);
       Thread.sleep(2000);
       Driver.findElement(btnEntrar).click();
       Thread.sleep(2000);
       String validar = Driver.findElement(btnAvancar).getText();
       Assert.assertEquals(validar,"AVANÇAR");

    }
}


package PageObjects;

import Settings.DriverSettings;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroPO extends DriverSettings {

    int TimeExplicitWait = 30;

    By edtCurso = By.id("Curso");
    By listFase = By.id("spinner");
    By itemlista = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]");
    By edtPeriodo = By.id("Periodo");
    By edtMatricula = By.id("matricula");
    By btnAvancar = By.id("btnavancar");
    By imgsucesso = By.id("imagesucesso");

    public CadastroPO(AppiumDriver driver){this.Driver = driver;}

    public void PreencherCadastro(String curso,String periodo,String matricula) throws Exception{

        WebDriverWait wait = new WebDriverWait(Driver, Duration.ofSeconds(TimeExplicitWait));
        Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Driver.findElement(edtCurso).sendKeys(curso);
        Thread.sleep(2000);
        Driver.findElement(listFase).click();
        Driver.findElement(itemlista).click();
        Thread.sleep(500);
        Driver.findElement(edtPeriodo).sendKeys(periodo);
        Thread.sleep(1000);
        Driver.findElement(edtMatricula).sendKeys(matricula);
        Thread.sleep(1000);
        Driver.findElement(btnAvancar).click();
        Assert.assertEquals(Driver.findElement(imgsucesso).isEnabled(),true);
        Thread.sleep(2000);
    }
}

package Tests;

import PageObjects.LoginPO;
import Settings.DriverSettings;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest extends DriverSettings {

    @Test
    public void TestarLogin() throws Exception{
        LoginPO loginpo = new LoginPO(Driver);
        loginpo.PreencherLogin("Adm","Adm123");
    }

    @AfterTest
    public void CloseDriver(){
        Driver.quit();
    }

}

package Tests;

import PageObjects.LoginPO;
import Settings.DriverSettings;
import org.testng.annotations.Test;

public class Tests extends DriverSettings {

    @Test
    public void Testar(){
        LoginPO loginpo = new LoginPO(Driver);
        loginpo.PreencherLogin("tests","teste");
    }

}

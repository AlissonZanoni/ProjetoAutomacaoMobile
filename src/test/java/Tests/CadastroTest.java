package Tests;

import PageObjects.CadastroPO;
import PageObjects.LoginPO;
import Settings.DriverSettings;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CadastroTest extends DriverSettings {

    @Test
    public void TestarCadastro() throws Exception{
        LoginPO loginpo = new LoginPO(Driver);
        CadastroPO cadastropo = new CadastroPO(Driver);

        loginpo.PreencherLogin("Adm","Adm123");
        cadastropo.PreencherCadastro("Ciência da computação","noturno","110908");
    }

    @AfterTest
    public void CloseDriver(){
        Driver.quit();
    }

}

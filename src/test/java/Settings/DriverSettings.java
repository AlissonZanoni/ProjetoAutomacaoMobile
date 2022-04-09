package Settings;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;
import java.time.Duration;

public class DriverSettings {

    public AppiumDriver Driver;
    String caminho = ("C://Users//aliss//IdeaProjects//ProjetoAutomacaoMobile//src//apps//teste.apk");
    String deviceIDPhisical = "RQ8M80TTV3Y";
    String deviceIDEmulator = "emultador-5554";

    @BeforeTest
    public void setup(){
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.APP,caminho);
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME,deviceIDEmulator);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

            Driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),caps);

        } catch(Exception exp){
           System.out.println("Problem is :"+exp.getCause());
           System.out.print("Message is :"+exp.getMessage());
           exp.printStackTrace();
        }
    }
}

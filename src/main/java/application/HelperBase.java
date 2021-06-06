package application;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HelperBase {

    AppiumDriver<MobileElement>driver;

    public HelperBase(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }


}

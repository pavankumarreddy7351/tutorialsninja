package constants;

import com.Ninja.BaseClass.CommonFunctions;

import java.util.Properties;

public interface IConstants {

    Properties prop = CommonFunctions.init_properties(".//src/test/java/resources/projectConfig.properties");

    String CUCUMBER_CONFIG_PATH = prop.getProperty("CucumberConfigPath");
    String EMAIL_CONFIG_PATH = prop.getProperty("EmailConfigPath");
    String TEST_CONFIG_PATH = prop.getProperty("TestConfigPath");
    String EXTENT_CONFIG_PATH = prop.getProperty("ExtentConfigPath");
}

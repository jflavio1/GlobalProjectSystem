package globalproject;

import globalproject.ui.Welcome;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jose Flavio
 */
public class GlobalProject {

    public static void main(String[] args) throws IOException {
        
        if(args.length > 0){
//            File file = new File(args[0] + ".properties");
//            PropertiesConfiguration config = new PropertiesConfiguration();
//            PropertiesConfigurationLayout layout = new PropertiesConfigurationLayout(config);
//            layout.load(new InputStreamReader(new FileInputStream(file)));
//
//            config.setProperty("test", "testValue");
//            layout.save(new FileWriter("path\\to\\properties\\file.properties", false));
        }
        
        Welcome welcomeWindows = new Welcome();
        welcomeWindows.setVisible(true);
    }
    
}

package commander;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javax.swing.text.html.ListView;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SettingsController {

    @FXML
    private ObservableList<String> commListNamesByKeyPress;
    @FXML
    private ObservableList<String> commListKeyPress;
    @FXML
    private ObservableList<String> commListNamesByApps;
    @FXML
    private ObservableList<String> commListAppsPath;

//    @FXML
//    private ListView ListCommNamesByKeyPress;
//    @FXML
//    private ListView ListCommKeyPress;
//    @FXML
//    private ListView ListCommNamesByApps;
//    @FXML
//    private ListView ListCommAppsPath;

    private static void FillLists(){

    }

    private static String getCommInit() throws IOException {
        Properties prop = new Properties();
        String path = "./commander.properties";
        FileInputStream file = new FileInputStream(path);
        prop.load(file);
        String commInit = null;
        commInit = prop.getProperty("CommInit");
        return commInit;
    }

    public static void InitSettings() throws IOException {
        String commInit = getCommInit();
        FillLists();
    }
}

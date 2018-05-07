package commander;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Properties;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.layout.Region;
import javafx.stage.Stage;


public class SettingsController {

    @FXML
    private ListView<String> ListCommNamesByKeyPress;
    @FXML
    private ListView<String> ListCommKeyPress;
    @FXML
    private ListView<String> ListCommNamesByApps;
    @FXML
    private ListView<String> ListCommAppsPath;
    @FXML
    private TextField commInitField;
    @FXML
    private Button apply;
    @FXML
    private Button close;

    private ObservableList<String> commListNamesByKeyPress;
    private ObservableList<String> commListKeyPress;
    private ObservableList<String> commListNamesByApps;
    private ObservableList<String> commListAppsPath;

    @FXML
    private static String getCommInit() throws IOException {
        Properties prop = new Properties();
        String path = "./commander.properties";
        FileInputStream file = new FileInputStream(path);
        prop.load(file);
        String commInit = null;
        commInit = prop.getProperty("CommInit");
        return commInit;
    }

    @FXML
    public void initialize() throws IOException {
        setCommField();
        FillLists();
    }

    private void setCommField() throws IOException {
        System.out.println("Setting values in UI...");
        String commInit = getCommInit();
        System.out.println(commInit);
        commInitField.setText(commInit);
    }

    private void FillLists(){
        System.out.println("Filling ListViews...");
        for(int i = 0; CommanderFunctions.commNamesByKeyPress.length > i; i++){
            System.out.println(CommanderFunctions.commNamesByKeyPress[i]);
            ListCommNamesByKeyPress.getItems().add(CommanderFunctions.commNamesByKeyPress[i]);
        }
        for(int i = 0; CommanderFunctions.commKeyPress.length > i; i++){
            System.out.println(CommanderFunctions.commKeyPress[i]);
            ListCommKeyPress.getItems().add(CommanderFunctions.commKeyPress[i]);
        }
        for(int i = 0; CommanderFunctions.commNamesByApps.length > i; i++){
        System.out.println(CommanderFunctions.commNamesByApps[i]);
        ListCommNamesByApps.getItems().add(CommanderFunctions.commNamesByApps[i]);
    }
        for(int i = 0; CommanderFunctions.commAppsPath.length > i; i++){
        System.out.println(CommanderFunctions.commAppsPath[i]);
        ListCommAppsPath.getItems().add(CommanderFunctions.commAppsPath[i]);
    }
        ListCommNamesByKeyPress.setCellFactory(TextFieldListCell.forListView());
        ListCommKeyPress.setCellFactory(TextFieldListCell.forListView());
        ListCommNamesByApps.setCellFactory(TextFieldListCell.forListView());
        ListCommAppsPath.setCellFactory(TextFieldListCell.forListView());
        commListNamesByKeyPress = ListCommNamesByKeyPress.getItems();
        commListKeyPress = ListCommKeyPress.getItems();
        commListNamesByApps = ListCommNamesByApps.getItems();
        commListAppsPath = ListCommAppsPath.getItems();
}

    @FXML
    private void SaveCommChanges() throws IOException{
        System.out.println("Button pressed.");
        String[] commNamesByKeyPress;
        String[] commByKeyPress;
        String[] commNamesByApp;
        String[] commAppsPath;
        //something
//        commListNamesByKeyPress;
//        commListKeyPress;
//        commListNamesByApps;
//        commListAppsPath;
//        commListNamesByKeyPress.forEach(text -> {
//            String listTextTest = text;
//            System.out.println("printing on customized loop: " + listTextTest);
//        });
//        System.out.println(commListNamesByKeyPress.size());
//        System.out.println(commListNamesByKeyPress.get(0));
//        CommanderFunctions.commNamesByKeyPress = new String[commListNamesByKeyPress.size()];
//        CommanderFunctions.commKeyPress = new String[commListKeyPress.size()];
//        CommanderFunctions.commNamesByApps = new String[commListNamesByApps.size()];
//        CommanderFunctions.commAppsPath = new String[commListAppsPath.size()];
        for(int i = 0; commListNamesByKeyPress.size() > i; i++){
            String check = commListNamesByKeyPress.get(i);
            if(check.equals("*new*") || check.equals("")){
                System.out.println("commListNamesByKeyPress triggered an error...");
                Alert alert = new Alert(Alert.AlertType.ERROR, "One of the fields are empty or not changed.\nMake sure that no field are empty or filled by '*new*'.");
                alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                alert.show();
                return;
            }
        }
        for(int i = 0; commListKeyPress.size() > i; i++){
            String check = commListKeyPress.get(i);
            if(check.equals("*new*") || check.equals("")){
                System.out.println("commListKeyPress triggered an error...");
                Alert alert = new Alert(Alert.AlertType.ERROR, "One of the fields are empty or not changed.\nMake sure that no field are empty or filled by '*new*'.");
                alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                alert.show();
                return;
            }
        }
        for(int i = 0; commListNamesByApps.size() > i; i++){
            String check = commListNamesByApps.get(i);
            if(check.equals("*new*") || check.equals("")){
                System.out.println("commListNamesByApps triggered an error...");
                Alert alert = new Alert(Alert.AlertType.ERROR, "One of the fields are empty or not changed.\nMake sure that no field are empty or filled by '*new*'.");
                alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                alert.show();
                return;
            }
        }
        for(int i = 0; commListAppsPath.size() > i; i++){
            String check = commListAppsPath.get(i);
            if(check.equals("*new*") || check.equals("")){
                System.out.println("commListAppsPath triggered an error...");
                Alert alert = new Alert(Alert.AlertType.ERROR, "One of the fields are empty or not changed.\nMake sure that no field are empty or filled by '*new*'.");
                alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                alert.show();
                return;
            }
        }

        CommanderFunctions.commNamesByKeyPress = new String[commListNamesByKeyPress.size()];
        CommanderFunctions.commKeyPress = new String[commListKeyPress.size()];
        CommanderFunctions.commNamesByApps = new String[commListNamesByApps.size()];
        CommanderFunctions.commAppsPath = new String[commListAppsPath.size()];

        commNamesByKeyPress = new String[commListNamesByKeyPress.size()];
        commByKeyPress = new String[commListKeyPress.size()];

        for(int i = 0; commListNamesByKeyPress.size() > i; i++){
            CommanderFunctions.commNamesByKeyPress[i] = commListNamesByKeyPress.get(i);
            CommanderFunctions.commKeyPress[i] = commListKeyPress.get(i);
        }

        System.out.println(Arrays.toString(CommanderFunctions.commNamesByKeyPress));
        System.out.println(Arrays.toString(CommanderFunctions.commKeyPress));

        commNamesByApp = new String[commListNamesByApps.size()];
        commAppsPath = new String[commListAppsPath.size()];

        for(int i = 0; commListNamesByApps.size() > i; i++){
            CommanderFunctions.commNamesByApps[i] = commListNamesByApps.get(i);
            CommanderFunctions.commAppsPath[i] = commListAppsPath.get(i);
        }

        System.out.println(Arrays.toString(CommanderFunctions.commNamesByApps));
        System.out.println(Arrays.toString(CommanderFunctions.commAppsPath));

        SaveCommFiles();
        System.out.println("Files update completed.");
    }

    private void SaveCommFiles() throws IOException{
        PrintWriter pw1 = new PrintWriter("CommNamesByKeyPress.txt");
        PrintWriter pw2 = new PrintWriter("CommKeyPress.txt");
        PrintWriter pw3 = new PrintWriter("CommNamesByApps.txt");
        PrintWriter pw4 = new PrintWriter("CommAppsPath.txt");

        for(int i = 0; CommanderFunctions.commNamesByKeyPress.length > i; i++){
            System.out.println(CommanderFunctions.commNamesByKeyPress[i]);
            pw1.println(CommanderFunctions.commNamesByKeyPress[i]);
        }
        pw1.close();
        System.out.println("CommNamesByKeyPress file saved.");

        for(int i = 0; CommanderFunctions.commKeyPress.length > i; i++){
            System.out.println(CommanderFunctions.commKeyPress[i]);
            pw2.println(CommanderFunctions.commKeyPress[i]);
        }
        pw2.close();
        System.out.println("CommKeyPress file saved.");

        for(int i = 0; CommanderFunctions.commNamesByApps.length > i; i++){
            System.out.println(CommanderFunctions.commNamesByApps[i]);
            pw3.println(CommanderFunctions.commNamesByApps[i]);
        }
        pw3.close();
        System.out.println("CommNamesByApps file saved.");

        for(int i = 0; CommanderFunctions.commAppsPath.length > i; i++){
            System.out.println(CommanderFunctions.commAppsPath[i]);
            pw4.println(CommanderFunctions.commAppsPath[i]);
        }
        pw4.close();
        System.out.println("CommAppsPath file saved.");
    }

    @FXML
    private void StageClose(){
        Stage st = (Stage) close.getScene().getWindow();
        st.close();
    }

    @FXML
    private void SelectKeyNameCommPair(){
        if(ListCommNamesByKeyPress.getSelectionModel().getSelectedIndex() > -1){
            ListCommKeyPress.getSelectionModel().selectIndices(ListCommNamesByKeyPress.getSelectionModel().getSelectedIndex());
        }
    }

    @FXML
    private void SelectKeyCommPair(){
        if(ListCommKeyPress.getSelectionModel().getSelectedIndex() > -1){
            ListCommNamesByKeyPress.getSelectionModel().selectIndices(ListCommKeyPress.getSelectionModel().getSelectedIndex());
        }
    }

    @FXML
    private void SelectAppNamePair(){
        if(ListCommNamesByApps.getSelectionModel().getSelectedIndex() > -1){
            ListCommAppsPath.getSelectionModel().selectIndices(ListCommNamesByApps.getSelectionModel().getSelectedIndex());
        }
    }

    @FXML
    private void SelectAppPair(){
        if(ListCommAppsPath.getSelectionModel().getSelectedIndex() > -1){
            ListCommNamesByApps.getSelectionModel().selectIndices(ListCommAppsPath.getSelectionModel().getSelectedIndex());
        }
    }

    @FXML
    private void AddNewKeyComm(){
        ListCommNamesByKeyPress.getItems().add("*new*");
        ListCommKeyPress.getItems().add("*new*");
    }

    @FXML
    private void AddNewAppComm(){
        ListCommNamesByApps.getItems().add("*new*");
        ListCommAppsPath.getItems().add("*new*");
    }

    @FXML
    private void DeleteKeyComm(){
        int selectedIndex = ListCommNamesByKeyPress.getSelectionModel().getSelectedIndex();
        if(selectedIndex != -1){
            ListCommNamesByKeyPress.getItems().remove(selectedIndex);
            ListCommKeyPress.getItems().remove(selectedIndex);
        }
    }

    @FXML
    private void DeleteAppComm(){
        int selectedIndex = ListCommNamesByApps.getSelectionModel().getSelectedIndex();
        if(selectedIndex != -1){
            ListCommNamesByApps.getItems().remove(selectedIndex);
            ListCommAppsPath.getItems().remove(selectedIndex);
        }
    }

    @FXML
    private void printLists(){
//        System.out.println(ListCommNamesByKeyPress.getItems().toString());
//        System.out.println(ListCommKeyPress.getItems().toString());
//        System.out.println(ListCommNamesByApps.getItems().toString());
//        System.out.println(ListCommAppsPath.getItems().toString());
        String item;
        String test = commListNamesByKeyPress.toString();
        System.out.println(test);
        String test2 = commListKeyPress.toString();
        System.out.println(test2);
        String test3 = commListNamesByApps.toString();
        System.out.println(test3);
        String test4 = commListAppsPath.toString();
        System.out.println(test4);
        commListNamesByKeyPress.forEach(text -> {
            String listTextTest = text;
            System.out.println("printing on customized loop: " + listTextTest);
        });
        System.out.println(commListNamesByKeyPress.size());
        System.out.println(commListNamesByKeyPress.get(0));
        System.out.println(ListCommNamesByKeyPress.getSelectionModel().getSelectedIndex());
        System.out.println(ListCommKeyPress.getSelectionModel().getSelectedIndex());
        System.out.println(ListCommNamesByApps.getSelectionModel().getSelectedIndex());
        System.out.println(ListCommAppsPath.getSelectionModel().getSelectedIndex());
    }
}

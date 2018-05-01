package commander;

import javafx.application.Platform;
import javafx.fxml.FXML;

//import java.awt.*;
//import java.awt.event.ActionEvent;
import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class MainController {

    @FXML
    private TextField command;

    @FXML
    public TextArea log;

    @FXML
    private Button SubmitButton;

    //Here goes the code that interacts with FXML file

    @FXML
    public void ButtonPressHandler(ActionEvent ae){
        String TextFieldCommand;
        TextFieldCommand = command.getText();
        if(!TextFieldCommand.equals("")){
            SubmittedText(TextFieldCommand);
            command.setText("");
        }
    }

    @FXML
    public void TextSubmitEnterKey(ActionEvent ae) {
        String TextFieldCommand;
        TextFieldCommand = command.getText();
        if(!TextFieldCommand.equals("")){
            SubmittedText(TextFieldCommand);
            command.setText("");
        }
    }

    @FXML
    public void MenuExit(ActionEvent ae){
        Platform.exit();
    }

    @FXML
    private void SubmittedText(String command){

        log.appendText(command + "\n");

        System.out.println(command.substring(0, CommanderFunctions.commInit.length()));
        System.out.println(command.substring(CommanderFunctions.commInit.length(), command.length()));

        String commSymbolCheck = command.substring(0, CommanderFunctions.commInit.length());
        String commName = command.substring(CommanderFunctions.commInit.length(), command.length());

        if(commSymbolCheck.equals(CommanderFunctions.commInit)){
            if(CommanderFunctions.CommandCheck(commName)) {
                try {
                    CommanderFunctions.ExecuteCommand(commName);
                    log.appendText("Command executed.\n");
                } catch (Exception e) {
                    e.printStackTrace();
                    String commanderror = e.toString();
                    log.appendText(commanderror + "\n");
                }
            }
            else{
                log.appendText("Unrecognized command\n");
            }
        }
    }

    @FXML
    public void OpenSettings() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SettingsWindow.fxml"));
        //FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("SettingsWindow.fxml"));
        //Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
        //Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        stage.setTitle("Settings");
        stage.setScene(new Scene(root, 600, 400));
    }

}

package commander;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.input.*;

public class SettingsButtonsHelpController {

    @FXML
    public ListView<String> btnNameList;
    @FXML
    public ListView<String> btnDescList;

    private ObservableList<String> btnName;
    private ObservableList<String> btnDesc;

    public void initialize() {
        for(int i = 0; CommanderRobot.allowedKeys.length > i; i++){
            System.out.println(CommanderRobot.allowedKeys[i]);
            btnNameList.getItems().add(CommanderRobot.allowedKeys[i]);
            System.out.println(CommanderRobot.allowedKeysDesc[i]);
            btnDescList.getItems().add(CommanderRobot.allowedKeysDesc[i]);
        }

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Node n1 = btnNameList.lookup(".scroll-bar");
                if (n1 instanceof ScrollBar) {
                    final ScrollBar bar1 = (ScrollBar) n1;
                    Node n2 = btnDescList.lookup(".scroll-bar");
                    if (n2 instanceof ScrollBar) {
                        final ScrollBar bar2 = (ScrollBar) n2;
                        bar1.valueProperty().bindBidirectional(bar2.valueProperty());
                    }
                }
            }
        });
    }

    @FXML
    private void SelectKeyNamePair(){
        if(btnNameList.getSelectionModel().getSelectedIndex() > -1){
            btnDescList.getSelectionModel().selectIndices(btnNameList.getSelectionModel().getSelectedIndex());
        }
    }

    @FXML
    private void SelectKeyNameDescPair(){
        if(btnDescList.getSelectionModel().getSelectedIndex() > -1){
            btnNameList.getSelectionModel().selectIndices(btnDescList.getSelectionModel().getSelectedIndex());
        }
    }

    @FXML
    private void CtrlCListener(KeyEvent event){
        KeyCombination keyComb = new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_DOWN);
        if(keyComb.match(event)){
            System.out.println("CTRL+C pressed");
            CopyToClipboard();
        }
    }

    @FXML
    private void CopyToClipboard(){
        String text = btnNameList.getSelectionModel().getSelectedItem();
        Clipboard cb = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(text);
        cb.setContent(content);
    }
}

package commander;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SettingsControllerTest extends CommanderFunctions {

    private static final Object SettingsController = "SettingsController";

    @Test
    public void SettingsWindowTest() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("ServerConfigChooser.fxml"));
        loader.setController(SettingsController);
        loader.setRoot(SettingsController);
        Parent root;
        root = loader.load();
        Scene scene = new Scene(root, 320, 200);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
package commander;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("Commander");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
        CommanderFunctions.InitCheck();

        primaryStage.setOnCloseRequest(event1 ->
        {
            System.out.println("Call to exit program from X button...");
            Platform.exit();
        });
    }


    public static void main(String[] args) {
        launch(args);
    }


}
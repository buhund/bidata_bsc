import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application  {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        // Get instance of Main Menu from singleton
        Scene scnMainMenu = MainMenu.getInstance(primaryStage).getScene();

        //Set scene
        primaryStage.setScene(scnMainMenu);
        primaryStage.setTitle("Main Window");
        primaryStage.show();
    }
}



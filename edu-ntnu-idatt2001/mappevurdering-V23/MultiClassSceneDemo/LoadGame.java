import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoadGame {
    private static LoadGame INSTANCE;
    private final Stage mainStage;
    private final Scene scnLoadGame;

    private LoadGame(Stage primaryStage){
        // Capture a reference to the primary stage
        this.mainStage = primaryStage;

        // Create a label
        Label mainMenuLabel = new Label("This is where we do LoadGame stuff");

        // Create back-button and set action
        Button btBack = new Button("Back");
        btBack.setOnAction(e -> backToMainMenu());

        // Create a container to hold all our stuff
        VBox vBox = new VBox();
        vBox.setSpacing(8);
        vBox.setPadding(new Insets(8, 8, 8, 8));
        vBox.setAlignment(Pos.CENTER);
        // Add all our stuff to the container
        vBox.getChildren().addAll(mainMenuLabel, btBack);

        // Create our scene
        scnLoadGame = new Scene(vBox, 800, 600);
    }

    public static LoadGame getInstance(Stage mainStage) {
        // Does the instance exist?
        if(INSTANCE == null) {
            // If not, we create it
            INSTANCE = new LoadGame(mainStage);
        }
        // Return our instance
        return INSTANCE;
    }

    public Scene getScene(){
        // Return our scene from the instance
        return scnLoadGame;
    }

    public Stage getStage(){
        // Return our reference to the main stage from the instance
        return mainStage;
    }

    private void backToMainMenu(){
        // Get the "Main Menu" instance, then get the scene
        Scene scnMainMenu = MainMenu.getInstance(this.mainStage).getScene();
        // Set the scene on main stage
        this.mainStage.setScene(scnMainMenu);
    }
}
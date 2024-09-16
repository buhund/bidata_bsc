import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public final class NewGame{
    // Static instance of our NewGame class
    private static NewGame INSTANCE;
    private final Stage mainStage;
    private final Scene scnNewGame;

    private NewGame(Stage primaryStage){
        // Capture a reference to the primary stage
        this.mainStage = primaryStage;

        // Create a label
        Label mainMenuLabel = new Label("This is where we do NewGame stuff...");

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
        scnNewGame = new Scene(vBox, 800, 600);
    }

    public static NewGame getInstance(Stage mainStage) {
        // Does the instance exist?
        if(INSTANCE == null) {
            // If not, we create it
            INSTANCE = new NewGame(mainStage);
        }
        // Return our instance
        return INSTANCE;
    }

    public Scene getScene(){
        // Return our scene from the instance
        return scnNewGame;
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
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class MainMenu {
    private static MainMenu INSTANCE;
    private final Stage mainStage;
    private final Scene scnMainMenu;

    private MainMenu(Stage primaryStage) {
        // Capture a reference to the primary stage
        this.mainStage = primaryStage;

        // Create a label
        Label mainMenuLabel = new Label("Main Menu");

        // Create buttons for "New Game", "Load Game" and "Quit Game"
        Button btnNewGame = new Button("New Game");
        Button btnLoadGame = new Button("Load Game");
        Button btnQuitGame = new Button("Quit Game");

        // Get scene from "New Game" and "Load Game" instances and get their scenes,
        // then set them on main stage
        btnNewGame.setOnAction(e -> toNewGame());
        btnLoadGame.setOnAction(e -> toLoadGame());
        btnQuitGame.setOnAction(e -> System.exit(0));

        // Create a container to hold all our stuff
        VBox vBox = new VBox();
        vBox.setSpacing(8);
        vBox.setPadding(new Insets(8, 8, 8, 8));
        vBox.setAlignment(Pos.CENTER);
        // Add all our stuff to the container
        vBox.getChildren().addAll(mainMenuLabel, btnNewGame, btnLoadGame, btnQuitGame);

        // Create our scene
        scnMainMenu = new Scene(vBox, 800, 600);
    }

    public static MainMenu getInstance(Stage mainStage) {
        // Does the instance exist?
        if(INSTANCE == null) {
            // If not, we create it
            INSTANCE = new MainMenu(mainStage);
        }
        // Return our instance
        return INSTANCE;
    }

    public Scene getScene() {
        // Return our scene from the instance
        return scnMainMenu;
    }

    public Stage getStage(){
        // Return our reference to the main stage from the instance
        return mainStage;
    }

    private void toNewGame(){
        // Get the "New Game" instance, then get the scene
        Scene scnNewGame = NewGame.getInstance(this.mainStage).getScene();
        // Set the scene on main stage
        this.mainStage.setScene(scnNewGame);
    }

    private void toLoadGame(){
        // Get the "Load Game" instance, then get the scene
        Scene scnLoadGame = LoadGame.getInstance(this.mainStage).getScene();
        // Set the scene on main stage
        this.mainStage.setScene(scnLoadGame);
    }
}
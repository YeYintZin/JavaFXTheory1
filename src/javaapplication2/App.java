package javaapplication2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        System.out.println("Opening application...");
        // BorderPane(5), GridPane (Matrix), VBox/Hbox
        BorderPane pane = new BorderPane();
        
        //Button
        Button button = new Button("BUTON");
        button.setPrefSize(175, 175);
        pane.setCenter(button);
        BorderPane.setMargin(button, new Insets(10, 10, 10, 10));
        BorderPane.setAlignment(pane, Pos.CENTER);

        
        //Label
        Label label = new Label("LABEL");
        pane.setTop(label);
        
        //Image
        Image image = new Image("file:src/goose.jpg");
        ImageView img = new ImageView(image);
        Label label2 = new Label("");
        
        
        //Scene
        Scene scene = new Scene(pane, 900, 900); //Window Size
        stage.setTitle("APPLICATION TITLE");
        stage.setScene(scene);
        stage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
        System.out.println("Exiting program.");
    }
    
    
    public class ButtonHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent t) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
}

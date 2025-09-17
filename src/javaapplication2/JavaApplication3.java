package javaapplication3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaApplication3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        VBox v = new VBox();
        
        Label result = new Label("");
        result.setStyle("-fx-background-color: white; -fx-font-size: 50pt;");
        
        Button button = new Button("button");
        button.setOnAction(
                e -> {
                    System.out.println("button press");
                    result.setText("Button is pressed wozies");
                });
        Label label = new Label("This is a very long label");
        
        v.getChildren().addAll(button, label, result);
        
        Scene scene = new Scene(v, 900, 600);
        scene.getStylesheets().add("demo2.css");
        stage.setScene(scene);
        stage.show();
    }
    
}

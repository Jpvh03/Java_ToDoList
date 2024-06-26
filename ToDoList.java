import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.*;

public class ToDoList extends Application {

    Button button1;

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage arg0) throws Exception {
        arg0.setTitle("This is my title");

        button1 = new Button();
        button1.setText("Do that");

        StackPane layout = new StackPane();
        layout.getChildren().add(button1);

        Scene scene1 = new Scene(layout, 300, 250);
        arg0.setScene(scene1);
        arg0.show();

    }
}

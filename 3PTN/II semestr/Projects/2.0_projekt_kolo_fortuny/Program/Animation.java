/*import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();

        // utworzenie koła fortuny
        Circle circle = new Circle(100, Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(5);
        root.getChildren().add(circle);

        // utworzenie tekstu na kole
        Text text = new Text("JavaFX Wheel of Fortune");
        text.setFont(Font.font("Arial", 20));
        text.setFill(Color.BLACK);
        StackPane.setAlignment(text, Pos.CENTER);
        root.getChildren().add(text);

        // utworzenie animacji kręcenia się koła
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), circle);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(Animation.INDEFINITE);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.play();

        // utworzenie sceny i wyświetlenie aplikacji
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Wheel of Fortune");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/

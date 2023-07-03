package Bai2;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Bai22 extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Load file fxml
            Parent root = FXMLLoader.load(getClass().getResource("Bai22.fxml"));

            // Tạo Scene từ root và thiết lập cho Stage
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("JavaFX");
            
          

            // Hiển thị cửa sổ
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

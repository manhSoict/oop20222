package Bai1;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class controllerBai1 {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
    @FXML
    private AnchorPane PanelQS;
    
    public void initialize() {
        PanelQS.setVisible(false); // ẩn panel PanelQS ban đầu
    }
	
    @FXML
    public void AppearOrHide() {
        if (PanelQS.isVisible()) {
            PanelQS.setVisible(false); // ẩn panel PanelQS nếu nó đang hiển thị
        } else {
            PanelQS.setVisible(true); // hiển thị panel PanelQS nếu nó đang ẩn
        }
    }
    
    @FXML
    private void switchToBai2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Bai2.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

}
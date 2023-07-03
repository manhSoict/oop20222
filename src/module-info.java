module btloop {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires java.desktop;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	
	opens Bai1 to javafx.fxml;
	exports Bai1;
	
	opens Bai2 to javafx.fxml;
	exports Bai2;
}

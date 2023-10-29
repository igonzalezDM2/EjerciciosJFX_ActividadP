module EjerciciosJFX_ActividadP {
	requires java.sql;
	requires javafx.base;
	requires javafx.controls;
	requires java.desktop;
	requires javafx.web;
	requires javafx.fxml;
	requires javafx.swing;
	requires javafx.media;
	requires javafx.graphics;
	requires Takumi;
	
	opens application to javafx.graphics, javafx.fxml, Takumi;
	opens controller to javafx.graphics, javafx.fxml, Takumi;
}

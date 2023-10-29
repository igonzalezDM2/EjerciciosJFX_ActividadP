package application;
	

import com.takumi.productolabelwidget.ProductoLabel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/productos.fxml"));
			VBox root = (VBox)loader.load();
			
			controller.ProcuctosController con = (controller.ProcuctosController) loader.getController();
			
		    ProductoLabel pl1 = new ProductoLabel();

		    ProductoLabel pl2 = new ProductoLabel();

		    ProductoLabel pl3 = new ProductoLabel();

			pl1.setImage(new Image(getClass().getResource("/images/pan.png").toString()));
			pl1.setName("Pan");
			pl1.setStock(10);
			pl2.setImage(new Image(getClass().getResource("/images/manzana.png").toString()));
			pl2.setName("Manzana");
			pl2.setStock(200);
			pl3.setImage(new Image(getClass().getResource("/images/leche.png").toString()));
			pl3.setName("Leche");
			pl3.setStock(50);
			
			con.fpProductos.getChildren().addAll(pl1,pl2,pl3);
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

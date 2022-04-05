package questoes1a6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaPizza extends Application {

	public static Stage primaryStage;

	 public static Stage getPrimaryStage() {
		 return primaryStage;
	 }
	 public static void setPrimaryStage(Stage primaryStage) {
		 TelaPizza.primaryStage = primaryStage;
	 }
	 
	 public void start(Stage primaryStage) throws Exception{
		 setPrimaryStage(primaryStage);
		 primaryStage.setTitle("Sistema Pizzaria");
		 //primaryStage.setMaximized(true);
		 primaryStage.show();
		 telaPizz();
	 }
	 
	 public static void telaPizz() throws Exception{
		 Parent root = FXMLLoader.load(TelaPizza.class.getResource("/questoes1a6/telaPizzaria.fxml"));
		 
		 Scene cena = new Scene(root);
		 
		 primaryStage.setScene(cena);
	 }
	 
	 
	public static void main(String args[]) {
		launch();
	}

}

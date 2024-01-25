package sunat.gob.pe.ejercicio02g7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Bienvenido alumnos Grupo 7");
        
        Button btnActual = new Button("Actual");
        btnActual.setPrefSize(80, 25);
        btnActual.setOnAction(e -> mostrarAlerta());

        
        Button btnProyectado = new Button("Proyectado");
        btnProyectado.setPrefSize(80, 25);
        
        Button btnEstimado = new Button("Estimado");
        btnEstimado.setPrefSize(80, 25);
        
        /*Horizontal Box*/
        HBox hbox = new HBox(btnActual, btnProyectado, btnEstimado);
        hbox.setSpacing(5);
        Insets sangria = new Insets(10,0,0,0);
        hbox.setPadding(sangria);
        hbox.setAlignment(Pos.BASELINE_CENTER);
        
        Label lblData = new Label("Data");
        Label lblVentas = new Label("Ventas");
        Label lblMarketing = new Label("Marketing");
        Label lblDistribucion = new Label("Distribucion");
        Label lblCostos = new Label("Costos");

        VBox vbox = new VBox(lblData, lblVentas, lblMarketing, lblDistribucion, lblCostos);
        
        
        var scene = new Scene(vbox, 640, 480);
        


        // Configurar la escena y mostrarla
        stage.setScene(scene);
        stage.show();
        
     
    }

    private void mostrarAlerta() {
    	Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Alerta");
        alert.setHeaderText(null);
        alert.setContentText("Hola, esto es una alerta!");

        // Mostrar la alerta y esperar a que el usuario la cierre
        alert.showAndWait();
	}

	public static void main(String[] args) {
        launch();
    }

}
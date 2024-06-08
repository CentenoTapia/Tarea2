package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Label dateLabel = new Label("Selecciona una fecha:");
        Label colorLabel = new Label("Selecciona un color:");

        
        DatePicker datePicker = new DatePicker();
        ColorPicker colorPicker = new ColorPicker();

        
        Button confirmButton = new Button("Confirmar selección");

        
        confirmButton.setOnAction(event -> {
            
            String selectedDate = datePicker.getValue() != null ? datePicker.getValue().toString() : "No se ha seleccionado una fecha";
            Color selectedColor = colorPicker.getValue();

            
            System.out.println("Fecha seleccionada: " + selectedDate);
            System.out.println("Color seleccionado: " + selectedColor.toString());
        });

        
        VBox vbox = new VBox(10); 
        vbox.getChildren().addAll(dateLabel, datePicker, colorLabel, colorPicker, confirmButton);

        
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Selector de Fecha y Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


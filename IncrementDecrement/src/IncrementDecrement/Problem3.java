/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IncrementDecrement;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author Ratna
 */
public class Problem3 extends Application{
    
    private Label label=new Label("Increment/Decrement");
    private TextField tfResult = new TextField();
    private Button btnIncre=new Button("inc");
    private Button btnDecre=new Button("dec");
    private Button btnReset = new Button("reset");
    int count=0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(10);
        label.setStyle("-fx-font-weight: bold");
        tfResult.setPrefHeight(45);
        tfResult.setEditable(false);
        tfResult.setText("0");

        HBox hbox = new HBox(btnIncre, btnDecre,btnReset);
        hbox.setAlignment(Pos.CENTER);
        HBox.setMargin(hbox,new Insets(10,10,0,50));
        gridPane.add(label, 0, 0);
        gridPane.add(tfResult, 0, 1);
        gridPane.add(hbox,0,2);
        gridPane.setAlignment(Pos.CENTER);  

        btnIncre.setOnAction((ActionEvent e) -> {
            count++;
            tfResult.setText(String.valueOf(count));
        });

        btnDecre.setOnAction((ActionEvent e) -> {
            count--;
            tfResult.setText(String.valueOf(count));
        });

        btnReset.setOnAction((ActionEvent e) -> {
            tfResult.setText(String.valueOf(0));
        });

        Scene scene = new Scene(gridPane, 250, 180);   
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

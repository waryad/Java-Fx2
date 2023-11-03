/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
/**
 *
 * @author owner
 */
public class JavaFXApplication5 extends Application {
    
    @Override
    public void start(Stage stage) 
    {
        StackPane pane = new StackPane();
        Background background = new Background(new BackgroundFill(Color.NAVY, CornerRadii.EMPTY, Insets.EMPTY));
       
        Line[] line = new Line[8];
        
        line[0] = new Line();
        line[0].setStartX(0.0f);
        line[0].setEndX  (500.0f);
        line[0].setStartY(0.0f);
        line[0].setEndY  (300.0f);
        line[0].setStrokeWidth(60);
        line[0].setStroke(Color.WHITE);
        
        line[1] = new Line();
        line[1].setStartX(0.0f);
        line[1].setEndX  (500.0f);
        line[1].setStartY(0.0f);
        line[1].setEndY  (300.0f);
        line[1].setStrokeWidth(30);
        line[1].setStroke(Color.RED);
        
        
        line[2] = new Line();
        line[2].setStartX(0.0f);
        line[2].setEndX  (500.0f);
        line[2].setStartY(300.0f);
        line[2].setEndY  (0.0f);
        line[2].setStrokeWidth(60);
        line[2].setStroke(Color.WHITE);
        
        line[3] = new Line();
        line[3].setStartX(0.0f);
        line[3].setEndX  (500.0f);
        line[3].setStartY(300.0f);
        line[3].setEndY  (0.0f);
        line[3].setStrokeWidth(30);
        line[3].setStroke(Color.RED);
      
        line[4] = new Line();
        line[4].setStartX(250.0f);
        line[4].setEndX  (250.0f);
        line[4].setStartY(0.0f);
        line[4].setEndY  (300.0f);
        line[4].setStrokeWidth(100);
        line[4].setStroke(Color.WHITE);
          
        line[5] = new Line();
        line[5].setStartX(0.0f);
        line[5].setEndX  (500.0f);
        line[5].setStartY(150.0f);
        line[5].setEndY  (150.0f);
        line[5].setStrokeWidth(100);
        line[5].setStroke(Color.WHITE);
        
        line[6] = new Line();
        line[6].setStartX(0.0f);
        line[6].setEndX  (500.0f);
        line[6].setStartY(150.0f);
        line[6].setEndY  (150.0f);
        line[6].setStrokeWidth(60);
        line[6].setStroke(Color.RED);
        
        line[7] = new Line();
        line[7].setStartX(250.0f);
        line[7].setEndX  (250.0f);
        line[7].setStartY(0.0f);
        line[7].setEndY  (300.0f);
        line[7].setStrokeWidth(60);
        line[7].setStroke(Color.RED);
       
        Scene scene = new Scene(pane, 500, 300);
        pane.setBackground(background);
        
        for (int i = 0; i< line.length ; i++) 
        {
                
        pane.getChildren().add(line[i]);
        }
        
        stage.setScene(scene);
        stage.setTitle("The Union Jack");
        stage.show();
        }
 public static void main(String[] args) 
        {
        launch(args);
        }
    } 
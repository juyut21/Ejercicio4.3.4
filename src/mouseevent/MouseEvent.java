/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouseevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class MouseEvent extends Application {
     private double startdragX;
     private double startdragY;
     
    @Override
    public void start(Stage primaryStage) {
       
        Label texto1 = new Label("Programming is fun");
      
        texto1.setOnMousePressed(e-> {
            startdragX=texto1.getLayoutX();
            startdragY=texto1.getLayoutY();
        });
        
        texto1.setOnMouseDragged(e-> {
           texto1.setTranslateX(e.getSceneX()-startdragX);
           texto1.setTranslateY(e.getSceneY()-startdragY);
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(texto1);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("MouseEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

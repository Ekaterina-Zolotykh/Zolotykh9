
package zolotykh9;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Zolotykh9 extends Application {
    
   public static void main(String[] args) 
    {
        launch(args);
    }
 
    @Override
    public void start(Stage theStage) 
    {
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                   Label secondLabel = new Label("Sorry, but your game not found");
              
               StackPane secondaryLayout = new StackPane();
               Canvas screen = new Canvas(800, 700);
               secondaryLayout.getChildren().add(screen);
               Scene secondScene = new Scene(secondaryLayout, 800, 700);
               GraphicsContext gc1 = screen.getGraphicsContext2D();
               Image pic2 = new Image("fon.jpeg");
               gc1.drawImage(pic2, 0, 0);
               secondaryLayout.getChildren().add(secondLabel);
                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Second Stage");
                newWindow.setScene(secondScene);
 
                // Set position of second window, related to primary window.
                newWindow.setX(theStage.getX() + 200);
                newWindow.setY(theStage.getY() + 100);
                secondLabel.getStylesheets().add("css/label.css");
                newWindow.show();
            }
        });
        theStage.setTitle("Disney princess");
           Group root = new Group();
    Scene theScene = new Scene( root );
    theStage.setScene( theScene );
         
    Canvas canvas = new Canvas( 800, 700 );
    root.getChildren().add( canvas );
     
    btn.setText("Start");
    
    btn.relocate(600,600);
        Button exit = new Button();
        exit.setText("Exit");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = (Stage) exit.getScene().getWindow();
                stage.close();
            }
        });
        root.getChildren().add(exit);
        exit.relocate(700,600);
        // btn.setBackground(Background.EMPTY);
        root.getChildren().add(btn);
      
        GraphicsContext gc = canvas.getGraphicsContext2D();
    
    //ot.getChildren().add(btn);
    //aphicsContext gc = canvas.getGraphicsContext2D();
         
    gc.setFill( Color.PINK );
    gc.setStroke( Color.PURPLE );
    gc.setLineWidth(2);
    Font theFont = Font.font( "Times New Roman", FontWeight.BOLD, 48 );
    gc.setFont( theFont );
    Image pic2 = new Image( "fon.jpeg" );
       gc.drawImage( pic2, 0, 0 );
    gc.fillText( "Disney princess", 200, 50 );
    gc.strokeText( "Disney princess", 200, 50 );
    Image pic = new Image( "avrora.png" );
    Image pic1 = new Image( "snejka.png" );
    Image pic3 = new Image( "rusalochka.png" );
  
    gc.drawImage( pic, 30, 370 );
    gc.drawImage( pic1, 500, 250 );
    gc.drawImage( pic3, 250, 200 );
    gc.setFill(Color.GREY );
    gc.setLineWidth(2);
    root.getStylesheets().add("css/knopka.css");
    Font in = Font.font("Times New Roman", FontWeight.BOLD, 18);
    gc.setFont(in);
    gc.fillText("©Zolotykh E.V. FMFI-b18PIo", 450, 670);
        theStage.show();
    }
}

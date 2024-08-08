import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * extends JavaFX Application to provide a simple menu interface
 */
public class MenuGUI extends Application{
    public void start (Stage stage) {
        stage.setTitle("Menu Bar GUI");
        
        // create a gridpane and scene
        GridPane gridPane = new GridPane(); 
        Scene scene = new Scene(gridPane, 500, 300);

        // add GridPane settings
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);                           
        gridPane.setVgap(10); 

        // add textbox
        TextField textField = new TextField();
        textField.setEditable(false);
        textField.setPrefColumnCount(26);
        gridPane.add(textField, 1, 0);

        // add menu
        Menu menu = new Menu("Menu");
        
        // item 1: print current date & time to text box
        MenuItem m1 = new MenuItem("Date & Time");
        m1.setOnAction(event -> {
            Date date = new Date();
            textField.setText("Current date and time is: " + date);
        });
        
        // item 2: write textbox contents to file log.txt
        MenuItem m2 = new MenuItem("Export Date");
        m2.setOnAction(event -> {
            try (FileOutputStream fileByteStream = new FileOutputStream("log.txt");
                PrintWriter outFS = new PrintWriter(fileByteStream);) {
                outFS.println(textField.getText());
            } 
            catch (FileNotFoundException e) {
                System.err.println(e.getMessage());
            }
            catch (IOException e) {
                System.err.println(e.getMessage());
            }
        });
        
        // item 3: change frame background color to random hue of green
        MenuItem m3 = new MenuItem("Change Hue");
        m3.setOnAction(event -> {
            int g_val = (int)(Math.random()*256);
            Color green_hue = Color.rgb(0, g_val, 0);
            Background background = new Background(new BackgroundFill(green_hue, CornerRadii.EMPTY, Insets.EMPTY));
            gridPane.setBackground(background);
        });
        
        // item 4: exit
        MenuItem m4 = new MenuItem("Quit");
        m4.setOnAction(event -> {
            Platform.exit();
        });
            
        menu.getItems().addAll(m1, m2, m3, m4);
        
        // create menu bar and add menus
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        gridPane.add(menuBar, 0, 0);
        
        // set the scene 
        stage.setScene(scene); 
        stage.show();
    }
}

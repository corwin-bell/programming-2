/*
 * Create a user interface that has a top bar that includes a menu. The menu should have four items:
1. When the user selects the first menu option, then the date and time should be printed in a text box.
2. When the user selects the second menu option, then the text box contents should be written to a text file named "log.txt."
3. When the user selects the third menu item then the frame background color changes to random color hue of the color green. 
The menu option should display the initial random hue each time selected for a single execution of the program.
4. When the user selects the fourth menu option then the program exits.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MenuGUI extends Application{
    public void start (Stage stage) {
        stage.setTitle("Menu Bar GUI");
        // create a gridpane and scene
        GridPane gridPane = new GridPane(); 
        Scene scene = new Scene(gridPane, 500, 300);

        // add GridPane settings
        gridPane.setPadding(new Insets(10, 10, 10, 10)); // Padding around  grid
        gridPane.setHgap(10);                            // Spacing between columns
        gridPane.setVgap(10); 

        // add textbox
        TextField textField = new TextField();
        textField.setEditable(false);
        gridPane.add(textField, 1, 0);
        // add menu
        Menu menu = new Menu("Menu");
        // item 1: print current date & time to text box
        MenuItem m1 = new MenuItem("Date & Time");
        
        // item 2: write textbox contents to file log.txt
        // item 3: change frame background color to random hue of green
        // item 4: exit
        // add items up to scene    
        menu.getItems().addAll(m1); // I think I can add other menu items to the method
        // create menu bar and add menus
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        gridPane.add(menuBar, 0, 0);
        // set the scene 
        stage.setScene(scene); 
        stage.show();
    }
}

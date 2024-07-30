/*
 * Create a user interface that has a top bar that includes a menu. The menu should have four items:
1. When the user selects the first menu option, then the date and time should be printed in a text box.
2. When the user selects the second menu option, then the text box contents should be written to a text file named "log.txt."
3. When the user selects the third menu item then the frame background color changes to random color hue of the color green. 
The menu option should display the initial random hue each time selected for a single execution of the program.
4. When the user selects the fourth menu option then the program exits.
 */

import javafx.application.Application;
import javafx.stage.Stage;
public class MenuGUI extends Application{
    public void start (Stage s) {
        s.setTitle("Menu Bar");
        // create fx menu bar with 4 items
        // create uneditable textbox
        // add and define action listeners to menu items
        // item 1: print current date & time to text box
        // item 2: write textbox contents to file log.txt
        // item 3: change frame background color to random hue of green
        // item 4: exit
        // add items up to scene    
        s.show();
    }
}

/* 
 * Create a simple Graphical User Interface (GUI) Bank Balance application. 
 * The application must obtain the BankAccount balance from a user, and then 
 * display that balance within a JPanel when the user selects a button. 
 * The program should allow for the user to deposit and withdraw funds from their account using a simple interface. 
 * The remaining balance in the account should be displayed before exiting the program. 
 * Ensure that your application includes the following components:
    * JPanel
    * JButton
    * ActionListener
 * Submit screenshots of your program's execution and output. Include all appropriate source code in a zip file.
*/

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class BankBalanceFrame {
    public static void main(String[] args) {
        // create components
            JFrame BankBalanceFrame = new JFrame("Bank Balance Calculator");
            JPanel BankBalancePanel = new JPanel();
            // Deposit components
            JTextField DepositField = new JTextField(15);
            DepositField.setEditable(true);
            JButton DepositButton = new JButton("Deposit");
            // Withdraw components
            JButton withdrawButton = new JButton("Withdraw");
            // Balance components
            JTextField BalanceField = new JTextField(15);
            DepositField.setEditable(false);
        
        // add components to panel
        BankBalancePanel.add(DepositField);
        BankBalancePanel.add(DepositButton);
        BankBalancePanel.add(BalanceField);
        // add panel to frame
        BankBalanceFrame.add(BankBalancePanel); 

    // override actionPerformed method
        // on click show updated balance
        
        BankBalanceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BankBalanceFrame.pack();
        BankBalanceFrame.setVisible(true);

    }
}

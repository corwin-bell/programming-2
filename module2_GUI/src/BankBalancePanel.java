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

public class BankBalancePanel extends JPanel{ // TODO: add implements ActionListener
    // Deposit components
    private JTextField depositField;
    private JLabel depositLabel;
    private JButton depositButton;
    // Withdraw components
    private JTextField withdrawField;
    private JLabel withdrawLabel;
    private JButton withdrawButton;

    // Balance components
    private JTextField balanceField;
    private JLabel balanceLabel;

    // default constructor
    public BankBalancePanel() {
        // Deposit components
        depositField = new JTextField(15);
        depositField.setEditable(true);
        depositLabel = new JLabel("Deposit: ");
        depositButton = new JButton("Deposit");
        // Withdraw components
        withdrawField = new JTextField(15);
        withdrawField.setEditable(true);
        withdrawLabel = new JLabel("Withdraw: ");
        withdrawButton = new JButton("Withdraw");

        // Balance components
        balanceField = new JTextField(15);
        depositField.setEditable(false);
        balanceLabel = new JLabel("Balance: ");
        
        // add components to panel
        add(depositLabel);
        add(depositField);
        add(depositButton);
        add(withdrawLabel);
        add(withdrawField);
        add(withdrawButton);
        add(balanceLabel);
        add(balanceField);
    }
    // override actionPerformed method
        // on click show updated balance
}

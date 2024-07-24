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

public class BankBalancePanel extends JPanel { // removed implements ActionListener since now declared for each button
    // Deposit components
    private JFormattedTextField depositField;
    private JLabel depositLabel;
    private JButton depositButton;
    
    // Withdraw components
    private JFormattedTextField withdrawField;
    private JLabel withdrawLabel;
    private JButton withdrawButton;

    // Balance components
    private double balance;
    private JTextField balanceField;
    private JLabel balanceLabel;

    // default constructor
    public BankBalancePanel() {
        
        // set deposit components
        depositField = new JFormattedTextField(NumberFormat.getNumberInstance());
        depositField.setColumns(15);
        depositField.setText("0");
        depositField.setEditable(true);
        depositLabel = new JLabel("Deposit: ");
        depositButton = new JButton("Deposit");
        
        // deposit action
        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double deposit = ((Number) depositField.getValue()).doubleValue();
                balance += deposit;
                balanceField.setText(Double.toString(balance));
            }
        });
        
        // set withdraw components
        withdrawField = new JFormattedTextField(NumberFormat.getNumberInstance());
        withdrawField.setColumns(15);
        withdrawField.setText("0");
        withdrawField.setEditable(true);
        withdrawLabel = new JLabel("Withdraw: ");
        withdrawButton = new JButton("Withdraw");
        
        // withdraw action
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double withdraw = ((Number) withdrawField.getValue()).doubleValue();
                balance -= withdraw;
                balanceField.setText(Double.toString(balance));
            }
        });
        
        // Balance components
        balance = 0;
        balanceField = new JTextField(15);
        balanceField.setEditable(false);
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
    // @Override
    // public void actionPerformed(ActionEvent event) {
    //     double deposit = ((Number) depositField.getValue()).doubleValue();
    //     balance += deposit;
    //     balanceField.setText(Double.toString(balance));
    // }

    public static void main(String[] args) {
        JFrame bankFrame = new JFrame();
        
        // add panel to frame
        BankBalancePanel bankBalancePanel = new BankBalancePanel();
        bankFrame.add(bankBalancePanel);
        
        // set frame attributes
        bankFrame.pack();
        bankFrame.setTitle("Bank App");
        bankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bankFrame.setVisible(true);
}
}

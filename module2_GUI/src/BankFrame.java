import javax.swing.JFrame;

public class BankFrame {
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

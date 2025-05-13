import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import javax.swing.JLabel;


public class Board extends JPanel {
    
    private final int B_WIDTH = 450;
    private final int B_HEIGHT = 240;
    private final int TEXT_WIDTH = 10;

    private final double INIT_BALANCE = 1000.00;
    private final double INIT_APR = 5.0;
    JLabel labelInterest;
    JButton button;
    JTextField textInterest;
    JTextField textRate;
    JLabel labelBalance;

    private double balance;


    // constructor.
    public Board() {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        balance = INIT_BALANCE;

        labelInterest = new JLabel("Interest Rate (%): ");
        this.add(labelInterest);

        textRate = new JTextField(TEXT_WIDTH);
        textRate.setText(Double.toString(INIT_APR));
        this.add(textRate);
        

        //add a button
         button = new JButton("Click me");
        this.add(button);

        labelBalance = new JLabel(String.format("Balance ($): %.2f" , balance));
        this.add(labelBalance);

        //add an event listener 
        button.addActionListener(new ClickMeListener());
      

      
    }
      // this inner class is used to listen for mouse clicks.
      class ClickMeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
            double rate = Double.parseDouble(textRate.getText());
            rate = rate / 100.0;
            balance = balance + (rate * balance);
            

            String text = String.format("Balance ($): %.2f", balance);
            labelBalance.setText(text);
        } catch (NumberFormatException ex) {
            labelBalance.setText("Invalid input.");
        }

    }
}


}
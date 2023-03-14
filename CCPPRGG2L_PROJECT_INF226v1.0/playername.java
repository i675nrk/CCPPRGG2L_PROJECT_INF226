import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class playername extends JFrame {

    JTextField textField;
    JTextField textField2;

    playername() {
        super("TicTacToe");
        this.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel();
        label.setText("Enter Player O Name: ");
        label.setFont(new Font("Arial", Font.BOLD, 30));
        label.setForeground(new Color(216,135,255));

        // JTextField
        textField = new JTextField(20);

        // Adds event to textfield
        EventHandler handler = new EventHandler();
        textField.addKeyListener(handler);

        // Add components to frame
        this.add(label);
        this.add(textField);

        ////////////////////////////////////////////////////////////////////////

         // JLabel
         JLabel label2 = new JLabel();
         label2.setText("Enter Player X Name: ");
         label2.setFont(new Font("Arial", Font.BOLD, 30));
         label2.setForeground(new Color(78,215,255));
 
         // JTextField
         textField2 = new JTextField(20);
         // Adds event to textfield
         EventHandler handler2 = new EventHandler();
         textField2.addKeyListener(handler2);
 
         // Add components to frame
         this.add(label2);
         this.add(textField2);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(500, 500);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(new Color(27, 11, 84));

        
    }

    private class EventHandler implements KeyListener {

        public void keyPressed(KeyEvent event) {

            TicTacToeeasy gp = TicTacToeeasy();
            TicTacToemedium tm = TicTacToemedium();
            TicTacToehard th = TicTacToehard();

            // If ENTER button is pressed, do this
            if (event.getKeyCode() == KeyEvent.VK_ENTER) {

                //player o
                gp.Nameplayero = textField.getText();
                tm.Nameplayero = textField.getText();
                th.Nameplayero = textField.getText();

                gp.Nameplayerx = textField2.getText();
                tm.Nameplayerx = textField2.getText();
                th.Nameplayerx = textField2.getText();

    
                // Close playermenu frame
                dispose();

                // Go to game frame
                new GameDifficulty();
            }
        }

        private TicTacToehard TicTacToehard() {
            return null;
        }

        private TicTacToemedium TicTacToemedium() {
            return null;
        }

        public void keyTyped(KeyEvent event) {
            //
        }

        public void keyReleased(KeyEvent event) {
            //
        }
    }

    public GameDifficulty GameDifficulty() {
        return null;
    }

    public TicTacToeeasy TicTacToeeasy() {
        return null;
    }
}
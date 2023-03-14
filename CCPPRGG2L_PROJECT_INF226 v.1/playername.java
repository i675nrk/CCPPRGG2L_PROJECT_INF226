import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class playername extends JFrame {

    JTextField textField;

    playername() {
        super("Snake Game");
        this.setLayout(new FlowLayout());

        // JLabel
        JLabel label = new JLabel();
        label.setText("Enter player name: ");
        label.setFont(new Font("Arial", Font.BOLD, 30));

        // JTextField
        textField = new JTextField(20);
        // Adds event to textfield
        EventHandler handler = new EventHandler();
        textField.addKeyListener(handler);

        // Add components to frame
        this.add(label);
        this.add(textField);

        ///

         // JLabel
         JLabel label2 = new JLabel();
         label.setText("Enter player name: ");
         label.setFont(new Font("Arial", Font.BOLD, 30));
 
         // JTextField
         textField = new JTextField(20);
         // Adds event to textfield
         EventHandler handler2 = new EventHandler();
         textField.addKeyListener(handler2);
 
         // Add components to frame
         this.add(label2);
         this.add(textField);

        // Close java program when closing window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // dimension of frame
        this.setSize(500, 500);
        // makes frame appear
        this.setVisible(true);
        // set frame to center
        this.setLocationRelativeTo(null);
        // background color of frame
        this.getContentPane().setBackground(new Color(200, 20, 100));
    }

    private class EventHandler implements KeyListener {

        public void keyPressed(KeyEvent event) {

            TicTacToeeasy gp = TicTacToeeasy();
            TicTacToemedium tm = TicTacToemedium();
            TicTacToehard th = TicTacToehard();

            // If ENTER button is pressed, do this
            if (event.getKeyCode() == KeyEvent.VK_ENTER) {

                gp.Nameplayero = textField.getText();
                tm.Nameplayero = textField.getText();
                th.Nameplayero = textField.getText();

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
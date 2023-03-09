import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.*;

public class playername extends JFrame implements ActionListener{

    public playername(){

        super("tictactoe");
        this.setlayout(new FlowLayout());

        //close java program when closing the window
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //dimensions of frame
        this.setSize(500,500);

        // makes frame appear
        this.setVisible(true);

        //set freame to center
        this.setLocationRelativeTo(null);

        this.getContentPane().setBackground(new Color(200, 20 ,100));
        
        
    }

    private void setlayout(FlowLayout flowLayout) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
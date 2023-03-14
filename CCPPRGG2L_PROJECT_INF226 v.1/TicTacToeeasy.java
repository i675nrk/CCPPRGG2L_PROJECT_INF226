import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class TicTacToeeasy implements ActionListener {

    int turn = 0;
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JPanel Player_name_o = new JPanel();
    JLabel textfield = new JLabel();
    JLabel nameplayer = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    static String Nameplayero;

    

    TicTacToeeasy() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        textfield.setBackground(new Color(65, 105, 225));
        textfield.setForeground(new Color(255, 255, 255));
        textfield.setFont(new Font("Monospace", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText(Nameplayero);
        textfield.setOpaque(true);

        

        nameplayer.setBackground(new Color(65, 105, 225));
        nameplayer.setForeground(new Color(255, 255, 255));
        nameplayer.setFont(new Font("Monospace", Font.BOLD, 75));
        nameplayer.setHorizontalAlignment(JLabel.CENTER);
        nameplayer.setText(Nameplayero);
        nameplayer.setOpaque(true);
        

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        Player_name_o.setLayout(new BorderLayout());
        Player_name_o.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("DialogInput", Font.BOLD, 130));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        Player_name_o.add(nameplayer);
        frame.add(Player_name_o, BorderLayout.SOUTH);
        frame.add(button_panel);
        

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 192, 203));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textfield.setText("O TURN");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(135, 206, 250));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textfield.setText("X TURN");
                        check();
                    }
                }
            }
        }
    }

    public void firstTurn() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if (random.nextInt(2) == 0) {
            player1_turn = true;
            textfield.setText("X TURN");
        } else {
            player1_turn = false;
            textfield.setText("O TURN");
        }
    }

    public void check() {
        // check X win conditions
        if ((buttons[0].getText() == "X") &&
                (buttons[1].getText() == "X") &&
                (buttons[2].getText() == "X")) {
            xWins(0, 1, 2);
        }
        if ((buttons[3].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[5].getText() == "X")) {
            xWins(3, 4, 5);
        }
        if ((buttons[6].getText() == "X") &&
                (buttons[7].getText() == "X") &&
                (buttons[8].getText() == "X")) {
            xWins(6, 7, 8);
        }
        if ((buttons[0].getText() == "X") &&
                (buttons[3].getText() == "X") &&
                (buttons[6].getText() == "X")) {
            xWins(0, 3, 6);
        }
        if ((buttons[1].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[7].getText() == "X")) {
            xWins(1, 4, 7);
        }
        if ((buttons[2].getText() == "X") &&
                (buttons[5].getText() == "X") &&
                (buttons[8].getText() == "X")) {
            xWins(2, 5, 8);
        }
        if ((buttons[0].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[8].getText() == "X")) {
            xWins(0, 4, 8);
        }
        if ((buttons[2].getText() == "X") &&
                (buttons[4].getText() == "X") &&
                (buttons[6].getText() == "X")) {
            xWins(2, 4, 6);
        }
        // check O win conditions
        if ((buttons[0].getText() == "O") &&
                (buttons[1].getText() == "O") &&
                (buttons[2].getText() == "O")) {
            oWins(0, 1, 2);
        }
        if ((buttons[3].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[5].getText() == "O")) {
            oWins(3, 4, 5);
        }
        if ((buttons[6].getText() == "O") &&
                (buttons[7].getText() == "O") &&
                (buttons[8].getText() == "O")) {
            oWins(6, 7, 8);
        }
        if ((buttons[0].getText() == "O") &&
                (buttons[3].getText() == "O") &&
                (buttons[6].getText() == "O")) {
            oWins(0, 3, 6);
        }
        if ((buttons[1].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[7].getText() == "O")) {
            oWins(1, 4, 7);
        }
        if ((buttons[2].getText() == "O") &&
                (buttons[5].getText() == "O") &&
                (buttons[8].getText() == "O")) {
            oWins(2, 5, 8);
        }
        if ((buttons[0].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[8].getText() == "O")) {
            oWins(0, 4, 8);
        }
        if ((buttons[2].getText() == "O") &&
                (buttons[4].getText() == "O") &&
                (buttons[6].getText() == "O")) {
            oWins(2, 4, 6);
        }
    

   
    turn++;
    if(turn == 9){
    UIManager.put("OptionPane.background", new ColorUIResource(42,49,88));
    UIManager.put("Panel.background",  new ColorUIResource(42,49,88));
    UIManager.put("OptionPane.messageForeground", Color.WHITE);    
    UIManager.put("OptionPane.questionIcon", new ImageIcon("DRAW.png"));
    int result = JOptionPane.showConfirmDialog(null, "TRY AGAIN?", "DRAW!", JOptionPane.YES_NO_OPTION);
    
    if(result == JOptionPane.YES_OPTION){
            frame.dispose();
            new MainMenu();
        }else if (result == JOptionPane.NO_OPTION){
            System.exit(0);
            
        }
    }

}


public void xWins(int a, int b, int c) {
    buttons[a].setBackground(Color.CYAN);
    buttons[b].setBackground(Color.CYAN);
    buttons[c].setBackground(Color.CYAN);

    for (int i = 0; i < 9; i++) {
        textfield.setEnabled(false);
    }
    textfield.setText("X WINS");
    UIManager.put("OptionPane.background", new ColorUIResource(42,49,88));
    UIManager.put("Panel.background",  new ColorUIResource(42,49,88));
    UIManager.put("OptionPane.messageForeground", Color.WHITE);    
    UIManager.put("OptionPane.questionIcon", new ImageIcon("X.png"));
    int result = JOptionPane.showConfirmDialog(null, "PLAY AGAIN?", "X WON", JOptionPane.YES_NO_OPTION);
    
    if(result == JOptionPane.YES_OPTION){
            frame.dispose();
            new MainMenu();
        }else if (result == JOptionPane.NO_OPTION){
            System.exit(0);
            
        }
}

public void oWins(int a, int b, int c) {
    buttons[a].setBackground(Color.PINK);
    buttons[b].setBackground(Color.PINK);
    buttons[c].setBackground(Color.PINK);

    for (int i = 0; i < 9; i++) {
        textfield.setEnabled(false);
    }
    textfield.setText("O WINS");
    UIManager.put("OptionPane.background", new ColorUIResource(42,49,88));
    UIManager.put("Panel.background",  new ColorUIResource(42,49,88));
    UIManager.put("OptionPane.messageForeground", Color.WHITE);    
    UIManager.put("OptionPane.questionIcon", new ImageIcon("O.png"));
    int result = JOptionPane.showConfirmDialog(null, "PLAY AGAIN?", "O WON", JOptionPane.YES_NO_OPTION);
    
    if(result == JOptionPane.YES_OPTION){
            frame.dispose();
            new MainMenu();
        }else if (result == JOptionPane.NO_OPTION){
            System.exit(0);
            
        }
    }
}
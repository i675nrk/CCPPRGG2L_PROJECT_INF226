import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class TicTacToehard implements ActionListener{

	int turn = 0;
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[25];
	boolean player1_turn;

	Color colorX;
    Color colorO;

	TicTacToehard(Color colorX, Color colorO){
		
		this.colorX = colorX;
        this.colorO = colorO;

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setResizable(false);
        frame.setLocationRelativeTo(null);
		
		textfield.setBackground(new Color(65, 105, 225));
		textfield.setForeground(new Color(255, 255, 255));
		textfield.setFont(new Font("Monospace", Font.BOLD, 75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Tic-Tac-Toe");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(5,5));
		button_panel.setBackground(new Color(150,150,150));
		
		for(int i=0;i<25;i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("DialogInput", Font.BOLD, 130));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}
		
		title_panel.add(textfield);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.add(button_panel);
		
		firstTurn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0;i<25;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(colorX);
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("O turn");
						check();
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(colorO);
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText("X turn");
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
		
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("X turn");
		}
		else {
			player1_turn=false;
			textfield.setText("O turn");
		}
	}
	
	public void check() {
		//check X win conditions
		if(
				(buttons[0].getText()=="X") &&
				(buttons[1].getText()=="X") &&
				(buttons[2].getText()=="X") &&
                (buttons[3].getText()=="X") &&
				(buttons[4].getText()=="X")
				) {
			xWins(0,1,2,3,4);
		}
		if(
				(buttons[5].getText()=="X") &&
				(buttons[6].getText()=="X") &&
				(buttons[7].getText()=="X") &&
                (buttons[8].getText()=="X") &&
				(buttons[9].getText()=="X")

				) {
			xWins(5,6,7,8,9 );
		}
		if(
				(buttons[10].getText()=="X") &&
				(buttons[11].getText()=="X") &&
				(buttons[12].getText()=="X") &&
                (buttons[13].getText()=="X") &&
				(buttons[14].getText()=="X")
				) {
			xWins(10,11,12,13,14);
		}
		if(
				(buttons[15].getText()=="X") &&
				(buttons[16].getText()=="X") &&
				(buttons[17].getText()=="X") &&
                (buttons[18].getText()=="X") &&
				(buttons[19].getText()=="X")
				) {
			xWins(15,16,17,18,19);
		}
        if(
				(buttons[20].getText()=="X") &&
				(buttons[21].getText()=="X") &&
				(buttons[22].getText()=="X") &&
                (buttons[23].getText()=="X") &&
				(buttons[24].getText()=="X")
				) {
			xWins(20,21,22,23,24);
		}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[5].getText()=="X") &&
				(buttons[10].getText()=="X") &&
				(buttons[15].getText()=="X") &&  
                (buttons[20].getText()=="X")
				) {
			xWins(0,5,10,15,20);
		}
		if(
				(buttons[1].getText()=="X") &&
				(buttons[6].getText()=="X") &&
				(buttons[11].getText()=="X") &&
                (buttons[16].getText()=="X") &&
				(buttons[21].getText()=="X")
				) {
			xWins(1,6,11,16,21);
		}
		if(
				(buttons[2].getText()=="X") &&
				(buttons[7].getText()=="X") &&
				(buttons[12].getText()=="X") &&
                (buttons[17].getText()=="X") &&
				(buttons[22].getText()=="X")
				) {
			xWins(2,7,12,17,22);
		}
		if(
				(buttons[3].getText()=="X") &&
				(buttons[8].getText()=="X") &&
				(buttons[13].getText()=="X") &&
                (buttons[18].getText()=="X") &&
				(buttons[23].getText()=="X")
				) {
			xWins(3,8,13,18,23);
		}
        if(
				(buttons[4].getText()=="X") &&
				(buttons[9].getText()=="X") &&
				(buttons[14].getText()=="X") &&
                (buttons[19].getText()=="X") &&
				(buttons[24].getText()=="X")
				) {
			xWins(4,9,14,19,24);
		}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[6].getText()=="X") &&
				(buttons[12].getText()=="X") &&
                (buttons[18].getText()=="X") &&
				(buttons[24].getText()=="X")
				) {
			xWins(0,6,12,18,24);
		}
		if(
				(buttons[4].getText()=="X") &&
				(buttons[8].getText()=="X") &&
				(buttons[12].getText()=="X") &&
                (buttons[16].getText()=="X") &&
				(buttons[20].getText()=="X")
				) {
			xWins(4,8,12,16,20);
		}
		//check O win conditions
		if(
				(buttons[0].getText()=="O") &&
				(buttons[1].getText()=="O") &&
				(buttons[2].getText()=="O") &&
                (buttons[3].getText()=="O") &&
				(buttons[4].getText()=="O")
				) {
			oWins(0,1,2,3,4);
		}
		if(
				(buttons[5].getText()=="O") &&
				(buttons[6].getText()=="O") &&
				(buttons[7].getText()=="O") &&
                (buttons[8].getText()=="O") &&
				(buttons[9].getText()=="O")

				) {
			oWins(5,6,7,8,9 );
		}
		if(
				(buttons[10].getText()=="O") &&
				(buttons[11].getText()=="O") &&
				(buttons[12].getText()=="O") &&
                (buttons[13].getText()=="O") &&
				(buttons[14].getText()=="O")
				) {
			oWins(10,11,12,13,14);
		}
		if(
				(buttons[15].getText()=="O") &&
				(buttons[16].getText()=="O") &&
				(buttons[17].getText()=="O") &&
                (buttons[18].getText()=="O") &&
				(buttons[19].getText()=="O")
				) {
			oWins(15,16,17,18,19);
		}
        if(
				(buttons[20].getText()=="O") &&
				(buttons[21].getText()=="O") &&
				(buttons[22].getText()=="O") &&
                (buttons[23].getText()=="O") &&
				(buttons[24].getText()=="O")
				) {
			oWins(20,21,22,23,24);
		}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[5].getText()=="O") &&
				(buttons[10].getText()=="O") &&
				(buttons[15].getText()=="O") &&  
                (buttons[20].getText()=="O")
				) {
			oWins(0,5,10,15,20);
		}
		if(
				(buttons[1].getText()=="O") &&
				(buttons[6].getText()=="O") &&
				(buttons[11].getText()=="O") &&
                (buttons[16].getText()=="O") &&
				(buttons[21].getText()=="O")
				) {
			oWins(1,6,11,16,21);
		}
		if(
				(buttons[2].getText()=="O") &&
				(buttons[7].getText()=="O") &&
				(buttons[12].getText()=="O") &&
                (buttons[17].getText()=="O") &&
				(buttons[22].getText()=="O")
				) {
			oWins(2,7,12,17,22);
		}
		if(
				(buttons[3].getText()=="O") &&
				(buttons[8].getText()=="O") &&
				(buttons[13].getText()=="O") &&
                (buttons[18].getText()=="O") &&
				(buttons[23].getText()=="O")
				) {
			oWins(3,8,13,18,23);
		}
        if(
				(buttons[4].getText()=="O") &&
				(buttons[9].getText()=="O") &&
				(buttons[14].getText()=="O") &&
                (buttons[19].getText()=="O") &&
				(buttons[24].getText()=="O")
				) {
			oWins(4,9,14,19,24);
		}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[6].getText()=="O") &&
				(buttons[12].getText()=="O") &&
                (buttons[18].getText()=="O") &&
				(buttons[24].getText()=="O")
				) {
			oWins(0,6,12,18,24);
		}
		if(
				(buttons[4].getText()=="O") &&
				(buttons[8].getText()=="O") &&
				(buttons[12].getText()=="O") &&
                (buttons[16].getText()=="O") &&
				(buttons[20].getText()=="O")
				) {
			oWins(4,8,12,16,20);
                }


				turn++;
				if(turn == 25){
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
		
			public void xWins(int a, int b, int c, int j, int k) {
				buttons[a].setBackground(Color.CYAN);
				buttons[b].setBackground(Color.CYAN);
				buttons[c].setBackground(Color.CYAN);
				buttons[j].setBackground(Color.CYAN);
				buttons[k].setBackground(Color.CYAN);


		
				for (int i = 0; i < 25; i++) {
					buttons[i].setEnabled(false);
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
		
			public void oWins(int a, int b, int c , int j , int k) {
				buttons[a].setBackground(Color.PINK);
				buttons[b].setBackground(Color.PINK);
				buttons[c].setBackground(Color.PINK);
				buttons[j].setBackground(Color.PINK);
				buttons[k].setBackground(Color.PINK);
		
				for (int i = 0; i < 25; i++) {
					buttons[i].setEnabled(false);
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
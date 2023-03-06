import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

public class TicTacToemedium implements ActionListener{

	int turn = 0;
	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[16];
	boolean player1_turn;

	TicTacToemedium(){
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);
		frame.setResizable(false);
        frame.setLocationRelativeTo(null);
		
		textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink Free",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Tic-Tac-Toe");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		
		button_panel.setLayout(new GridLayout(4,4));
		button_panel.setBackground(new Color(150,150,150));
		
		for(int i=0;i<16;i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
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
		
		for(int i=0;i<16;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("O turn");
						check();
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
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
				(buttons[3].getText()=="X")
				) {
			xWins(0,1,2,3);
		}
		if(
				(buttons[4].getText()=="X") &&
				(buttons[5].getText()=="X") &&
				(buttons[6].getText()=="X") &&
				(buttons[7].getText()=="X")

				) {
			xWins(4,5,6,7 );
		}
		if(
				(buttons[8].getText()=="X") &&
				(buttons[9].getText()=="X") &&
				(buttons[10].getText()=="X") &&
				(buttons[11].getText()=="X")
				) {
			xWins(8,9,10,11);
		}
		if(
				(buttons[12].getText()=="X") &&
				(buttons[13].getText()=="X") &&
				(buttons[14].getText()=="X") &&
				(buttons[15].getText()=="X")
				) {
			xWins(12,13,14,15);
		}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[8].getText()=="X") &&
				(buttons[12].getText()=="X")
				) {
			xWins(0,4,8,12);
		}
		if(
				(buttons[1].getText()=="X") &&
				(buttons[5].getText()=="X") &&
				(buttons[9].getText()=="X") &&
				(buttons[13].getText()=="X")
				) {
			xWins(1,5,9,13);
		}
		if(
				(buttons[2].getText()=="X") &&
				(buttons[6].getText()=="X") &&
				(buttons[10].getText()=="X") &&
				(buttons[14].getText()=="X")
				) {
			xWins(2,6,9,14);
		}
		if(
				(buttons[3].getText()=="X") &&
				(buttons[7].getText()=="X") &&
				(buttons[11].getText()=="X") &&
				(buttons[15].getText()=="X")
				) {
			xWins(3,7,11,15);
		}
		if(
				(buttons[0].getText()=="X") &&
				(buttons[5].getText()=="X") &&
				(buttons[10].getText()=="X") &&
				(buttons[15].getText()=="X")
				) {
			xWins(0,5,10,15);
		}
		if(
				(buttons[3].getText()=="X") &&
				(buttons[6].getText()=="X") &&
				(buttons[9].getText()=="X") &&
				(buttons[12].getText()=="X")
				) {
			xWins(3,6,9,12);
		}
		//check O win conditions
		if(
				(buttons[0].getText()=="O") &&
				(buttons[1].getText()=="O") &&
				(buttons[2].getText()=="O") &&
				(buttons[3].getText()=="O")
				) {
			oWins(0,1,2,3);
		}
		if(
				(buttons[4].getText()=="O") &&
				(buttons[5].getText()=="O") &&
				(buttons[6].getText()=="O") &&
				(buttons[7].getText()=="O")

				) {
			oWins(4,5,6,7 );
		}
		if(
				(buttons[8].getText()=="O") &&
				(buttons[9].getText()=="O") &&
				(buttons[10].getText()=="O") &&
				(buttons[11].getText()=="O")
				) {
			oWins(8,9,10,11);
		}
		if(
				(buttons[12].getText()=="O") &&
				(buttons[13].getText()=="O") &&
				(buttons[14].getText()=="O") &&
				(buttons[15].getText()=="O")
				) {
			oWins(12,13,14,15);
		}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[8].getText()=="O") &&
				(buttons[12].getText()=="O")
				) {
			oWins(0,4,8,12);
		}
		if(
				(buttons[1].getText()=="O") &&
				(buttons[5].getText()=="O") &&
				(buttons[9].getText()=="O") &&
				(buttons[13].getText()=="O")
				) {
			oWins(1,5,9,13);
		}
		if(
				(buttons[2].getText()=="O") &&
				(buttons[6].getText()=="O") &&
				(buttons[10].getText()=="O") &&
				(buttons[14].getText()=="O")
				) {
			oWins(2,6,9,14);
		}
		if(
				(buttons[3].getText()=="O") &&
				(buttons[7].getText()=="O") &&
				(buttons[11].getText()=="O") &&
				(buttons[15].getText()=="O")
				) {
			oWins(3,7,11,15);
		}
		if(
				(buttons[0].getText()=="O") &&
				(buttons[5].getText()=="O") &&
				(buttons[10].getText()=="O") &&
				(buttons[15].getText()=="O")
				) {
			oWins(0,5,10,15);
		}
		if(
				(buttons[3].getText()=="O") &&
				(buttons[6].getText()=="O") &&
				(buttons[9].getText()=="O") &&
				(buttons[12].getText()=="O")
				) {
			oWins(3,6,9,12);

	}

	
turn++;
if(turn == 16){
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

public void xWins(int a, int b, int c, int j) {
buttons[a].setBackground(Color.CYAN);
buttons[b].setBackground(Color.CYAN);
buttons[c].setBackground(Color.CYAN);
buttons[j].setBackground(Color.CYAN);


for (int i = 0; i < 16; i++) {
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

public void oWins(int a, int b, int c , int j ) {
buttons[a].setBackground(Color.PINK);
buttons[b].setBackground(Color.PINK);
buttons[c].setBackground(Color.PINK);
buttons[j].setBackground(Color.PINK);


for (int i = 0; i < 16; i++) {
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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GameDifficulty extends JFrame implements ActionListener{

    public GameDifficulty(){
        main(null);
    }
    public void main(String[] args) {
        
        // easygamemode
        ImageIcon easygamemode;
        easygamemode = new ImageIcon("play button copy 2.png");
        Image a = easygamemode.getImage();
        easygamemode = new ImageIcon(a.getScaledInstance(135,135, 0));

        // mediumgamemode
        ImageIcon mediumgamemode;
        mediumgamemode = new ImageIcon("play button copy 3.png");
        Image b = mediumgamemode.getImage();
        mediumgamemode = new ImageIcon(b.getScaledInstance(135,135, 0));

        //hardgamemode
        ImageIcon hardgamemode;
        hardgamemode = new ImageIcon("play button copy 4.png");
        Image c = hardgamemode.getImage();
        hardgamemode = new ImageIcon(c.getScaledInstance(135,135, 0));

        
        
        ImageIcon imgIcon = new ImageIcon("menubackground.png");
        ImageIcon bgIcon = new ImageIcon(imgIcon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH));
        JLabel backgroundLabel = new JLabel(bgIcon);
        JFrame gamedifficulty = new JFrame();
        
        
        //easygamemode
        JButton egm = new JButton();
        egm.setBounds(30, 185, 135,105);
        egm.setVisible(true);
        egm.setIcon(easygamemode);
        gamedifficulty.add(egm);
        JPanel easyJPanel = new JPanel();
        easyJPanel.add(backgroundLabel);
        gamedifficulty.add(easyJPanel);

        //mediumgamemode
        JButton mgm = new JButton();
        mgm.setBounds(180, 185, 135,105);
        mgm.setVisible(true);
        mgm.setIcon(mediumgamemode);
        gamedifficulty.add(mgm);
        JPanel mediumJPanel = new JPanel();
        mediumJPanel.add(backgroundLabel);
        gamedifficulty.add(mediumJPanel);

        //hardgamemode
        JButton hgm = new JButton();
        hgm.setBounds(330, 185, 135,105);
        hgm.setVisible(true);
        hgm.setIcon(hardgamemode);
        gamedifficulty.add(hgm);
        JPanel hardJPanel = new JPanel();
        hardJPanel.add(backgroundLabel);
        gamedifficulty.add(hardJPanel);


        //Menu Frame
        gamedifficulty.setTitle("Tic-Tac-Toe");
        gamedifficulty.add(backgroundLabel);
        gamedifficulty.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gamedifficulty.setSize(500, 500);
        gamedifficulty.setVisible(true);
        gamedifficulty.setResizable(false);
        gamedifficulty.setLocationRelativeTo(null);
    
        
        
        
        egm.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                 gamedifficulty.dispose();
                new TicTacToeeasy();
               
            
                
        }  
    });  

        mgm.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
             gamedifficulty.dispose();
            new TicTacToemedium();
           
        
            
    }  
    });  

        hgm.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                 gamedifficulty.dispose();
                new TicTacToehard();
               
            
                
        }  
    });  



    

    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
 }

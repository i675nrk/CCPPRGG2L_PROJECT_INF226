import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;

public class MainMenu extends JFrame implements ActionListener{

    public MainMenu(){
        main(null);
    }
    public static void main(String[] args) {
        //play
        ImageIcon playbutton;
        playbutton = new ImageIcon("play button.png");
        Image a= playbutton.getImage();
        playbutton = new ImageIcon(a.getScaledInstance(135,135, 0));

        ImageIcon imgIcon = new ImageIcon("menubackground.png");
        ImageIcon bgIcon = new ImageIcon(imgIcon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH));
        JLabel backgroundLabel = new JLabel(bgIcon);
        JFrame mainMenu = new JFrame();
        JButton btnplay = new JButton();
        

        //play
        btnplay.setBounds(180, 185, 125,95);
        btnplay.setVisible(true);
        btnplay.setBackground(Color.BLACK);
        btnplay.setIcon(playbutton);
        mainMenu.add(btnplay);
        JPanel panel = new JPanel();
        panel.add(backgroundLabel);
        mainMenu.add(panel);


        //Menu Frame
        mainMenu.setTitle("Tic-Tac-Toe");
        mainMenu.add(backgroundLabel);
        mainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenu.setSize(500, 500);
        mainMenu.setVisible(true);
        mainMenu.setResizable(false);
        mainMenu.setLocationRelativeTo(null);
    
        
        
        
        btnplay.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                mainMenu.dispose();
                new GameDifficulty();
            
                
        }  
    });  

    

    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
 }

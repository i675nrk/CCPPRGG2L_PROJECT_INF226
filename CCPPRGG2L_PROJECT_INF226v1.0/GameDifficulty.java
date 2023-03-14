import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Font;
import java.awt.Color;

import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GameDifficulty extends JFrame implements ActionListener{

    JList listX,listO;
    private String[] colorNameArrays = { "BLUE", "WHITE", "MAGENTA", "YELLOW" };
    private Color[] colorsClassArray = { Color.BLUE, Color.WHITE, Color.MAGENTA, Color.YELLOW };
    int buttonYpos = 275;

    int labelXpos = 50;
    int labalYpos = 5;
    int labelHeight = 30;
    int labelWidth = 300;

    int spacing = 50;

    Color colorX;
    Color colorO;

    JLabel labelX, labelO;


    public GameDifficulty(){
        main(null);
    }
    public void main(String[] args) {
        
        // easygamemode
        ImageIcon easygamemode;
        easygamemode = new ImageIcon("play button copy 2.png");
        Image b = easygamemode.getImage();
        easygamemode = new ImageIcon(b.getScaledInstance(135,135, 0));

        // mediumgamemode
        ImageIcon mediumgamemode;
        mediumgamemode = new ImageIcon("play button copy 3.png");
        Image c = mediumgamemode.getImage();
        mediumgamemode = new ImageIcon(c.getScaledInstance(135,135, 0));

        //hardgamemode
        ImageIcon hardgamemode;
        hardgamemode = new ImageIcon("play button copy 4.png");
        Image d = hardgamemode.getImage();
        hardgamemode = new ImageIcon(d.getScaledInstance(135,135, 0));

        
        
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

        labelX = new JLabel();
        labelX.setText("Color of Player X ");
        labelX.setFont(new Font("Arial", Font.BOLD, 30));
        labelX.setBounds(labelXpos,labalYpos, labelWidth, labelHeight);
        labelX.setForeground(Color.YELLOW);
        gamedifficulty.add(labelX);
        // Jlist component
        listX = new JList(colorNameArrays);
        listX.setFont(new Font("Arial", Font.BOLD, 30));
        listX.setVisibleRowCount(2);

        // Sets JList to selection one option at a time
        listX.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add event
        EventHandlerX handlerX = new EventHandlerX();
        listX.addListSelectionListener(handlerX);

        // JScrollPane
        JScrollPane scrollPaneX = new JScrollPane(listX);
        scrollPaneX.setBounds(labelXpos,labalYpos + spacing, labelWidth, labelHeight);

        labelO = new JLabel();
        labelO.setText("Color of Player O ");
        labelO.setFont(new Font("Arial", Font.BOLD, 30));
        labelO.setBounds(labelXpos,labalYpos + (spacing*2), labelWidth, labelHeight);
        labelO.setForeground(Color.YELLOW);
        gamedifficulty.add(labelO);
        // Jlist component
        listO = new JList(colorNameArrays);
        listO.setFont(new Font("Arial", Font.BOLD, 30));
        listO.setVisibleRowCount(2);

        // Sets JList to selection one option at a time
        listO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add event
        EventHandlerO handlerO = new EventHandlerO();
        listO.addListSelectionListener(handlerO);

        // JScrollPane
        JScrollPane scrollPaneO = new JScrollPane(listO);
        scrollPaneO.setBounds(labelXpos,labalYpos + (spacing*3), labelWidth, labelHeight);

        // ADd components to frame
        gamedifficulty.add(labelX);
        gamedifficulty.add(scrollPaneX);

        gamedifficulty.add(labelO);
        gamedifficulty.add(scrollPaneO);


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
                new TicTacToeeasy(colorX, colorO);
               
            
                
        }  
    });  

        mgm.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
             gamedifficulty.dispose();
            new TicTacToemedium(colorX, colorO);
           
        
            
    }  
    });  

        hgm.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                 gamedifficulty.dispose();
                new TicTacToehard(colorX, colorO);
               
            
                
        }  
    });  



    

    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private class EventHandlerX implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {
            colorX = colorsClassArray[listX.getSelectedIndex()];
            labelX.setForeground(colorsClassArray[listX.getSelectedIndex()]);
        }
    }

    private class EventHandlerO implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {
            colorO = colorsClassArray[listO.getSelectedIndex()];
            labelO.setForeground(colorsClassArray[listO.getSelectedIndex()]);
        }
   
    }
}

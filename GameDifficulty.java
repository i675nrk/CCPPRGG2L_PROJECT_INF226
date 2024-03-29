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
    int labalYpos = 25;
    int labelHeight = 50;
    int labelWidth = 300;

    int spacing = 50;

    Color colorX;
    Color colorO;

    JLabel labelX, labelO;

    public GameDifficulty(){
        main(null);
    }
    public void main(String[] args) {
        
        // Easy 
        ImageIcon easygamemode;
        easygamemode = new ImageIcon("play button easy.png");
        Image a = easygamemode.getImage();
        easygamemode = new ImageIcon(a.getScaledInstance(135,135, 0));

        // Medium
        ImageIcon mediumgamemode;
        mediumgamemode = new ImageIcon("play button medium.png"); 
        Image b = mediumgamemode.getImage();
        mediumgamemode = new ImageIcon(b.getScaledInstance(135,135, 0));

        // Hard
        ImageIcon hardgamemode;
        hardgamemode = new ImageIcon("play button hard.png"); 
        Image c = hardgamemode.getImage();
        hardgamemode = new ImageIcon(c.getScaledInstance(135,135, 0));

        ImageIcon imgIcon = new ImageIcon("plain background.png");
        ImageIcon bgIcon = new ImageIcon(imgIcon.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH));
        JLabel backgroundLabel = new JLabel(bgIcon);
        JFrame gamedifficulty = new JFrame();
        
        labelX = new JLabel();
        labelX.setText("Color of Player X ");
        labelX.setFont(new Font("Arial", Font.BOLD, 30));
        labelX.setBounds(labelXpos,labalYpos, labelWidth, labelHeight);
        labelX.setForeground(Color.YELLOW);
        gamedifficulty.add(labelX);

        // JList
        listX = new JList(colorNameArrays);
        listX.setFont(new Font("Arial", Font.BOLD, 30));
        listX.setVisibleRowCount(2);
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

        // Jlist 
        listO = new JList(colorNameArrays);
        listO.setFont(new Font("Arial", Font.BOLD, 30));
        listO.setVisibleRowCount(2);
        listO.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add event
        EventHandlerO handlerO = new EventHandlerO();
        listO.addListSelectionListener(handlerO);

        // JScrollPane
        JScrollPane scrollPaneO = new JScrollPane(listO);
        scrollPaneO.setBounds(labelXpos,labalYpos + (spacing*3), labelWidth, labelHeight);

        // Add components to frame
        gamedifficulty.add(labelX);
        gamedifficulty.add(scrollPaneX);
        gamedifficulty.add(labelO);
        gamedifficulty.add(scrollPaneO);

        // Easy Mode
        JButton egm = new JButton();
        egm.setBounds(30, buttonYpos, 135,105);
        egm.setVisible(true);
        egm.setIcon(easygamemode);
        gamedifficulty.add(egm);
        JPanel easyJPanel = new JPanel();
        easyJPanel.add(backgroundLabel);
        gamedifficulty.add(easyJPanel);

        // Medium Mode
        JButton mgm = new JButton();
        mgm.setBounds(180, buttonYpos, 135,105);
        mgm.setVisible(true);
        mgm.setIcon(mediumgamemode);
        gamedifficulty.add(mgm);
        JPanel mediumJPanel = new JPanel();
        mediumJPanel.add(backgroundLabel);
        gamedifficulty.add(mediumJPanel);

        // Hard Mode
        JButton hgm = new JButton();
        hgm.setBounds(330, buttonYpos, 135,105);
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
                new TicTacToeeasy(colorX,colorO);
               
            
                
        }  
    });  

        mgm.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){ 
             gamedifficulty.dispose();
            new TicTacToemedium(colorX,colorO);
           
        
            
    }  
    });  

        hgm.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){ 
                 gamedifficulty.dispose();
                new TicTacToehard(colorX,colorO);
               
            
                
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
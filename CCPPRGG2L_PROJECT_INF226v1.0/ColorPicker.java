import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ColorPicker {
    JList list;
    private String[] colorNameArrays = { "BLUE", "WHITE", "MAGENTA", "YELLOW" };
    private Color[] colorsClassArray = { Color.BLUE, Color.WHITE, Color.MAGENTA, Color.YELLOW };

    ColorPicker(GameDifficulty gamedifficulty) {

        // JLabel component
        JLabel label = new JLabel();
        label.setText("Choose your favorite color: ");
        label.setFont(new Font("Arial", Font.BOLD, 30));
        label.setBounds(100, 100, 100, 100);
        label.setVisible(true);
        // Jlist component
        list = new JList(colorNameArrays);
        list.setFont(new Font("Arial", Font.BOLD, 30));
        list.setVisibleRowCount(2);

        // Sets JList to selection one option at a time
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add event
        EventHandler handler = new EventHandler();
        list.addListSelectionListener(handler);

        // JScrollPane
        JScrollPane scrollPane = new JScrollPane(list);

        // ADd components to frame
        gamedifficulty.add(label);
        gamedifficulty.add(scrollPane);

    }
    private class EventHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {

        }
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel rootPanel;
    private JButton kastButton;
    private JLabel score1Label;
    private JLabel score2Label;
    private JLabel turLabel;
    private JLabel beskedLabel;
    private JLabel kastSumLabel;

    public GUI() {





        kastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turLabel.setText("Spiller " + "1" + " har lige kastet sine terninger!");
            }
        });


        JFrame frame = new JFrame("GUI");
        //frame.setContentPane(new GUI().rootPanel);
        frame.add(rootPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
//        JFrame frame = new JFrame("GUI");
//        frame.setContentPane(new GUI().rootPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);
        new GUI();
    }
}



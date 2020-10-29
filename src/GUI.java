import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel rootPanel;

    private JButton p1Button;
    private JLabel score1Label;
    private JLabel score2Label;
    private JLabel turnLabel;
    private JLabel beskedLabel;
    private JLabel kastSumLabel;
    private JButton p2Button;

    ImageIcon goldCoin = new ImageIcon("res/goldCoin.png");

    public GUI() {
        //Opretter spillerne
        spiller p1 = new spiller();
        spiller p2 = new spiller();


/*
TODO:
 - Find vinder... Virker ikke!
 - evt. tilføj gold coin

 */
        //Opretter selve vinduet der popper frem
        JFrame frame = new JFrame("Spil");
        frame.add(rootPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



            p1Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    turnLabel.setText("Spiller 1 har lige kastet sine terninger!");
                    logik.player1(p1);
                    score1Label.setText("Spiller 1 har " + String.valueOf(p1.getkonto()) + " guld"); //sætter spillerens score

                    turnLabel.setText("Spiller 1 har lige kastet sine terninger!");
                    kastSumLabel.setText("Terningerne blev kastet og du endte på felt nr " + logik.kastSum);
                    beskedLabel.setText(felter.besked(logik.kastSum));

                    knapSkiftP1();
                    endgame(p1.getkonto(), p2.getkonto());
                }
            });

            p2Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    turnLabel.setText("Spiller 2 har lige kastet sine terninger!");
                    logik.player2(p2);
                    score2Label.setText("Spiller 2 har " + String.valueOf(p2.getkonto()) + " guld"); //sætter spillerens score

                    turnLabel.setText("Spiller 2 har lige kastet sine terninger!");
                    kastSumLabel.setText("Terningerne blev kastet og du endte på felt nr " + logik.kastSum);
                    beskedLabel.setText(felter.besked(logik.kastSum));

                    knapSkiftP2();
                    endgame(p1.getkonto(), p2.getkonto());
                }
            });
    }



    // Skifter bare farven på knappen samt dens label når man trykker på den.
    String green = "#00b894";
    String red = "#ff7675";
    public void knapSkiftP1(){
        p1Button.setBackground(Color.decode(red));
        p2Button.setBackground(Color.decode(green));
        p1Button.setText("Spiller 1 har lige kastet");
        p2Button.setText("Spiller 2 er klar til at kaste");
        p1Button.setEnabled(false);
        p2Button.setEnabled(true);
    }
    public void knapSkiftP2(){
        p2Button.setBackground(Color.decode(red));
        p1Button.setBackground(Color.decode(green));
        p2Button.setText("Spiller 2 har lige kastet");
        p1Button.setText("Spiller 1 er klar til at kaste");
        p1Button.setEnabled(true);
        p2Button.setEnabled(false);
    }

    //Finder en vinder
    public void endgame(int p1, int p2) {
        if (p1 >= logik.maxScore) {
            turnLabel.setText("Tillykke! Spiller 1 har vundet spillet!");
            kastSumLabel.setText("Spiller 1 fik hele " + p1 + " guld!");
            beskedLabel.setText("Spiller 2 fik kun " + p2 + " guld...");
            p1Button.setEnabled(false);
            p2Button.setEnabled(false);
            p1Button.setBackground(Color.WHITE);
            p2Button.setBackground(Color.WHITE);
            rootPanel.setBackground(Color.decode("#55efc4"));
        } else if (p2 >= logik.maxScore) {
            turnLabel.setText("Tillykke! Spiller 2 har vundet spillet!");
            kastSumLabel.setText("Spiller 2 fik hele " + p2 + " guld!");
            beskedLabel.setText("Spiller 1 fik kun " + p1 + " guld...");
            p1Button.setEnabled(false);
            p2Button.setEnabled(false);
            p1Button.setBackground(Color.WHITE);
            p2Button.setBackground(Color.WHITE);
            rootPanel.setBackground(Color.decode("#55efc4"));
        }
    }


    public static void main(String[] args) {
        new GUI(); //Kører GUIen. Intet bliver vist hvis denne ikke er her.
    }
}



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

    static int turn = 0;

    public GUI() {
        //Opretter spillerne
        spiller p1 = new spiller();
        spiller p2 = new spiller();


        //Opretter selve vinduet der popper frem
        JFrame frame = new JFrame(language.titel);
        frame.add(rootPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



            p1Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    turn=1;
                    turnLabel.setText(language.player_name + turn+ " " + language.turnLabel);
                    logik.player1(p1);
                    score1Label.setText(language.player_name + turn + " har " + String.valueOf(p1.getkonto()) + language.gold); //sætter spillerens score

                    kastSumLabel.setText(language.kastSumLabel + logik.kastSum);
                    beskedLabel.setText(felter.besked(logik.kastSum));

                    knapSkiftP1();
                    endgame(p1.getkonto(), p2.getkonto());
                }
            });

            p2Button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    turn=2;
                    turnLabel.setText(language.player_name + turn + " " + language.turnLabel);
                    logik.player2(p2);
                    score2Label.setText(language.player_name + turn + " har " + String.valueOf(p2.getkonto()) + language.gold); //sætter spillerens score

                    kastSumLabel.setText(language.kastSumLabel + logik.kastSum);
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
        p1Button.setText(language.player_name + "1 "+ language.but1Text);
        p2Button.setText(language.player_name + "2 "+ language.but2Text);
        p1Button.setEnabled(false);
        p2Button.setEnabled(true);
    }
    public void knapSkiftP2(){
        p2Button.setBackground(Color.decode(red));
        p1Button.setBackground(Color.decode(green));
        p2Button.setText(language.player_name + "2 "+ language.but1Text);
        p1Button.setText(language.player_name + "1 "+ language.but2Text);
        p1Button.setEnabled(true);
        p2Button.setEnabled(false);
    }

    //Finder en vinder
    public void endgame(int p1, int p2) {
        if (p1 >= logik.maxScore) {
            turnLabel.setText(language.grats + " 1 " + language.have_won);
            kastSumLabel.setText(language.player_name + " 1 " + language.winnerGot + p1 + language.gold);
            beskedLabel.setText(language.player_name + " 2 " + language.loserGot + p2 + language.gold);
            p1Button.setEnabled(false);
            p2Button.setEnabled(false);
            p1Button.setBackground(Color.WHITE);
            p2Button.setBackground(Color.WHITE);
            p1Button.setText(" ");
            p2Button.setText(" ");
            rootPanel.setBackground(Color.decode("#55efc4"));
        } else if (p2 >= logik.maxScore) {
            turnLabel.setText(language.grats + " 2 " + language.have_won);
            kastSumLabel.setText(language.player_name + " 2 " + language.winnerGot + p1 + language.gold);
            beskedLabel.setText(language.player_name + " 1 " + language.loserGot + p2 + language.gold);
            p1Button.setEnabled(false);
            p2Button.setEnabled(false);
            p1Button.setBackground(Color.WHITE);
            p2Button.setBackground(Color.WHITE);
            p1Button.setText(" ");
            p2Button.setText(" ");
            rootPanel.setBackground(Color.decode("#55efc4"));
        }
    }


    public static void main(String[] args) {
        new GUI(); //Kører GUIen. Intet bliver vist hvis denne ikke er her.
    }
}



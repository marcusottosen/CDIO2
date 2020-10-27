import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class logik {
    static int kastSum;


    public static void player1(spiller p1){
        logik.kast();
        p1.setKonto(felter.setFelt(logik.kastSum));
    }

    public static void player2(spiller p2){
        logik.kast();
        p2.setKonto(felter.setFelt(logik.kastSum));
    }


    //Kaster terningerne og finder summen af de to terninger
    public static void kast(){
        dice d1 = new dice();
        dice d2 = new dice();

        d1.roll();
        d2.roll();

        kastSum = d1.getFaceValue()+d2.getFaceValue();
    }


    public void reset(){}


    //Print ved hvert slag
    static JFrame f = new JFrame();
    public static void print(String turLabel){
        //f.turnLabel.setText("Tillykke! Spiller 1 har vundet spillet!");



//        int spiller;
//        if (turn){ spiller = 1;}
//        else {spiller = 2;}
//
//        System.out.println("\n");
//        System.out.println("Spiller " + spiller + " kaster to terninger og slår: " + kastSum);
//        System.out.println(felter.besked(kastSum)); //Printer besked fundet fra listen i felter.java
//        System.out.println("Du har nu " + konto + " guld på dig!");
    }


    //Finder vinderen
    public static void getWin(int p1, int p2) {
        System.out.println("\n \n \n");
        if (p1 > p2) {
                System.out.println("Spiller 1 vinder kampen med hele " + p1 + " guld på sig!" );
                System.out.println("Spiller 2 havde kun " + p2 + " guld på sig.");
            }
        else {
            System.out.println("Spiller 1 vinder kampen med hele " + p2 + " guld på sig!" );
            System.out.println("Spiller 2 havde kun " + p1 + " guld på sig.");
            }
        }
}




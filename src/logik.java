import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class logik {
    static int kastSum;

    //Værdier
    static int startKonto = 1000;
    static int maxScore = 3000;
    static int terningStr = 6;


    public static void player1(spiller p1){
        kast();
        p1.setKonto(felter.setFelt(logik.kastSum));
    }

    public static void player2(spiller p2){
        kast();
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


    //Print ved hvert slag
    static JFrame f = new JFrame();
    public static void print(String turLabel){
    }





}




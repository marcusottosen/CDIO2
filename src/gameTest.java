import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class gameTest {
    //Værdier:
    static int startKonto = 1000;
    static int maxScore = 3000;
    static int terningStr = 6;

    public static void main(String[] args) {
        //Oprettelse af spillere
        spiller p1 = new spiller();
        spiller p2 = new spiller();

        //Spillernes tur
        boolean turn = true;


        while (p1.getkonto() <= maxScore && p2.getkonto() <= maxScore) {
            Scanner input = new Scanner(System.in);

            //Spiller 1 tur
            while (turn) {
                String x;
                System.out.println("Skriv et bogstav eller tal og tryk enter for at tage din tur: ");
                x = input.next();
                logik.kast();  //Kaster terningerne
                p1.setKonto(felter.setFelt(logik.testSum));   // spillerens konto +- med feltets sum ud fra kastet terninger.
                logik.print(turn, p1.getkonto());

                if(logik.kastSum==10){//ekstra tur hvis man slår 10
                    System.out.println("Du fik til gengæld en ekstra tur!");
                }
                else { turn=!turn;}
            }

            //Spiller 2 tur
            while (!turn) {
                String x;
                System.out.println("Skriv et bogstav eller tal og tryk enter for at tage din tur: ");
                x = input.next();
                logik.kast();  //Kaster terningerne
                p2.setKonto(felter.setFelt(logik.kastSum));   // spillerens konto +- med feltets sum ud fra kastet terninger.
                logik.print(turn, p2.getkonto());

                if(logik.kastSum==10){//ekstra tur hvis man slår 10
                    System.out.println("Du fik til gengæld en ekstra tur!");
                }
                else { turn=!turn;}
            }
        }
        logik.getWin(p1.getkonto(), p2.getkonto()); //Finder videren og printer besked


        //Her bruges der:
        //kast()
        //setKonto()
        //setFelt()
        //print()
        //getWin
    }

}
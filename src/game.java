import java.util.Scanner;

public class game {
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

        int antalSlag = 0;
        while (p1.getkonto() <= maxScore && p2.getkonto() <= maxScore) {
            Scanner input = new Scanner(System.in);

            //Spiller 1 tur
            while (turn) {
                String x;

                System.out.println(language.begin_turn);
                x = input.next();
                logik.kast();  //Kaster terningerne
                p1.setKonto(felter.setFelt(logik.kastSum));   // spillerens konto +- med feltets sum ud fra kastet terninger.
                logik.print(turn, p1.getkonto());

                antalSlag++;
                if(logik.kastSum==10){//ekstra tur hvis man slår 10
                    System.out.println(language.extra_turn);
                }
                else { turn=!turn;}
            }

            //Spiller 2 tur
            while (!turn) {
                String x;
                System.out.println(language.begin_turn);
                x = input.next();
                logik.kast();  //Kaster terningerne
                p2.setKonto(felter.setFelt(logik.kastSum));   // spillerens konto +- med feltets sum ud fra kastet terninger.
                logik.print(turn, p2.getkonto());

                if(logik.kastSum==10){//ekstra tur hvis man slår 10
                    System.out.println(language.extra_turn);
                }
                else { turn=!turn;}
            }
        }
        logik.getWin(p1.getkonto(), p2.getkonto(), antalSlag); //Finder videren og printer besked


        //Her bruges der:
        //kast()
        //setKonto()
        //setFelt()
        //print()
        //getWin
    }

    static class gameTest {

    }
}
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class gameTest {
    //Værdier:
    static int startKonto = 1000;
    static int maxScore = 3000;
    static int terningStr = 6;

    public static void main() {
        //Oprettelse af spillere
        spiller p1 = new spiller();
        spiller p2 = new spiller();

        //Spillernes tur
        boolean turn = true;

        int antalSlag = 0;
        while (p1.getkonto() <= maxScore && p2.getkonto() <= maxScore) {


            //Spiller 1 tur
            while (turn) {


                logik.kast();  //Kaster terningerne
                p1.setKonto(felter.setFelt(logik.kastSum));   // spillerens konto +- med feltets sum ud fra kastet terninger.


                antalSlag = antalSlag++;
                if(logik.kastSum==10){//ekstra tur hvis man slår 10

                }
                else { turn=!turn;}
            }

            //Spiller 2 tur
            while (!turn) {



                logik.kast();  //Kaster terningerne
                p2.setKonto(felter.setFelt(logik.kastSum));   // spillerens konto +- med feltets sum ud fra kastet terninger.


                if(logik.kastSum==10){//ekstra tur hvis man slår 10

                }
                else { turn=!turn;}
            }
        }

        if (p1.getkonto() > p2.getkonto()) {
            gameTestRun.p1Sejr++;
        }
        else {
            gameTestRun.p2Sejr++;
        }
    }


        //Her bruges der:
        //kast()
        //setKonto()
        //setFelt()
        //print()
        //getWin
    }

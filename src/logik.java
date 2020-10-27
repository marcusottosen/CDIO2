public class logik{
    static int kastSum, testSum;


    public static void play(){
    }


    //Kaster terningerne og finder summen af de to terninger
    public static void kast(){
        dice d1 = new dice();
        dice d2 = new dice();

        d1.roll();
        d2.roll();

        kastSum = d1.getFaceValue()+d2.getFaceValue();

        testSum = 3;

    }


    public void reset(){}


    //Print ved hvert slag
    static int spiller;
    public static void print(boolean turn, int konto){
        if (turn){ spiller = 1;}
        else {spiller = 2;}

        System.out.println("\n");
        System.out.println("Spiller " + spiller + " kaster to terninger og slår: " + kastSum);
        System.out.println(felter.besked(kastSum)); //Printer besked fundet fra listen i felter.java
        System.out.println("Du har nu " + konto + " guld på dig!");
    }


    //Finder vinderen
    public static void getWin(int p1, int p2, int antalSlag) {
        System.out.println("\n \n \n");
        if (p1 > p2) {
                System.out.println("Spiller 1 vinder kampen med hele " + p1 + " guld på sig! De brugte " + antalSlag + " slag");
                System.out.println("Spiller 2 havde kun " + p2 + " guld på sig.");
            }
        else {
            System.out.println("Spiller 2 vinder kampen med hele " + p2 + " guld på sig! De brugte " + antalSlag + " slag" );
            System.out.println("Spiller 1 havde kun " + p1 + " guld på sig.");
            }
        }
}




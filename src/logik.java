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

        System.out.println("\n" + language.player_name +" "+ spiller +" "+ language.roll_result +" "+ kastSum);
        System.out.println(felter.besked(kastSum)); //Printer besked fundet fra listen i felter.java
        System.out.println(language.gold_balance +" "+ konto + "\n");
    }


    //Finder vinderen
    public static void getWin(int p1, int p2, int antalSlag) {
        System.out.println("\n \n \n");
        if (p1 > p2) {
                System.out.println(language.player_name +" 1 "+ language.win_message +" "+ p1);
                System.out.println(language.roll_number +" "+ antalSlag);
                System.out.println(language.player_name +" 2 "+ language.losers_balance +" "+ p2);
            }
        else {
            System.out.println(language.player_name +" 2 "+ language.win_message +" "+ p2);
            System.out.println(language.roll_number +" "+ antalSlag);
            System.out.println(language.player_name +" 1 "+ language.losers_balance +" "+ p1);
            }
        }
}




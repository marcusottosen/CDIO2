//import static org.junit.jupiter.api.Assertions.*;

class gameTestRun {
    static int p1Sejr, p2Sejr;




    //Test for at undersøge sandsynligheden for at hver spiller vinder
    public static void main(String[] args) {
        gameTest test = new gameTest();

        for (int i = 0; i < 100000; i++) {
            test.main();

        }
        System.out.println("Spiller 1 vandt: " + p1Sejr + " gange og spiller 2 vandt: " + p2Sejr + "gange");
    }
}
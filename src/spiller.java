
public class spiller {
    private int konto;

    //Konstruktør
    public spiller() {
        konto = game.startKonto;
    }

    public int getkonto() {
        return konto;
    }

    public void setKonto(int a) {
        konto = konto + a;
    }
}
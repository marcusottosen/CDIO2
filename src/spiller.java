
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
        if (konto + a < 0)
            konto = 0;
        else
        konto = konto + a;
    }
}
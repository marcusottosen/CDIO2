class gameTestBalanceRun {
    public static void main(String[] args) {
        spiller player = new spiller();

        System.out.println("Spillers startsaldo: " + player.getkonto());

        player.setKonto(-750);
        System.out.println("Trækkes 750 fra spillers saldo: " + player.getkonto());

        player.setKonto(-750);
        System.out.println("Trækkes yderligere 750 fra saldoen " + player.getkonto());
    }
}

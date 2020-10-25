public class felter {
    static int[] felter = {0, 0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

    static String[] beskeder = {
            "","",
            "Du brød ind i et forladt tårn og fandt 250 guld!",
            "Crater",
            "Palace gates",
            "Cold Desert",
            "Walled city",
            "Monastery",
            "Black cave",
            "Huts in the mountain",
            "The Werewall",
            "The pit",
            "Goldmine"
    };

    //Returnerer værdien af det felt man har ramt
    public static int setFelt(int feltRamt) {
    return felter[feltRamt];
}

    //Returnerer beskeden tilhørende til feltet
    public static String besked(int nr){
        return beskeder[nr];
    }
}
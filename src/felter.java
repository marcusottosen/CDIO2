public class felter {
    static int[] felter = {0, 0, 250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

    static String[] beskeder = {
            "","",
            "Tower - Du brød ind i et forladt tårn og fandt 250 guld!",
            "Crater - Du bliver skræmt af noget nede i krateret og taber 100 guld!",
            "Palace gates - Du stopper foran portene til et palads hvor der bliver givet 100 guld ud til forbipasserende!",
            "Cold Desert - For at overleve natten køber du et tæppe til 20 guld!",
            "Walled city - Du kommer ind bag bymurene, hvor du sælger råvarer du har fået samlet til 180 guld!",
            "Monastery - Klostret påvirker ikke din guldbeholdning",
            "Black cave - Du skal ned i en mørk gråtte, men mangler en fakkel. Den koster 70 guld!",
            "Huts in the mountain -Du kommer forbi hytterne i bjergene. Du hjælper landsbyboere og får 60 guld!",
            "The Werewall - Du betaler 80 guld for at se Varulvvæggen",
            "The pit - Du hopper over et hul på din vej, men taber desværre 50 guld!",
            "Goldmine - Du fandt en guldmine fyldt med guld. Nok til 650 guldmønter!"
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
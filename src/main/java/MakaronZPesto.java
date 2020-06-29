import java.net.URL;

/**
 * Klasa makaronu z pesto. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class MakaronZPesto extends Przepis {
    String tytul = "Makaron z pesto";
    URL sciezkaGrafiki = MakaronZPesto.class.getResource("grafiki/makaron_z_pesto.jpg");
    String czasWykonania = "Czas wykonania: 25 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "300g makaronu<br>" +
            "1 doniczka bazylii<br>" +
            "1 mały ząbek czosnku<br>" +
            "1 łyżeczka soku z cytryny<br>" +
            "80ml oliwy z oliwek<br>" +
            "30g orzeszków piniowych<br>" +
            "20g tartego parmezanu<br>" +
            "sól<br>" +
            "pieprz";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Rozgrzej patelnię, wrzuć na nią orzeszki piniowe i podpraż je przez kilka minut, aż delikatnie " +
            "się zarumienią.<br>" +
            "2) Przełóż orzeszki do wysokiego naczynia, dodaj do nich oliwę z oliwek, bazylię, parmezan, czosnek, " +
            "sok z cytryny oraz odrobinę soli i pieprzu.<br>" +
            "3) Za pomocą blendera zmiksuj całość na gładki sos, dopraw do smaku. Jeśli sos jest za gęsty – " +
            "dodaj więcej oliwy, jeżeli za rzadki – dodaj bazylię lub parmezan.<br>" +
            "4) Makaron ugotuj al dente. Wymieszaj z sosem i podawaj.";

    protected String getTytul() { return tytul; }
    protected URL getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

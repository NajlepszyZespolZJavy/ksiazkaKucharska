import java.net.URL;

/**
 * Klasa spaghetti. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class Spaghetti extends Przepis {

    String tytul = "Spaghetti";
    URL sciezkaGrafiki = Spaghetti.class.getResource("grafiki/spaghetti.jpg");
    String czasWykonania = "Czas wykonania: 45 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "300 mlpassaty pomidorowej <br>" +
            "300 gmielonej wołowiny <br>" +
            "300 gmakaronu spaghetti <br>" +
            "30 gtartego parmezanu <br>" +
            "1 łyżka koncentratu pomidorowego <br>" +
            "1 ząbek czosnku <br>" +
            "1 mała cebula <br>" +
            "0.5 łyżeczki suszonego tymianku <br>" +
            "0.5 łyżeczki suszonego oregano";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Na głębokiej patelni rozgrzej około 2 łyżki oliwy z oliwek. <br>" +
            "2) Na rozgrzaną patelnię wrzuć czosnek i cebulę, a po chwili dodaj mięso, rozdrabniaj je np. widelcem," +
            " tak aby nie powstały grube mięsne grudki. <br>" +
            "3) Do mięsa dodaj zioła oraz koncentrat. Całość podgrzewaj przez chwilę, dodaj passatę " +
            "(przecier pomidorowy), gotuj na małym ogniu około 30 minut. <br>" +
            "4) Makaron ugotuj al dente, podawaj go z sosem, serem, i bazylią.";

    protected String getTytul() { return tytul; }
    protected URL getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

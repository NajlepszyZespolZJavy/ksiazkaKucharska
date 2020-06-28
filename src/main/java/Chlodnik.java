/**
 * Klasa chłodniku. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class Chlodnik extends Przepis {

    String tytul = "Chłodnik";
    String sciezkaGrafiki = "src/main/java/grafiki/chlodnik.jpg";
    String czasWykonania = "Czas wykonania: 30 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "2 mniejsze ogórki gruntowe<br>" +
            "4 rzodkiewki<br>" +
            "2 liście sałaty<br>" +
            "3 łyżki posiekanego szczypiorku<br>" +
            "2 łyżki posiekanego koperku<br>" +
            "1 mały ząbek czosnku<br>" +
            "500 ml kefiru (schłodzony)<br>" +
            "sól i pieprz";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Warzywa umyć i osuszyć.<br>" +
            "2) Ogórki obrać ze skórki i zetrzeć na tarce o większych oczkach. Rzodkiewki tak samo zetrzeć. Włożyć do miski.<br>" +
            "3) Dodać drobo poszatkowane liście sałaty, szczypiorek, koperek oraz obrany i przeciśnięty przez praskę lub drobno starty czosnek.<br>" +
            "4) Dodać kefir, doprawić solą oraz pieprzem i wymieszać.<br>" +
            "5) Schłodzić w lodówce.";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

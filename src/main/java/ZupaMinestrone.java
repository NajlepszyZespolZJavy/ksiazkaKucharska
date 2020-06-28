/**
 * Klasa ZupaMinestrone. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class ZupaMinestrone extends Przepis {

    String tytul = "Zupa Minestrone";
    String sciezkaGrafiki = "src/main/java/grafiki/ZupaMinestrone.jpg";
    String czasWykonania = "Czas wykonania: 45 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "80 g cebuli<br>" +
            "120 g pora, pokrojonego na kawałki<br>" +
            "40 g oliwy z oliwek<br>" +
            "600 g warzyw, mieszanych<br>" +
            "1000 g wody<br>" +
            "2 łyżeczki koncentratu bulionu warzywnego<br>" +
            "1 łyżeczka soli<br>" +
            "120 g makaronu";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Do naczynia miksującego włożyć cebulę i por, rozdrobić.<br>" +
            "2) Dodać oliwę, dusić 5 min.<br>." +
            "3) Dodać mieszane warzywa, rozdrbnić.<br>" +
            "4) Dodać wodę i koncentrat bulionu, gotować 15 min.<br>" +
            "5) Dodać sól i makaron, gotować zgodnie z czasem podanym na opakowaniu.";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}


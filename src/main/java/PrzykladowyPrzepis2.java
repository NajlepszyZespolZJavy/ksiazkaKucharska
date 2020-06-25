/**
 * Klasa przykladowego przepisu. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class PrzykladowyPrzepis2 extends Przepis {

    String tytul = "Nazwa drugiego przepisu";
    String sciezkaGrafiki = "src\\main\\java\\grafiki\\przepis2.jpg";
    String czasWykonania = "Czas wykonania: y godziny";
    String trudnoscWykonania = "Trudność wykonania: y";
    String skladniki = "<html>Składniki:<br>" +
            "250g masła<br>" +
            "200ml wody<br>" +
            "8 jajek<br>" +
            "1l mleka<br>" +
            "2 żółtka<br>" +
            "coś jeszcze<br>" +
            "coś jeszcze<br>" +
            "coś jeszcze";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) <br>" +
            "2) <br>" +
            "3) <br>" +
            "4) <br>" +
            "5) <br>" +
            "6) <br>" +
            "7)";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

public class PrzykladowyPrzepis extends Przepis {

    String tytul = "Nazwa przepisu";
    String sciezkaGrafiki = "src\\main\\java\\grafiki\\przepis.jpg";
    String czasWykonania = "Czas wykonania: x godziny";
    String trudnoscWykonania = "Trudność wykonania: x";
    String skladniki = "<html>Składniki:<br>" +
            "300g czegoś<br>" +
            "250ml wody<br>" +
            "13 jajek<br>" +
            "0,5l mleka<br>" +
            "2 żółtka<br>" +
            "jeszcze coś<br>" +
            "jeszcze coś<br>" +
            "jeszcze coś";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) <br>" +
            "2) <br>" +
            "3) <br>" +
            "4) <br>" +
            "5) <br>" +
            "6) <br>" +
            "7) <br>" +
            "8) <br>" +
            "9) <br>" +
            "10)";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

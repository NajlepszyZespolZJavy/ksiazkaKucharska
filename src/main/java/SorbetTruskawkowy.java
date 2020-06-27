/**
 * Klasa Lasagne. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class SorbetTruskawkowy extends Przepis {

    String tytul = "Sorbet Truskawkowy";
    String sciezkaGrafiki = "src\\main\\java\\grafiki\\SorbetTruskawkowy.jpg";
    String czasWykonania = "Czas wykonania: 10 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "60 g cukru<br>" +
            "450-500 g truskawek, mrożonych<br>" +
            "1 banan, świeży";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Do naczynia wsypać cukier, rozdrobnić.<br>" +
            "2) Dodać truskawki, rozdrobić<br>." +
            "3) Dodać banana, wymieszać<br>" +
            "4) Podawać bezpośrednio po przygotowaniu";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}


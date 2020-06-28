/**
 * Klasa Croque Madame. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class CroqueMadame extends Przepis {

    String tytul = "Croque Madame";
    String sciezkaGrafiki = "src\\main\\java\\grafiki\\CroqueMadame.jpg";
    String czasWykonania = "Czas wykonania: 15 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwe";
    String skladniki = "<html>Składniki:<br>" +
            "4 tosty<br>" +
            "60g tartego sera żółtego<br>" +
            "2 plasterki szynki<br>" +
            "3 jajka<br>" +
            "5 łyżek mleka<br>" +
            "(klarowane) masło do smażenia";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Rozłożyć tosty na desce, na każdym ułożyć tarty ser. Na dwóch tostach położyć plasterek szynki. Podtrzymując szynkę palcami odwrócić tosty z szynką i ułożyć na tostach z samym serem. Lekko docisnąć.<br>" +
            "2) W głębokim talerzu roztrzepać widelcem 1 jajko z dodatkiem mleka oraz szczypty soli. Maczać w tym tosty i kłaść na patelnię z podgrzanym masłem (najlepiej klarowanym).<br>" +
            "3) Smażyć na umiarkowanym ogniu z dwóch stron na złoty kolor,<br>" +
            "po ok. 1,5 minuty z każdej strony. Oddzielnie usmażyć 2 jajka sadzone. Tosty przełożyć na talerze i przykryć jajkiem sadzonym.";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

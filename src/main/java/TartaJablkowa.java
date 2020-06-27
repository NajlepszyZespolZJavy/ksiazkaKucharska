/**
 * Klasa Lasagne. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class TartaJablkowa extends Przepis {

    String tytul = "Tarta Jablkowa";
    String sciezkaGrafiki = "src\\main\\java\\grafiki\\TartaJablkowa.jpg";
    String czasWykonania = "Czas wykonania: 60 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "75 g masła<br>" +
            "150 g mąki pszennej<br>" +
            "szczypta soli<br>" +
            "łyżeczka cukru waniliowego<br>" +
            "50 g wody<br>" +
            "900-1000 g jabłek<br>" +
            "30 g cukru<br>" +
            "10 g masła";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Rozgrzać piekarnik do temp. 200 stopni. Formę do tarty natłuścić i oprószyć mąką, odstawić.<br>" +
            "2) Do naczynia miksująceo włożyć masło, mąkę, sól, cukier waniliowy i wodę, wymieszać a następnie wyrobić.<br>." +
            "3) Ciasto przełożyć na oprószony mąką blat i rozwałkować. Ciastem wyłożyć przygotowaną formę do tarty.<br>" +
            "4) Obrać jabłka, pokroić w ćwiartki i usunąć gniazda nasienne. Pokroić ćwiartki w plasterki i ułożyć<br>" +
            "   na wierzch ciasta, tworząc wzór rozety. Na wierzchu ułożyć małe kawałki masła. Piec 30-35 min. lub do <br>" +
            "   momentu, aż jabłka nabiorą złotego koloru. Podawać na ciepło.";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}


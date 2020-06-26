/**
 * Klasa szarlotka. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */

public class Szarlotka extends Przepis {

        String tytul = "Szarlotka";
        String sciezkaGrafiki = "src\\main\\java\\grafiki\\szarlotka.jpg";
        String czasWykonania = "Czas wykonania: 90 minut";
        String trudnoscWykonania = "Trudność wykonania: średnia";
        String skladniki = "<html>Składniki:<br>" +
                "1kg jabłek<br>" +
                "2 szklanki mąki pszennej<br>" +
                "200 g masła<br>" +
                "1 jajko<br>" +
                "80 g cukru<br>" +
                "2 łyżeczki proszku do pieczenia";
        String instrukcje = "<html>Instrukcje:<br>" +
                "1) Do przesianej mąki dodać pokrojone zimne masło, proszek do pieczenia, cukier.<br>" +
                "2) Rozdrabniać składniki na kruszonkę, potem dodać jajko i połączyć składniki w jednolite"+
                "i gładkie ciasto, podzielić na 2 części, zawinąć w folię i włożyć do lodówki. <br>" +
                "Jabłka obrać, pokroić na ćwiartki i wyciąć gniazda nasienne. Pokroić na plasterki i włożyć do " +
                "garnka. Dodać cynamon i gotować pod przykryciem przez ok. 10 - 15 minut aż jabłka zmiękną i się " +
                "rozpadną, w międzyczasie od czasu do czasu zamieszać.<br>" +
                "4) Piekarnik nagrzać do 180 stopni C. Przygotować tortownicę o średnicy 26 cm lub prostokątną " +
                "blaszkę ok. 20 x 30 cm.<br>" +
                "5)Wyjąć jedną połówkę ciasta z lodówki, pokroić nożem na plasterki i wylepić nimi spód formy, " +
                "doklejając brakujące miejsca palcami.<br>" +
                "6)Na spód wyłożyć jabłka. Wyjąć drugą część ciasta i zetrzeć na tarce bezpośrednio na jabłka " +
                "(lub pokroić ciasto na plasterki i ułożyć na wierzchu).<br>" +
                "7)Wstawić do piekarnika i piec przez ok. 40 - 45 minut lub na złoty kolor. Posypać cukrem pudrem." +
                " Pokroić po ostudzeniu.";


        protected String getTytul() { return tytul; }
        protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
        protected String getCzasWykonania() { return czasWykonania; }
        protected String getTrudnoscWykonania() { return trudnoscWykonania; }
        protected String getSkladniki() { return skladniki; }
        protected String getInstrukcje() { return instrukcje; }
    }

/**
 * Klasa churros. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class Churros extends Przepis {

    String tytul = "Churros";
    String sciezkaGrafiki = "src/main/java/grafiki/churros.jpg";
    String czasWykonania = "Czas wykonania: 30 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "250ml mleka&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;50g masła<br>" +
            "1 łyżka cukru wanilinowego&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;2 łyżki cukru<br>" +
            "szczypta soli&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;190g mąki<br>" +
            "4 jajka<br>" +
            "<br>Oraz:<br>" +
            "do smażenia: olej lub smalec (500g)<br>" +
            "do posypania: cukier puder wymieszany z cynamonem";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Mleko zagotować z masłem, cukrem wanilinowym, cukrem i solą. Dodać mąkę, zmniejszyć ogień i mieszać (ucierać) drewnianą łyżką<br>" +
            "przez ok. 2 minuty, aż powstanie gładka, sprężysta i odchodząca od brzegów garnka masa.<br>" +
            "2) Przełożyć do miski i ostudzić. Wbijać po jednym jajku i miksować mikserem do połączenia się składników w gładkie, jednolite ciasto.<br>" +
            "3) Przełożyć je do rękawa cukierniczego. Rozgrzać tłuszcz w garnku<br>" +
            "(ok. 180 stopni C), zmniejszyć ogień aby temp. za bardzo nie rosła. Wyciskać ok. 8 - 10 cm kawałki ciasta bezpośrednio do tłuszczu. Końce odcinać nożyczkami lub nożem.<br>" +
            "4) Smażyć po około 2 minuty z każdej strony na złoty kolor, wyławiać łyżką cedzakową i odkładać na talerz wyłożony ręcznikami papierowymi. Po przestudzeniu posypać cukrem pudrem z cynamonem.";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

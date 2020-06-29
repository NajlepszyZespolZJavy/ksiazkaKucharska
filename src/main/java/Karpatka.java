import java.net.URL;

/**
 * Klasa karpatki. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class Karpatka extends Przepis {

    String tytul = "Karpatka";
    URL sciezkaGrafiki = Karpatka.class.getResource("grafiki/karpatka.jpg");
    String czasWykonania = "Czas wykonania: 2 godziny";
    String trudnoscWykonania = "Trudność wykonania: średnia";
    String skladniki = "<html>Składniki:<br>" +
            "Ciasto:&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp&nbsp;&nbsp;&nbsp;Masa:<br>" +
            "1 szklanka wody&emsp;&emsp;&emsp;&emsp;&emsp;&emsp&emsp;&emsp;3 szklanki mleka<br>" +
            "150g masła&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;300g masła<br>" +
            "1 szklanka mąki&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;3/4 szklanki cukru<br>" +
            "5 jajek&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;2 łyżeczki cukru<br>" +
            "szczypta soli&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;80g mąki pszennej<br>" +
            "szczypta prosztu do pieczenia&emsp;&emsp;&nbsp;&nbsp;&nbsp;&nbsp;80g mąki ziemiaczanej<br>" +
            "&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;2 żółtka";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Przygotować ciasto. Wodę zagotować z margaryną. Garnek ściągnąć z pieca i mieszając energicznie " +
            "(najlepiej łyżką drewnianą), dodać mąkę. Garnek postawić z powrotem na piecu i gotować na małym ogniu, " +
            "ciągle mieszając, ok. 2- 3 minut. (Ciasto ma być jednolite i ładnie odchodzić od garnka). Ciasto " +
            "pozostawić na chwilę do ostygnięcia. (Najłatwiej przełożyć do miski lub innego garnka, wtedy szybciej " +
            "ostygnie, ale nie musi całkowicie). Do lekko ciepłego lub zimnego ciasta, miksując mikserem, dodać po " +
            "jednym jajku, szczyptę soli i proszek do pieczenia<br>" +
            "2) Ciasto podzielić na 2 części.<br>" +
            "3) Formę prostokątną o wymiarach ok. 35x 24cm wysmarować margaryną i posypać mąką. Połowę ciasta " +
            "rozprowadzić łyżką w formie.<br>" +
            "4) Piec w nagrzanym piekarniku, na złoty kolor, ok. 30 minut w temperaturze 180°C. W ten sam sposób " +
            "upiec drugą połowę ciasta.<br>" +
            "5) Przygotować masę budyniową. 2 szklanki mleka i cukier zagotować. Pozostałe mleko wymieszać dokładnie " +
            "z żółtkami, cukrem waniliowym i mąkami. Dodać do gotującego się mleka, szybko mieszając, aby nie " +
            "powstały grudki. Chwilkę gotować, ok. 1 minuty. (Budyń będzie gęsty). Pozostawić do ostygnięcia. " +
            "Miękkie masło utrzeć mikserem na puszystą masę. Dalej miksując, dodawać stopniowo chłodny budyń.<br>" +
            "6) Masę rozsmarować na jednym blacie ciasta. Przykryć drugim blatem. Ciasto wstawić do lodówki, na co " +
            "najmniej 3 godziny.<br>" +
            "7) Gotowe posypać cukrem pudrem.";

    protected String getTytul() { return tytul; }
    protected URL getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

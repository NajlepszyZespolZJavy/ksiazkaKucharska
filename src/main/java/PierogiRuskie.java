/**
 * Klasa PierogiRuskie. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class PierogiRuskie extends Przepis {

        String tytul = "Pierogi Ruskie";
        String sciezkaGrafiki = "src\\main\\java\\grafiki\\pierogiRuskie.jpg";
        String czasWykonania = "Czas wykonania: 60 minut";
        String trudnoscWykonania = "Trudność wykonania: średnie";
        String skladniki = "<html>Składniki:<br>" +
                "500 g mąki pszennej <br>" +
                "ok. 300 ml gorącej, przegotowanej wody <br>" +
                "1 płaska łyżka soli <br>" +
                "500 g ziemniaków <br>" +
                "500 g twarogu tłustego <br>" +
                "1 duża cebula <br>" +
                "sól, pieprz <br>" +
                "1 łyżka oleju do smażenia";
        String instrukcje = "<html>Instrukcje:<br>" +
                "1) Przygotować farsz. Ziemniaki obrać i ugotować w osolonej wodzie do miękkości. Jeszcze ciepłe ugnieść " +
                "tłuczkiem do ziemniaków. Pozostawić do całkowitego ostygnięcia. <br>" +
                "2) Ser pokruszyć ręką." +
                "3) Cebulę obrać, pokroić w kostkę i zeszklić na oleju." +
                "4) Cebulę, ziemniaki i twaróg wymieszać. Doprawić solą i pieprzem do smaku. <br>" +
                "5) Przygotować ciasto. Mąkę wsypać do miski. Dodać sól i zamieszać. Wlewać stopniowo gorącą wodę z " +
                "czajnika i zagnieść jednolite, elastyczne, mięciutkie ciasto. Ciasto nie powinno się kleić. <br>" +
                "6) Ciasto podzielić na części. Na posypanym mąką blacie rozwałkować bardzo cienko ciasto. <br>" +
                "7) Z rozwałkowanego ciasta wykrawać kółka np. szklanką. Na środku nałożyć łyżeczką nadzienie, ciasto " +
                "złożyć na pół i skleić dobrze brzegi. Gotowe pierogi układać na desce lub blacie oprószonym mąką i " +
                "przykryć ściereczką, aby nie obsychały. W ten sposób przygotować pierogi z całego ciasta. <br>" +
                "9) Pierogi wrzucać na wrzątek i gotować, na małej mocy palnika, w osolonej wodzie ok. 2 minut od " +
                "wypłynięcia. Po wrzuceniu pierogów do wody, przemieszać delikatnie łyżką drewnianą, aby nie " +
                "przywarły do dna garnka. <br>";


        protected String getTytul() { return tytul; }
        protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
        protected String getCzasWykonania() { return czasWykonania; }
        protected String getTrudnoscWykonania() { return trudnoscWykonania; }
        protected String getSkladniki() { return skladniki; }
        protected String getInstrukcje() { return instrukcje; }
    }
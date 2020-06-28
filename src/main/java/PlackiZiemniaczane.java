/**
 * Klasa placków ziemniacznych. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class PlackiZiemniaczane extends Przepis {

    String tytul = "Placki ziemniaczane";
    String sciezkaGrafiki = "src/main/java/grafiki/placki_ziemniaczane.jpg";
    String czasWykonania = "Czas wykonania: 30 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "0,5kg ziemniaków<br>" +
            "1/2 łyżki stołowej mąki przennej<br>" +
            "1/4 cebuli<br>" +
            "1 jajko<br>" +
            "sól<br>" +
            "olej roślinny<br>";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Ziemniaki obrać i zetrzeć na tarce o małych oczkach bezpośrednio do większej i płaskiej miski." +
            " Zostawić je w misce bez mieszania, miskę delikatnie przechylić i odstawić tak na ok. 5 minut.<br>" +
            "2) W międzyczasie odlewać zbierający się sok, delikatnie przytrzymując ziemniaki, nadal ich nie mieszać." +
            " Na koniec docisnąć dłonią do miski i odlać jeszcze więcej soku. Dodać mąkę, drobno startą cebulę, jajko oraz dwie szczypty soli.<br>" +
            "3) Rozgrzać patelnię, wlać olej. Masę ziemniaczaną wymieszać.<br>" +
            "4) Nakładać porcje masy (1 pełna łyżka) na rozgrzany olej<br> i rozprowadzać ją na dość cienki placek." +
            " Smażyć na średnim ogniu przez ok. 2 - 3 minuty na złoty kolor, przewrócić na drugą stronę i powtórzyć smażenie.<br>" +
            "5) Odkładać na talerz wyłożony ręcznikami papierowymi.<br>" +
            "6) Gotowe! Można doprawić według uznania.<br>";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

/**
 * Klasa naleśników. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class Nalesniki extends Przepis {

    String tytul = "Naleśniki";
    String sciezkaGrafiki = "src/main/java/grafiki/nalesniki.jpg";
    String czasWykonania = "Czas wykonania: 20 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "250ml mąki pszennej<br>" +
            "190ml wody (najlepiej gazowanej)<br>" +
            "2 jajka<br>" +
            "250ml mleka<br>" +
            "szczypta soli<br>" +
            "3 łyżki masła lub oleju roślinnego";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Mąkę wsypać do miski, dodać jajka, mleko, wodę i sól.<br>" +
            "2) Zmiksować na gładkie ciasto.<br>" +
            "3) Dodać roztopione masło lub olej roślinny i razem zmiksować<br>" +
            "(lub wykorzystać tłuszcz do smarowania patelni przed smażeniem<br>każdego naleśnika).<br>" +
            "4) Naleśniki smażyć na dobrze rozgrzanej patelni z cienkim dnem np. naleśnikowej. " +
            "Przewrócić na drugą stronę gdy spód naleśnika będzie już ładnie zrumieniony i ścięty.";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

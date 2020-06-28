/**
 * Klasa puree warzywnego. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class PureeWarzywne extends Przepis {

    String tytul = "Puree warzywne";
    String sciezkaGrafiki = "src/main/java/grafiki/puree_warzywne.jpg";
    String czasWykonania = "Czas wykonania: 25 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "600 g ziemniaków, mącznych, obranych, pokrojonych na kawałki<br>" +
            "400 g warzyw (dyni, marchewki, selera, słodkich ziemniaków, groszku, kalafiora) pokrojonych na kawałki<br>" +
            "1-2 łyżeczki soli<br>" +
            "350 g mleka<br>" +
            "30 g masła<br>" +
            "szczypta gałki muszkatołowej";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Do naczynia miksującego włożyć ziemniaki, warzywa, sól, mleko i masło, gotować 25 min.<br>" +
            "2) Dodać gałkę muszkatołową i zmiksowac na  puree. Podawać na gorąco.";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

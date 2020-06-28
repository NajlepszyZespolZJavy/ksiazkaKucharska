/**
 * Klasa Tatar. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class Tatar extends Przepis {

        String tytul = "Tatar";
        String sciezkaGrafiki = "src\\main\\java\\grafiki\\tatar.jpg";
        String czasWykonania = "Czas wykonania: 25 minut";
        String trudnoscWykonania = "Trudność wykonania: łatwe";
        String skladniki = "<html>Składniki:<br>" +
                "300 g polędwicy wołowej, świeżej, dobrej jakości <br>" +
                "sól i pieprz <br>" +
                "3 żółtka <br>" +
                "2 łyżki wody <br>" +
                "1 łyżka oleju <br>" +
                "sól, pieprz <br>" +
                "2-3 posiekane ogórki kiszone <br>" +
                "pół cebuli <br>" +
                "kapary";
        String instrukcje = "<html>Instrukcje:<br>" +
                "1) Mięso posiekaj lub zmiel w maszynce do mięsa dwukrotnie. <br>" +
                "2) Do mięsa dodaj jedno żółto, olej, odrobinę wody i sól oraz pieprz (do smaku). Wyrób mięso za " +
                "pomocą dłoni a następnie podziel na pół i przełóż na talerze. <br>" +
                "3) Na talerzu uformuj tatar i zrób wgłębienie pośrodku. Dodaj żółtko, a obok tatara połóż bardzo" +
                " drobno posiekaną cebulę oraz ogórki. Całość oprósz świeżo mielonym pieprzem i podawaj z pieczywem " +
                "lub grzankami oraz masłem";


        protected String getTytul() { return tytul; }
        protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
        protected String getCzasWykonania() { return czasWykonania; }
        protected String getTrudnoscWykonania() { return trudnoscWykonania; }
        protected String getSkladniki() { return skladniki; }
        protected String getInstrukcje() { return instrukcje; }
    }

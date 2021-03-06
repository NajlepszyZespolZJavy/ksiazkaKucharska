import java.net.URL;

/**
 * Klasa kurczaka w ziołach. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class KurczakWZiolach extends Przepis {

        String tytul = "Kurczak w ziołach";
        URL sciezkaGrafiki = KurczakWZiolach.class.getResource("grafiki/kurczak_w_ziołach.jpg");
        String czasWykonania = "Czas wykonania: 45 minut";
        String trudnoscWykonania = "Trudność wykonania: łatwa";
        String skladniki = "<html>Składniki:<br>" +
                "1 kurczak <br>" +
                "ok. 2 łyżek posiekanych ziół <br>" +
                "ok. 80g masła <br>" +
                "sól, pieprz <br>";
        String instrukcje = "<html>Instrukcje:<br>" +
                "1) Kurczaka oczyścić, umyć i osuszyć. Skórę lekko oddzielić od mięsa, szczególnie na piersiach i udach.<br>" +
                "2) Masło roztopić. Kolejno wymieszać z ziołami, solą i pieprzem. <br>" +
                "3) Płynnym masłem ziołowym natrzeć mięso kurczaka pod skórą i skórę.  <br>" +
                "4) Kurczaka związać.<br>" +
                "5) Piec w nagrzanym piekarniku około 60 min. w temperaturze 200°C. Kurczaka w czasie pieczenia obracać" +
                " i polewać masłem, które spłynęło do brytfanny.";


        protected String getTytul() { return tytul; }
        protected URL getSciezkaGrafiki() { return sciezkaGrafiki; }
        protected String getCzasWykonania() { return czasWykonania; }
        protected String getTrudnoscWykonania() { return trudnoscWykonania; }
        protected String getSkladniki() { return skladniki; }
        protected String getInstrukcje() { return instrukcje; }
    }

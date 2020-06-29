import java.net.URL;

/**
 * Klasa lasagne. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class Lasagne extends Przepis {

    String tytul = "Lasagne";
    URL sciezkaGrafiki = Lasagne.class.getResource("grafiki/lasagne.jpg");
    String czasWykonania = "Czas wykonania: 150 minut";
    String trudnoscWykonania = "Trudność wykonania: średnia";
    String skladniki = "<html>Składniki:<br>" +
            "100-200 g sera parmezan&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;800 g mięsa mielonego<br>" +
            "200 g warzyw mieszanych&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;40 g oliwy z oliwek<br>" +
            "100 g białego wytrwanego wina&emsp;&emsp;&emsp;&nbsp;&nbsp;300 g przecieru pomidorowego<br>" +
            "1-2 łyżeczki soli do smaku&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;1 łyżeczka czarnego pieprzu<br>" +
            "500 g mleka<br>" +
            "40 g masła<br>" +
            "60g mąki przennej<br>" +
            "1-2 szczypty gałki muszkatołowej<br>" +
            "250 g makaronu typu lasagne";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Parmezam zetrzeć.<br>" +
            "2) Mieszankę warzyw drobno pokoroić, dodać oliwę, dusić przez około 5 min.<br>" +
            "3) Dodać mięso, dusić kolejne 10 min.<br>" +
            "4) Dodać wino, gotować przez około 5 min.<br>" +
            "5) Dodać przecier pomidorowy, sól i pieprz, gotować 20 min. Następnie odstawić i pozostawić pod przykrcyiem." +
            "6) Do naczynia wlać mleko, dodać masło, mąkę, sól, gałkę muszkatołową, gotować 10 min. Tak przygotowany sos należy schłodzić<br>" +
            "7) Rozgrzać piekarnik do temp. 180 stopni. Naczynie do zapiekania natłuścić, odstawić.<br>" +
            "8) Na dno naczynia żaroodpornego nałożyć cienką wartswę sosu bolońskiego. Na sosie ułożyć warstwę makaronu,<br>" +
            "   przykryć kolejną warstwą sosu bolońskigo, posypać parmezanem i polać sosem. Powtarzać do momentu zużycia<br>" +
            "   wszystkich składników. Wierzch posypać serem<br>" +
            "9) Piec 35 min.";

    protected String getTytul() { return tytul; }
    protected URL getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

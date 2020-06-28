/**
 * Klasa żurku. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class Zurek extends Przepis {

    String tytul = "Żurek";
    String sciezkaGrafiki = "src\\main\\java\\grafiki\\Zurek.jpg";
    String czasWykonania = "Czas wykonania: 40 minut";
    String trudnoscWykonania = "Trudność wykonania: x";
    String skladniki = "<html>Składniki:<br>" +
            "250g boczku wędzonego (lub 500 g kości lub żeberek wędzonych)<br>" +
            "2l bulionu (np. rosół lub bulion drobiowy)<br>" +
            "500ml żuru - zakwasu (gotowego, z butelki)<br>" +
            "200ml gęstej śmietany homogenizowanej 18%<br>" +
            "1 łyżka suszonego majeranku<br>" +
            "350g wiejskiej kiełbasy<br>" +
            "<br>Dodatki:<br>" +
            "ugotowane na twardo jajka, zielenina np. świeży majeranek lub natka pietruszki, " +
            "pieczywo lub ziemniaki, tarty chrzan";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) W garnku zagotować bulion z dodatkiem wędzonki.<br>" +
            "2) Przykryć i gotować na małym ogniu przez ok. 30 minut.<br>" +
            "3) Dodać żurek z butelki (wcześniej potrząsnąć butelką w celu przemieszania zawartości) oraz śmietanę i majeranek. Dokładnie wymieszać i na zagotować na małym ogniu.<br>" +
            "4) Doprawić zmielonym pieprzem w razie potrzeby oraz dodać obraną<br>" +
            "z błonki i pokrojoną na kawałki kiełbasę.<br>" +
            "5) Podgrzać i podawać z dodatkami.<br>";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

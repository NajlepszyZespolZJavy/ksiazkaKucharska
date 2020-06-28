/**
 * Klasa kremu dyniowego. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class KremDyniowy extends Przepis {

    String tytul = "Krem dyniowy";
    String sciezkaGrafiki = "src/main/java/grafiki/krem_dyniowy.jpg";
    String czasWykonania = "Czas wykonania: 60 minut";
    String trudnoscWykonania = "Trudność wykonania: łatwa";
    String skladniki = "<html>Składniki:<br>" +
            "1 mała dynia Hokkaido (do 1 kg) <br>" +
            "2 ziemniaki <br>" +
            "2 marchewki <br>" +
            "1 litr bulionu (wcześniej ugotowanego, ewentualnie z kostki rosołowej) <br>" +
            "1 mała cebula <br>" +
            "sok z połowy cytryny <br>" +
            "½ łyżeczki zmielonego imbiru w proszku <br>" +
            "100ml słodkiej śmietany";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Dynię umyć, przekroić na pół, oczyścić z pestek i włókien. Następnie pokroić w kostkę razem ze skórką. <br>" +
            "2) Ziemniaki i marchewki umyć, obrać i pokroić w kostkę. <br>" +
            "3) Cebulę obrać i pokroić w kostkę. <br>" +
            "4) Dynię, ziemniaki, marchewki i cebulę przełożyć do garnka. Zalać bulionem i zagotować." +
            " Następnie zmniejszyć moc palnika i gotować pod przykryciem (zostawiając małą szczelinę), " +
            "aż do miękkości warzyw. <br>" +
            "5) Zupę zmiksować np. blenderem na krem. <br>" +
            "6) Doprawić sokiem z cytryny, imbirem, solą, pieprzem, gałką muszkatołową i szczyptą cukru. <br>" +
            "7) Dodać śmietanę. (Można ją dodać podczas miksowania lub dolać do zupy rozlanej na talerzach).";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

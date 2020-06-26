/**
 * Klasa gulaszu wołowego. Dziedziczy z Przepisu i nadpisuje wszystkie jego metody
 */
public class GulaszWolowy extends Przepis {

    String tytul = "Gulasz wołowy";
    String sciezkaGrafiki = "src\\main\\java\\grafiki\\GluaszWolowy.jpg";
    String czasWykonania = "Czas wykonania: 3 godziny";
    String trudnoscWykonania = "Trudność wykonania: średnia";
    String skladniki = "<html>Składniki:<br>" +
            "1kg wołowiny gulaszowej&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;150g wędzonego boczku<br>" +
            "2 łyżki oleju roślinnego&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;1/2 małego pora<br>" +
            "1/2 cebuli&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;2 ząbki czosnku<br>" +
            "1 łyżeczka papryki słodkiej i 1/3 ostrej&emsp;&emsp;&emsp;&nbsp;&nbsp;&nbsp;1,5 łyżki mąki pszennej<br>" +
            "750ml bulionu wołowego&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;1 mała czerwona papryka<br>" +
            "150g małych pieczarek<br>" +
            "<br>Opcjonalnie:<br>" +
            "85ml czerwonego wina";
    String instrukcje = "<html>Instrukcje:<br>" +
            "1) Mięso pokroić w większą kostkę (ok. 3 - 4 cm). Boczek pokroić w kosteczkę, włożyć do dużego garnka z grubym dnem i co chwilę<br>" +
            "mieszając wytapiać go na małym ogniu przez ok. 3 minuty.<br>" +
            "2) Zwiększyć ogień, wlać olej i stopniowo wkładać po kilka kawałków mięsa. Obsmażyć z każdej strony, w sumie przez ok. 10 minut.<br>" +
            "W międzyczasie doprawić solą oraz pieprzem.<br>" +
            "3) Dodać posiekanego pora, pokrojoną cebulę oraz starty czosnek. Co chwilę mieszając smażyć wszystko przez ok. 5 - 8 minut, pod koniec dodając paprykę w proszku.<br>" +
            "4) Posypać składniki mąką (bezpośrednio przez sitko), wymieszać i smażyć co chwilę mieszając przez ok. 5 minut.<br>" +
            "5) Wlać wino jeśli go używamy a po chwili podgrzany bulion.<br>" +
            "Zagotować, przykryć pokrywą i zmniejszyć ogień. Gotować pod przykryciem na małym ogniu przez ok. 1 i 1/2 godziny. W międzyczasie potrząsać przykrytym garnkiem w celu przemieszania składników i sprawdzenia czy gulasz nie przywiera do dna.<br>" +
            "6) Po podanym czasie dodać do gulaszu pokrojoną paprykę oraz<br>" +
            "pokrojone pieczarki. Wymieszać, przykryć i gotować jeszcze przez 1/2 godziny.<br>";

    protected String getTytul() { return tytul; }
    protected String getSciezkaGrafiki() { return sciezkaGrafiki; }
    protected String getCzasWykonania() { return czasWykonania; }
    protected String getTrudnoscWykonania() { return trudnoscWykonania; }
    protected String getSkladniki() { return skladniki; }
    protected String getInstrukcje() { return instrukcje; }
}

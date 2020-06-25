/**
 * Klasa wirtualna z której dziedziczą poszczególe przepisy i nadpisują jej metody
 */
public abstract class Przepis {

    protected String tytul;
    protected String sciezkaGrafiki;
    protected String czasWykonania;
    protected String trudnoscWykonania;
    protected String skladniki;
    protected String instrukcje;

    protected abstract String getTytul();
    protected abstract String getSciezkaGrafiki();
    protected abstract String getCzasWykonania();
    protected abstract String getTrudnoscWykonania();
    protected abstract String getSkladniki();
    protected abstract String getInstrukcje();
}

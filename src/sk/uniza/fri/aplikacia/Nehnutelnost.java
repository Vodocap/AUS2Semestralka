package sk.uniza.fri.aplikacia;

/**
 * 8. 10. 2024 - 14:38
 *
 * @author matus
 */

public class Nehnutelnost extends UzemnyCelok {
    public Nehnutelnost(int paCislo, String paPopis, GPSData paSirka, GPSData paDlzka) {
        super(paCislo, paPopis, paSirka, paDlzka);
    }

    public String toString () {
        return  ("Nehnutelnosť - cislo (" + super.getCislo() + ") " + "\n"
                + "Popis: " + super.getPopis() + "\n"
                + "Suradnice: " + "(" + (super.getSirka().getDataAtD(0)) + ", " + (super.getSirka().getDataAtD(1)) + ") "
                + "(" + (super.getDlzka().getDataAtD(0)) + ", " + (super.getDlzka().getDataAtD(1)) + ") ") + "\n"
                + super.toStringObjekotv();
    }
}

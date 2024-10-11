package sk.uniza.fri.aplikacia;

import sk.uniza.fri.struktura.IData;

public class GPSData implements IData<Double> {
    private double[] suradnice;
    private char[] smery;
    private int pocetSuradnic;

    public GPSData(int paPocetSuradnic, double[] paSuradnice, char[] paSmery) {
        this.pocetSuradnic = paPocetSuradnic;
        this.suradnice = paSuradnice;
        this.smery = paSmery;
    }
    @Override
    public int compareTo(IData<Double> paData, int dimension) {
        if (paData.getDataAtD(dimension) > this.suradnice[dimension]) {
            //System.out.println(paData.getDataAtD(dimension));
            //System.out.println(this.suradnice[dimension]);
            //System.out.println(-1);
            return -1;
        } else if (paData.getDataAtD(dimension) < this.suradnice[dimension]) {
            //System.out.println(paData.getDataAtD(dimension));
            //System.out.println(this.suradnice[dimension]);
            //System.out.println(1);
            return 1;
        }

        return 0;
    }

    public double getSuradnicaAtD(int dimension) {
        return this.suradnice[dimension];
    }

    @Override
    public Double getDataAtD(int dimension) {
        return this.suradnice[dimension];
    }

    public char getSmerAtD(int dimension) {
        return this.smery[dimension];
    }

    public void printData() {
        System.out.println("Suradnice: ");
        for (double suradnica : this.suradnice) {
            System.out.println(suradnica);
        }
        System.out.println("Smery: ");
        for (char smer : this.smery) {
            System.out.println(smer);
        }
    }
}
package day04;

public class Cember extends Sekil{


    public Cember(double yariCap) {
        super(yariCap);
    }

    @Override
    public String toString() {
        return "YARICAP= " + yariCap +" ALAN= "+ alanHesapla(yariCap)+" CEVRE= "+cevreHesaplama(yariCap);
    }
}

package day04;

public class Kare extends Dikdortgen{
    public Kare(double uzunKenar, double kisaKenar) {
        super(uzunKenar, kisaKenar);
    }

    @Override
    public String toString() {
        return "Kenar= " + uzunKenar +" cevre= "+cevreHesaplama(uzunKenar, kisaKenar);
    }
}

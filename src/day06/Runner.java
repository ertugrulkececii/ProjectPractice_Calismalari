package day06;

public class Runner extends Islemler{

    public static void main(String[] args) {
        System.out.println("******WISEQUARTER MANAVI*****");
        Urun urun1=new Urun("KARPUZ",12);
        Urun urun2=new Urun("KAVUN",20);
        Urun urun3=new Urun("ŞEFTALİ",30);
        Urun urun4=new Urun("FASULYE",50);
        Urun urun5=new Urun("DOMATES",15);
        urunler.put(101,urun1);
        urunler.put(102,urun2);
        urunler.put(103,urun3);
        urunler.put(104,urun4);
        urunler.put(105,urun5);
        Giris giris=new Giris();
        giris.menu();
    }
}

package day04;

import java.util.Scanner;

public class Menu {
    static Scanner scan=new Scanner(System.in);
    static void menu(){
        System.out.println("SECMEK ISTEDIGINIZ GEOMETRIK SEKLI GIRINIZ:\n" +
                "1. CEMBER\n" +
                "2. DIKDORTGEN\n" +
                "3.KARE\n" +
                "4. CIKIS\n" +
                "SECIMINIZ: ");
        int secim=scan.nextInt();
        switch (secim){
            case 1:{
                cemberOlustur();
            } case 2:
                dikdortgenOlustur();
            case 3:
                kareOlustur();
            case 4:
                System.exit(4);
            default:{
                System.out.println("YANLIS DEGER GIRDINIZ...");
                menu();
            }
        }
    }

    private static void kareOlustur() {
        System.out.println("KENARI GIRINIZ: ");
        double kenarUzunlugu=scan.nextDouble();
        Kare kare=new Kare(kenarUzunlugu ,kenarUzunlugu);
        System.out.println(kare);
        menu();
    }

    private static void dikdortgenOlustur() {
        System.out.println("UZUN KENARI GIRINIZ: ");
        double uzunKenar=scan.nextDouble();
        System.out.println("KISA KENARI GIRINIZ: ");
        double kisaKenar= scan.nextDouble();
        Dikdortgen dikdortgen= new Dikdortgen(uzunKenar, kisaKenar);
        System.out.println(dikdortgen);
        menu();
    }

    private static void cemberOlustur() {
        System.out.println("CEMBERIN YARICAPINI GIRINIZ: ");
        double yariCap = scan.nextDouble();
        Cember cember = new Cember(yariCap);
        System.out.println(cember);
        menu();
    }


}

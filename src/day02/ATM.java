package day02;

import java.util.Scanner;

public class ATM {
     /*
    ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.

Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */

    static String KartNo = "123456";
    static String sifre = "1234";
    static Scanner scan = new Scanner(System.in);
    static double bakiye = 50000;

    public static void main(String[] args) {
        giris();
    }

    public static void giris() {
        System.out.print("KART NUMARASI GIRINIZ: ");

        String kKartNo = scan.nextLine().replace(" ", "");
        System.out.println("SIFRENIZI GIRINIZ: ");
        String kSifre = scan.nextLine();
        if (kKartNo.equals(KartNo) && kSifre.equals(sifre)) {
            menu();
        } else {
            System.out.println("HATALI GIRIS YAPTINIZ...");
            giris();
        }


    }

    public static void menu() {
        //Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.

        System.out.print("*****NUTELLA BANK*****\n" +
                "1.BAKIYE SORGULAMA\n" +
                "2.PARA YATIRMA\n" +
                "3.PARA CEKME\n" +
                "4.PARA GONDERME\n" +
                "5.SIFRE DEGISTIRME\n" +
                "6.CIKIS\n" +
                "SECIM:  ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1: {
                bakiyeSorgula();
            }
            case 2: {
                System.out.println("YATIRMAK ISTEDIGINIZ MIKTARI GIRINIZ: ");
                double miktar = scan.nextDouble();
                paraYatirma(miktar);

            }
            case 3: {
                System.out.println("CEKMEK ISTEDIGINIZ MIKTARI GIRINIZ: ");
                //double miktar= scan.nextDouble();
                paraCekme(scan.nextDouble());

            }
            case 4: {
                paraGonderme();
            }
            case 5: {

                sifreDegistirme();

            }
            case 6: {
                System.exit(0);

            }
            default: {
                System.out.println("YANLIS GIRIS YAPTINIZ...");
            }
        }
    }

    public static void sifreDegistirme() {
        //Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,


        int sifreTekrar=3;
        for (int i = 0; i <= sifreTekrar; i++) {
            System.out.println("LUTFEN MEVCUT SIFRENIZI GIRINIZ: ");
            String kSifre = scan.nextLine();
            if (kSifre.equals(sifre)){
                System.out.println("YENI SIFRENIZI GIRINIZ: ");
                sifre= scan.next();
                menu();
            }else {
                System.out.println("SENDE KIMSIN !!!");
            }

        }
        System.out.println("SISTEMDEN ATILDIN");
        giris();

    }

    public static void paraGonderme() {
        /*
        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,

        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
         */
        scan.nextLine();
        System.out.println("PARA GONDERILECEK IBAN I GIRINIZ: ");
        String iban = scan.nextLine().replace(" ", "").toUpperCase();
        if (iban.startsWith("TR") && iban.length() == 26) {
            System.out.println("GONDERILECEK MIKTARI GIRINIZ: ");
            double miktar = scan.nextDouble();
            if (miktar <= bakiye) {
                bakiye -= miktar;
                bakiyeSorgula();
            } else {
                System.out.println("BAKIYENIZ YETERSIZ...");
                menu();
            }
        } else {
            System.out.println("HATALI IBAN GIRDINIZ...");
            menu();
        }

    }

    public static void paraCekme(double yeniMiktar) {

        if (yeniMiktar <= bakiye) {
            bakiye -= yeniMiktar;
            bakiyeSorgula();
        } else {
            System.out.println("BAKIYEDEN BUYUK MIKTAR CEKEMEZSINIZ...\n" + "MIKTAR GIRINIZ: ");
            double yMiktar = scan.nextDouble();
            paraCekme(yeniMiktar);
        }
    }

    public static void paraYatirma(double miktar) {
        bakiye += miktar;
        bakiyeSorgula();
    }

    public static void bakiyeSorgula() {
        System.out.println("BAKIYE: " + bakiye + "$");
        menu();
    }
}

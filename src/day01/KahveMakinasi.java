package day01;

import java.util.Scanner;


/*Basit bir Kahve makinesi oluşturun.
        1. Şart
        3 çeşit kahvemiz olsun.
        Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"

        Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
        Örn:
        Hangi Kahveyi İstersiniz?
        1.Türk kahvesi
        2.Filtre Kahve
        3.Espresso
        2.Şart
        Kahve seçildikten sonra sistem kullanıcıya "Süt eklemek istemisiniz?(Evet veya Hayır olarak cevaplayınız)
        3. Şart
        Süt tercihi yapıldıktan sonra sistem kullanıcıya "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)
        sorusunu sorsun.
        4. Şart
        Şeker tercihini yaptıktan sonra sistem kullanıcıya "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)
        sorusunu sorsun.
        Sonuç
        Siparişlerimizi verdik. Son hali görmek istiyoruz.
        konsola şunu yazdırın örnek :
        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!!

 */
public class KahveMakinasi {
    static int secim = 0;
    static Scanner scan = new Scanner(System.in);
    static String secim1 = "Turk Kahveniz";
    static String secim2 = "Filtre Kahveniz";
    static String secim3 = "Espressonuz";

    public static void main(String[] args) {
        anaMenu();
    }
    public static void anaMenu() {

        System.out.print("Hangi Kahveyi istersiniz?\n" + "1.Turk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n: ");
        secim = scan.nextInt();
        switch (secim) {

            case 1: {

                sutSekerBoy();
                break;
            }
            case 2:

                sutSekerBoy();
                break;

            case 3:

                sutSekerBoy();
                break;
            case 4:
                anaMenu();
                break;
            default:
                System.out.println("Ilk hatali girisiniz ;)\n" +
                        "Lutfen tekrar deneyiniz!!!\n");
                anaMenu();
        }
    }
    public static void sutSekerBoy() {
        String kahveTuru = "";
        if (secim == 1) {
            kahveTuru += secim1;
        } else if (secim == 2) {
            kahveTuru += secim2;
        } else if (secim == 3) {
            kahveTuru += secim3;
        }

        String siparisBilgileri = "";
        System.out.println("Süt eklemek ister misiniz?(Evet veya Hayır olarak cevaplayınız)");
        String methodSecim = scan.next().toLowerCase();

        if (methodSecim.equals("evet")) {
            siparisBilgileri += "sutlu";
        } else if (methodSecim.equals("hayir")) {

            System.out.println("Sade kahveniz hazirlanmakta...");
        } else {
            System.out.println("Beklenmeyen girdi hatasi!!!");
            return;
        }
        System.out.println("Şeker ister misiniz ? (Evet veya hayır cevabını veriniz)");
        String methodSecim2 = scan.next().toLowerCase();
        if (methodSecim2.equals("evet")) {
            siparisBilgileri += " sekerli";
        } else if (methodSecim2.equals("hayir")) {
            System.out.println("Sekersiz kahveniz hazirlanmakta...");
        } else {
            System.out.println("Beklenmeyen girdi hatasi!!!");
            return;
        }
        System.out.println("Hangi boyutta olsun? (Büyük boy =B \n- orta boy =O \n- küçük boy =K,  olarak giriniz.");
        String methodSecim3 = scan.next().toLowerCase();


        if (methodSecim3.equals("b") || methodSecim3.equals("o") || methodSecim3.equals("k")) {
            if (methodSecim3.equals("b")) {
                siparisBilgileri += " buyuk boy";
            } else if (methodSecim3.equals("o")) {
                siparisBilgileri+=" orta boy";
            } else if (methodSecim3.equals("k")) {
                siparisBilgileri+=" kucuk boy";
            }
            System.out.println("kahveniz sectiginiz boyutta hazirlaniyor... Lutfen bekleyiniz...\n*******************************\n");

        } else {
            System.out.println("Hatali giris tekrar girin: ");
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(kahveTuru + " " + siparisBilgileri + " hazirdir. Afiyet olsun!");

    }
}














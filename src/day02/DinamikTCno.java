package day02;

import java.util.Random;
import java.util.Scanner;

public class DinamikTCno {
    //Dinamik olarak TC no ureten methodu yaziniz. TC no'yu asagidaki kosullara gore olusturunuz.

    //TC kimlik numarasının son rakamı çift olmak zorundadır. 0 rakamı ile başlayamaz.
    //ilk 10 rakamın toplamının birler basamağı, 11. rakamı vermektedir.
    //Ayrıca; 1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile
    // 2, 4, 6 ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı;
    //1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.

    //tc=22016313974==>11 haneli
    static Random rnd = new Random();

    public static void main(String[] args) {
        tcNoUret();
    }

    private static void tcNoUret() {

        int tcNo[] = new int[11];
        int tekToplam = 0, ciftToplam = 0, ilkOnToplam = 0;
        boolean kontrol = true;
        while (kontrol) {
            tcNo[0] = rnd.nextInt(10);

            for (int i = 1; i <= 8; i++) {
                tcNo[i] = rnd.nextInt(10);
            }

            for (int i = 0; i <= 8; i += 2) {
                tekToplam += tcNo[i];
            }
            for (int i = 1; i <= 7; i += 2) {
                ciftToplam += tcNo[i];
            }

            //1, 3, 5, 7 ve 9. rakamın toplamının 7 katı ile 2, 4, 6 ve 8. rakamın toplamının 9 katının toplamının birler basamağı 10. rakamı
            tcNo[9] = ((tekToplam * 7) + (ciftToplam * 9)) % 10;

            for (int i = 0; i < 10; i++) {
                ilkOnToplam += tcNo[i];
            }
            if ((ilkOnToplam % 10) == (tekToplam * 8) % 10 && ilkOnToplam % 10 != 0 && ilkOnToplam % 2 == 0) {
                kontrol = false;
            }
        }
        //son rakamı çift olmak zorundadır,0 ile baslayamaz,ilk 10 rakamın toplamının birler basamağı,1, 3, 5, 7 ve 9. rakamın toplamının 8 katının birler basamağı 11. rakamı vermektedir.

        tcNo[10] = ilkOnToplam % 10;
        for (int each : tcNo) {
            System.out.print(each);
        }
    }

}


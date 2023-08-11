package day01;

import java.util.Scanner;

public class makina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen secmek istediginiz kahve turunu giriniz\n" + "1.Turk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n" + "4.cikis\n");
        String kahve = scanner.nextLine();
        switch (kahve) {
            case "1": {
                System.out.println("Turk Kahvesi hazirlaniyor");
                kahve = "Turk Kahvesi";
                break;
            }
            case "2": {
                System.out.println("Filtre Kahve hazirlaniyor");
                kahve = "Filtre Kahve";
                break;
            }
            case "3": {
                System.out.println("Espresso hazirlaniyor");
                kahve = "Espresso";
                break;
            }
            case "4": {
                System.out.println("sistemden cikis yapiliyor");
                break;
            }
        }
        System.out.println("\nsut ister misiniz\n" + "E.Evet\n" + "H. Hayir");
        String sut = scanner.next();
        sut = sut.toUpperCase();
        switch (sut) {
            case "E": {
                System.out.println(" kahvenize sut ekleniyor");
                sut = "sutlu";
                break;
            }
            case "H": {
                System.out.println("kahvenize" +
                        "sut eklenmiyor");
                sut = "sade";
                break;
            }
        }
        System.out.println("\n seker ister misiniz\n" + "E.Evet\n" + "H.Hayir");
        String seker = scanner.next();
        seker = seker.toUpperCase();
        switch (seker) {
            case "E": {
                System.out.println("kahvenize seker ekleniyor");
                seker = "sekerli";
                break;
            }
            case "H": {
                System.out.println("kahvenize seker eklenmiyor");
                seker = "sekersiz";
                break;
            }
        }
        System.out.println("\n Kahveniz hangi boyutta olsun\n" + "B.Buyuk boy\n" + "O.Orta boy\n" + "K.Kucuk boy");
        String boy = scanner.next();
        boy = boy.toUpperCase();
        switch (boy) {
            case "B": {
                System.out.println("Buyuk boy kahveniz hazirlaniyor");
                boy = "Buyuk boy";
                break;
            }
            case "O": {
                System.out.println("Orta boy kahveniz hazirlaniyor");
                boy = "Orta boy";
                break;
            }
            case "K": {
                System.out.println("Kucuk boy kahveniz hazirlaniyor");
                boy = "Kucuk boy";
                break;
            }
        }
        System.out.println("====================");
        System.out.println(boy + " " + sut + " " + seker + " " + kahve + " kahveniz hazirdir");
    }
}

package rehber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by FiratUlgay on 2.12.2019.
 */
public class calisma2 {
    static Scanner scan = new Scanner(System.in);
    static List<Kisi> kisilerListesi = new ArrayList<>();


    public static void main(String[] args) {
        System.out.println("Rehbere kiþi ekle:");
        String secim;
        secim = scan.nextLine();
        if (secim.equals("ekle")) {
            for (int i = 1; i < 3; i++) {

                kisiEkleme(i);
            }
            kisileriListele();
            System.out.println("Kiþi Silmek ister misiniz?");
            /**
             * s deðiþkeni EVET vermeme raðmen if bloðunda "" olarak görünüyor
             */
            secim = scan.nextLine();
            if (secim.equals("EVET")) {
                System.out.println("silmek istediðiniz kiþinin id giriniz:");
                int id = scan.nextInt();

                delete(id);
                kisileriListele();
            }
        }
    }


    private static void delete(int id) {
        for (Kisi kisi : kisilerListesi) {
            if (id == kisi.getId()) {
                kisilerListesi.remove(kisi);
            }
        }
    }


    private static void kisileriListele() {
        for (Kisi kisi : kisilerListesi) {
            System.out.println("adý : " + kisi.getAd() + "\n" + "soyadi: " + kisi.getSoyad() + "\n" + "numara : " + kisi.getNumara() + "\n" + "id : " + kisi.getId() + "\n" + "---------");
        }
    }

    public static void kisiEkleme(int i) {
        System.out.println("isim giriniz");
        String isim = scan.nextLine();
        System.out.println("Soyisim giriniz");
        String soyIsim = scan.nextLine();
        System.out.println("Numara giriniz");
        Long numara = scan.nextLong();

        /**
         * 2. kiþiyi eklerken isim giriniz kýsmýný atlýyor.
         */
        Kisi kisi = new Kisi();
        kisi.setAd(isim);
        kisi.setSoyad(soyIsim);
        kisi.setNumara(numara);
        kisi.setId(i);

        kisilerListesi.add(kisi);
        scan.nextLine();


    }
}

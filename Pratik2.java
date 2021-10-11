package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Pratik2 {
    public static void main (String[]args){

        // 1. Adım -> değişkenleri oluştur
        double tutar, kdvOran18 = 0.18, kdvOran8 = 0.08, kdvTutar, kdvliFiyat, kdv;

        // 2. Adım -> scanner sınıfı oluştur. En başa import edilir! -> import java.util.scanner (kullanıcıdan veri almak için)
        // 3. Adım -> Scanner sınıfını tanımladık

        Scanner girilentutar = new Scanner(System.in);
        System.out.print("Tutarı giriniz : ");
        tutar = girilentutar.nextDouble();

        boolean kosul1 = tutar >= 0;
        boolean kosul2 = tutar <= 1000;
        boolean sonuc = kosul1 && kosul2;

        kdv= sonuc ? kdvOran18 : kdvOran8;

         kdvTutar = tutar * kdv; // yukarıda tanıttığımız için başa double yazmıyoruz
        System.out.println("KDV Tutarı : " + kdvTutar);


         kdvliFiyat = tutar + kdvTutar;
        System.out.println("KDV'li toplam fiyat : " + kdvliFiyat);







    }

}

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    // Değişkenleri tanımla
        int mat, fizik, kimya, tarih;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        tarih = inp.nextInt();

        int toplam = mat + fizik + kimya + tarih;
        double sonuc = toplam / 6.0;

        System.out.println("Not ortalamanız : " + sonuc);

        String  durum = (sonuc>=60) ? "Geçti" : "Kaldı";
        System.out.println(durum);
    }
}

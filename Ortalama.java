import java.util.Scanner;

public class Ortalama {
   public static void main(String[] args){
        int matematik_notu;
        int fizik_notu;
        int kimya_notu;
        int turkce_notu;
        int muzik_notu;
        int tarih_notu;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        matematik_notu = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik_notu = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya_notu = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce_notu = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik_notu = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih_notu = inp.nextInt();

        int toplam = matematik_notu + fizik_notu + kimya_notu + turkce_notu + muzik_notu + tarih_notu;
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız: "+ortalama);

        String str = ortalama > 60 ? "Geçtiniz. Tebrikler." : "Kaldınız. Pü sıfatınıza. Yazıklar olsun";
        System.out.println(str);
    }
}

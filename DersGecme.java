import java.util.Scanner;

public class DersGecme {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double ortalama = 0;

        double matematik_notu;
        System.out.print("Matematik notunuz: ");
        matematik_notu = input.nextDouble();
        if ((matematik_notu >= 0) && (matematik_notu <= 100)){
            ortalama += matematik_notu;
        }else{
            System.out.println("Geçersiz giriş yaptınız!!!");
            return;
        }

        double fizik_notu;
        System.out.print("Fizik notunuz: ");
        fizik_notu = input.nextDouble();
        if((fizik_notu >= 0) && (fizik_notu <= 100)){
            ortalama += fizik_notu;
        }else{
            System.out.println("Geçersiz giriş yaptınız!!!");
            return;
        }

        double turkce_notu;
        System.out.print("Türkçe notunuz: ");
        turkce_notu = input.nextDouble();
        if((turkce_notu >= 0) && (turkce_notu <= 100)){
            ortalama += turkce_notu;
        }else{
            System.out.println("Geçersiz giriş yaptınız!!!");
            return;
        }

        double kimya_notu;
        System.out.print("Kimya notunuz: ");
        kimya_notu = input.nextDouble();
        if((kimya_notu >= 0) && (kimya_notu <= 100)){
            ortalama += kimya_notu;
        }else{
            System.out.println("Geçersiz giriş yaptınız!!!");
            return;
        }

        double muzik_notu;
        System.out.print("Müzik notunuz: ");
        muzik_notu = input.nextDouble();
        if((muzik_notu >= 0) && (muzik_notu <= 100)){
            ortalama += muzik_notu;
        }else{
            System.out.println("Geçersiz giriş yaptınız!!!");
            return;
        }
        ortalama /= 5.0;
        if(ortalama >= 55){
            System.out.println("Ortalamanız: "+ortalama);
            System.out.println("Tebrikler, geçtiniz!!! :))");
        }else if(ortalama < 55){
            System.out.println("Ortalamanız: "+ortalama);
            System.out.println("Yazıklar olsun. Kaldınız!!! :|");
        }
    }
}

import java.util.Scanner;

public class KDV {
    public static void main(String[] args){
        double KDVsiz_fiyat;
        double KDV_orani;
        double KDVli_fiyat;
        double KDV_tutari;
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz fiyat: ");
        KDVsiz_fiyat = input.nextInt();
        KDV_orani = ((0 <= KDVsiz_fiyat) && (1000 >= KDVsiz_fiyat)) ? 0.18 : 0.08;
        KDVli_fiyat = KDVsiz_fiyat * (1 + KDV_orani);
        KDV_tutari = KDVli_fiyat - KDVsiz_fiyat;
        System.out.println("KDV'siz fiyat: "+KDVsiz_fiyat);
        System.out.println("KDV oranı: "+KDV_orani);
        System.out.println("KDV'li fiyat: "+KDVli_fiyat);
        System.out.println("KDV tutarı: "+KDV_tutari);
    }
}

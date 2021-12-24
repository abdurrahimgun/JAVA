import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double armut_kilo;
        System.out.print("Armut kaç kilo ? ");
        armut_kilo = input.nextDouble();
        double elma_kilo;
        System.out.print("Elma kaç kilo ? ");
        elma_kilo = input.nextDouble();
        double domates_kilo;
        System.out.print("Domates kaç kilo ? ");
        domates_kilo = input.nextDouble();
        double muz_kilo;
        System.out.print("Muz kaç kilo ? ");
        muz_kilo = input.nextDouble();
        double patlican_kilo;
        System.out.print("Patlıcan kaç kilo ? ");
        patlican_kilo = input.nextDouble();
        double toplamTutar = 2.14 * armut_kilo + 3.67 * elma_kilo + 1.11 * domates_kilo + 0.95 * muz_kilo + 5.0 * patlican_kilo;
        System.out.println("Toplam tutar: "+toplamTutar);
    }
}

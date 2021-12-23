import java.util.Scanner;

public class Alan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double kenar1;
        double kenar2;
        double kenar3;
        double cevre;
        double alan;
        System.out.print("Birinci kenar: ");
        kenar1 = input.nextDouble();
        System.out.print("İkinci kenar: ");
        kenar2 = input.nextDouble();
        System.out.print("Üçüncü kenar: ");
        kenar3 = input.nextDouble();
        cevre = kenar1 + kenar2 + kenar3;
        alan = Math.sqrt(cevre/2 * (cevre/2 - kenar1) * (cevre/2 - kenar2) * (cevre/2 - kenar3));
        System.out.println("Üçgenin alanı: "+alan);
    }
}

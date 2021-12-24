import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args){
        double alfa;
        double pi = 3.14;
        double yaricap;
        Scanner input = new Scanner(System.in);
        System.out.print("Daire diliminin merkez açısı: ");
        alfa = input.nextInt();
        System.out.print("Daire diliminin yarıçapı: ");
        yaricap = input.nextInt();
        double alan = pi * yaricap * yaricap * alfa / 360.0;
        System.out.println("Daire diliminin alanı: "+alan);
    }
}

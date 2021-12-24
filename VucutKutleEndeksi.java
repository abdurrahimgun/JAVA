import java.util.Scanner;

public class VucutKutleEndeksi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double boy;
        double kutle;
        double endeks;
        System.out.print("Lütfen boyunuzu giriniz(cm): ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz (kg): ");
        kutle = input.nextDouble();
        endeks = kutle / Math.pow(boy/100 , 2);
        System.out.println("Vücut-Kütle endeksiniz: "+endeks);
    }
}

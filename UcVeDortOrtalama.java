import java.util.Scanner;

public class UcVeDortOrtalama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı : ");
        double ortalama = 0;
        int sayac = 0;
        int sayi = input.nextInt();
        for (int i = 0; i <= sayi; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                ortalama += i;
                sayac++;
                System.out.println(i + " sayısı 3 ve 4 ile tam bölünür.");
            }
        }
        System.out.println(sayi + " sayısına kadar olan 3 veya 4 ile bölünebilen sayıların ortalaması : " + ortalama/sayac);
    }
}

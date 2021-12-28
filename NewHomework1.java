import java.util.Scanner;

public class NewHomework1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı : ");
        int number = input.nextInt();
        int toplam = 0;
        while(number % 2 == 0){
            if((number % 2 == 0) && (number % 4 == 0)){
                toplam += number;
                System.out.println(number + " sayısı 2 ve 4 ile tam bölünür.");
            }
            System.out.print("Sayı : ");
            number = input.nextInt();
        }
        System.out.println("Toplam : " + toplam);
    }
}

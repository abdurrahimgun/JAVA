import java.util.Scanner;

public class Asal {
    static void isAsal(int num , int kontrol){
        int temp = 1;
        if(kontrol == 1){
            if(temp == 1){
                System.out.println(num + " sayısı ASALDIR.");
                return;
            }
        } else if(num % kontrol == 0){
            temp = 0;
            System.out.println(num + " sayısı ASAL DEĞİLDİR.");
            return;
        }else {
            temp = 1;
            isAsal(num , kontrol - 1);
        }
    }

    public static void main(String[] args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı : ");
        num = input.nextInt();
        isAsal(num , num/2);
    }
}

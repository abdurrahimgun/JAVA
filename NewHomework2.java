import java.util.Scanner;

public class NewHomework2 {
    public static void main(String[] args){
        System.out.print("Sayı : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i , j;
        for(i = 1 , j = 1; i <= number ; i *= 4 , j *= 5){
            if(j <= number){
                System.out.println("5'in kuvveti : " + j);
            }
            System.out.println("4'ün kuvveti : " + i);
        }
    }
}

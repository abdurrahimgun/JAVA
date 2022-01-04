import java.util.Scanner;

public class Desen {
    static void desen(int num , int kontrol , int topla){
        if((num <= kontrol) && (num >= -5)){
            System.out.print(num + " ");
        }
        if((num >= -5) && (topla == 0)){
            desen(num - 5 , kontrol , 0);
            if((num <= 0) && (num >= -5)){
                desen(num , kontrol , 1);
            }
        }else if((num <= kontrol) && (topla == 1)){
            desen(num + 5 , kontrol , 1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı : ");
        int num = input.nextInt();
        desen (num , num , 0);
    }
}

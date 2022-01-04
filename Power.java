import java.util.Scanner;

public class Power {
    static int pow(int base , int exp){
        if(exp == 0){
            return 1;
        }
        return base * pow(base , exp - 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Üs : ");
        int exp = input.nextInt();
        System.out.print("Taban : ");
        int base = input.nextInt();
        System.out.println(pow(base ,exp));
    }
}

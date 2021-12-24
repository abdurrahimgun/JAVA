import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number1;
        double number2;
        System.out.print("Birinci sayı: ");
        number1 = input.nextDouble();
        System.out.print("İkinci sayı: ");
        number2 = input.nextDouble();
        int select;
        System.out.println("Toplama : 1\nÇıkartma : 2\nÇarpma : 3\nBölme : 4");
        System.out.print("İşlem tercihiniz: ");
        select = input.nextInt();
        double sonuc;

        switch (select){
            case 1:
                sonuc = number1 + number2;
                System.out.println("İşlemin sonucu: "+sonuc);
                break;
            case 2:
                sonuc = number1 - number2;
                System.out.println("İşlemin sonucu: "+sonuc);
                break;
            case 3:
                sonuc = number1 * number2;
                System.out.println("İşlemin sonucu: "+sonuc);
                break;
            case 4:
                if(number2 == 0){
                    System.out.println("Hiçbir sayı 0'a bölünemez !!!!");
                    break;
                }else {
                    sonuc = number1 / number2;
                    System.out.println("İşlemin sonucu: "+sonuc);
                    break;
                }
            default:
                System.out.println("Yanlış işlem girişi yaptınız. Tekrar deneyin!!!!!!");
        }

    }
}

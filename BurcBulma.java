import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int day;
        String month;
        System.out.print("Doğduğunuz ay: ");
        month = input.nextLine();
        System.out.print("Ayın kaçıncı gününde doğdunuz: ");
        day = input.nextInt();

        if(month.equals("ocak")){
            if((day <= 21) && (day > 0)){
                System.out.println("Burcunuz: \"Oğlak\".");
            }else if((day > 21) && (day <= 31)){
                System.out.println("Burcunuz: \"Kova\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("şubat")){
            if((day <= 19) && (day > 0)){
                System.out.println("Burcunuz: \"Kova\".");
            }else if((day > 19) && (day <= 29)){
                System.out.println("Burcunuz: \"Balık\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("mart")){
            if((day <= 20) && (day > 0)){
                System.out.println("Burcunuz: \"Balık\".");
            }else if((day > 20) && (day <= 31)){
                System.out.println("Burcunuz: \"Koç\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("nisan")){
            if((day <= 20) && (day > 0)){
                System.out.println("Burcunuz: \"Koç\".");
            }else if((day > 20) && (day <= 30)){
                System.out.println("Burcunuz: \"Boğa\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("mayıs")){
            if((day <= 21) && (day > 0)){
                System.out.println("Burcunuz: \"Boğa\".");
            }else if((day > 21) && (day <= 31)){
                System.out.println("Burcunuz: \"İkizler\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("haziran")){
            if((day <= 22) && (day > 0)){
                System.out.println("Burcunuz: \"İkizler\".");
            }else if((day > 22) && (day <= 31)){
                System.out.println("Burcunuz: \"Yengeç\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("temmuz")){
            if((day <= 22) && (day > 0)){
                System.out.println("Burcunuz: \"Yengeç\".");
            }else if((day > 22) && (day <= 31)){
                System.out.println("Burcunuz: \"Aslan\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("ağustos")){
            if((day <= 22) && (day > 0)){
                System.out.println("Burcunuz: \"Aslan\".");
            }else if((day > 22) && (day <= 31)){
                System.out.println("Burcunuz: \"Başak\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("eylül")){
            if((day <= 22) && (day > 0)){
                System.out.println("Burcunuz: \"Başak\".");
            }else if((day > 22) && (day <= 31)){
                System.out.println("Burcunuz: \"Terazi\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("ekim")){
            if((day <= 22) && (day > 0)){
                System.out.println("Burcunuz: \"Terazi\".");
            }else if((day > 22) && (day <= 31)){
                System.out.println("Burcunuz: \"Akrep\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("kasım")){
            if((day <= 21) && (day > 0)){
                System.out.println("Burcunuz: \"Akrep\".");
            }else if((day > 21) && (day <= 31)){
                System.out.println("Burcunuz: \"Yay\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else if(month.equals("aralık")){
            if((day <= 21) && (day > 0)){
                System.out.println("Burcunuz: \"Yay\".");
            }else if((day > 21) && (day <= 31)){
                System.out.println("Burcunuz: \"Oğlak\".");
            }else{
                System.out.println("Geçersiz giriş yaptınız!!!");
                return;
            }
        }else{
            System.out.println("Geçersiz giriş yaptınız!!!");
        }
    }
}

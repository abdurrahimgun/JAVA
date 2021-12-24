import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Sifre {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password;
        String userName;
        String new_password;
        String new_userName;
        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();
        if((userName.equals("patika")) && (password.equals("java1234"))){
            System.out.println("Giriş yaptınız.");
        }else{
            System.out.println("Giriş yapılamadı!!!");
            String kontrol;
            System.out.println("Şifrenizi değiştirmek ister misiniz?");
            System.out.println("evet: onaylama\nhayir: reddetme");
            kontrol = input.nextLine();
            if(kontrol.equals("evet")){
                System.out.print("Lütfen eskisi ile aynı olmayan yeni kullanıcı adınızı giriniz: ");
                new_userName = input.nextLine();
                System.out.print("Lütfen eskisi ile ile aynı olmayan şifrenizi giriniz: ");
                new_password = input.nextLine();
                if((new_userName.equals("patika")) || (new_password.equals("java1234"))){
                    System.out.println("Hatalı işlem yaptınız!!!");
                }else{
                    System.out.println("Değiştirme işlemi başarılı.");
                }
            }else{
                new_userName = "";
                new_password = "";
            }
            System.out.println("patika" + " - " + new_userName + " //// " + "java1234" + " - " + new_password);
        }
    }
}

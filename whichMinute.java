
import java.util.Scanner;

public class whichMinute {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("100-500 arasında bir değer giriniz.");
        int deger = keyboard.nextInt();
        
        while (deger<100 || deger>500) {            
            System.err.println("Girdiğiniz değer 100 ile 500 araasında değil.");
            System.out.println("100-500 arasında bir değer giriniz.");
            deger = keyboard.nextInt();
        }
        int saat = deger / 60;
        int dakika = deger % 60;
        
        if(dakika>60){
            saat+=dakika/60;
            dakika=dakika%60;  
        }
        
        System.out.println("Şu an saat: "+(8+saat)+":"+(dakika));
    }
}

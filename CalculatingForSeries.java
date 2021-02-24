
import java.util.Scanner;

public class CalculatingForSeries {
    public static int hesapla(int value){
        int result=value;
        for (int i = 0; i < (value+1); i++) {
            result+=i*i;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("O sayıysa kadar olan kare toplamlarını hesaplamak istediğiniz sayıyı giriniz: ");
        int value=keyboard.nextInt();
        
        System.out.println("Sonuç: "+hesapla(value));
    }
}

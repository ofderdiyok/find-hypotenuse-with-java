
import java.util.Scanner;


public class NumberinReverse {
    public static void main(String[] args) {
        String isim;
    
        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz.");
        isim = scan.nextLine();
        for (int i = isim.length()-1; i >= 0 ; i--) {
            System.out.print(isim.charAt(i));
        }
        System.out.println("");
    }
}


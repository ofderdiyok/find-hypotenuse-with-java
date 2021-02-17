
import java.util.Random;
import java.util.Scanner;

public class standardDeviation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Dizinin boyutunu giriniz.");
        int boyut = scan.nextInt();
        int[] dizi = new int[boyut];
        
        int toplam = 0;
        
        for (int i = 0; i < boyut; i++) {
            dizi[i] = r.nextInt(100);
            toplam+=dizi[i];
            System.out.print(dizi[i]+" - ");
        } 
        
        float ortalama = toplam/boyut;
        
        System.out.println("");
        System.out.print("Ortalama: " + ortalama);
        System.out.println("");
        
        float farkToplam = 0;
        for (int i = 0; i < boyut; i++) {
            farkToplam += Math.pow((dizi[i]-ortalama),2);
        }
        
        double sapma = Math.sqrt(farkToplam / (boyut-1));
        
        System.out.println("Standart sapma: " + sapma);
    }    
}

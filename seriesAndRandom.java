
import java.util.Random;
import java.util.Scanner;


public class seriesAndRandom {
    public static int Goster(int elemanSayisi){
        Random rand=new Random();
        int[] dizi1=new int[elemanSayisi];
        int[] dizi2=new int[elemanSayisi];
        int diziBirElemansayisi=0;
        int diziİkiElemanSayisi=0;
        
        for (int i = 0; i < elemanSayisi; i++) {
            int sayi=rand.nextInt(100);
            System.out.println("Üretilen sayı: "+sayi);
            
            if (sayi<50 && sayi%2==0) {
                System.out.println(sayi+" Dizi 1'e eklendi.");
                dizi1[diziBirElemansayisi]=sayi;
                diziBirElemansayisi+=1;
            }
            else if(sayi>50 && sayi%2!=0){
                System.out.println(sayi+" Dizi 2'ye eklendi");
                dizi2[diziİkiElemanSayisi]=sayi;
                diziİkiElemanSayisi+=1;
            }
        }
        System.out.println("Dizi bir elemanları");
        for (int a = 0; a < diziBirElemansayisi; a++) {
            System.out.print(dizi1[a]+",");
        }
        
        System.out.println("");
        
        System.out.println("Dizi iki elemanları");
        for (int a = 0; a < diziİkiElemanSayisi; a++) {
            System.out.print(dizi2[a]+",");
        }
        
        System.out.println("");
        
        return diziBirElemansayisi+diziİkiElemanSayisi;
    }
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz: ");
        int value=keyboard.nextInt();
        System.out.println("Sonuç: "+Goster(value));
    }
}


import java.util.Scanner;


public class identifyNumber {
    public static String find(String idnumber){
        String result = "";
        int[][] series=new int[3][3];
        int k=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                series[i][j]=Integer.parseInt(idnumber.substring(k,k+1));
            }
        }
        
        int sayi=Integer.parseInt(idnumber.substring(9, 11));
        if (sayi>50) {
            int[] sutunlar=new int[3];
            int toplam=0;
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 3; b++) {
                    toplam+=series[b][a];
                }
                sutunlar[a]=toplam;
                toplam=0;
            }
            int enBuyuk=sutunlar[0];
            result="Sütun X";
            for (int q = 1; q < 3; k++) {
                if (sutunlar[q]>enBuyuk) {
                    enBuyuk=sutunlar[q];
                    result="Sütün "+(q+1);
                }
            }
        }
        
        else if(sayi<=50){
            int[] satırlar=new int[3];
            int toplam=0;
            
            for (int a = 0; a < 3; a++) {
                for (int b = 0; b < 3; b++) {
                    toplam+=series[a][b];
                }
                satırlar[a]=toplam;
                toplam=0;   
            }
            
            int enBuyuk=satırlar[0];
            result="Satır X";
            for (int q = 1; q < 3; k++) {
                if (satırlar[q]>enBuyuk) {
                    enBuyuk=satırlar[q];
                    result="Satır "+(q+1);
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Type id number");
        String idNumber=keyboard.nextLine();
        System.out.println(find(idNumber));
        while (idNumber.length()!=11) {    
            System.out.println("Hatalı giriş");
            idNumber=keyboard.nextLine();
            System.out.println(find(idNumber));            
        }
    }
}

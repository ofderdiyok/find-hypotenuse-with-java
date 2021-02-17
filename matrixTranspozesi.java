
import java.util.Random;
import java.util.Scanner;


public class matrixTranspozesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("Sutün sayısını giriniz.");
        int sutun = scan.nextInt();
        System.out.println("Satır sayısını giriniz.");
        int satır = scan.nextInt();
        
        int[][] matris = new int[satır][sutun];
        
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sutun; j++) {
                matris[i][j] = r.nextInt(8);
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }
        
        int[][] tra = new int[sutun][satır];
        System.out.println("Transpoze Matris");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satır; j++) {
                tra[i][j] = matris[j][i];
                System.out.print(tra[i][j] + " ");
            }
            System.out.println("");
        }
    }    
}

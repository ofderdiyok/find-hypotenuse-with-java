
import java.util.Random;

public class matrixSum {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        int[][] top = new int[3][3];
        
        Random r = new Random();
        
        System.out.println("Matrix 1");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m1[i][j] = r.nextInt(5);
                System.out.print(m1[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Matrix 2");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                m2[i][j] = r.nextInt(5);
                System.out.print(m2[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Toplam Matrisi");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                top[i][j] = m1[i][j] + m2[i][j];
                System.out.print(top[i][j] + " ");
            }
            System.out.println("");
        }
    }    
}

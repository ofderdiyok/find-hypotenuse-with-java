/*
source(turkish) = https://youtu.be/U6zfnp9tlXw
*/

import java.util.Random;
import java.util.Scanner;

public class minefield {
    public static int[][] fillTheMap(int column,int row){
        Random rndm=new Random();
        int[][] matris = new int[column][row];
        int i=0;
        while (i<column) {            
            int j=0;
            while (j<row) {                
                matris[i][j]=rndm.nextInt(2);
                j+=1;
            }
            i+=1;
        }
        return matris;
    }
    
    public static void showMap(int[][] matris){
        int row=matris.length;
        int column=matris[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Type the map's row: ");
        int satir=keyboard.nextInt();     
        System.out.println("Type the map's column: ");
        int sutun=keyboard.nextInt();
                
        int[][] gameMap = fillTheMap(satir, sutun);
        showMap(gameMap);
        
        int point=0;
        boolean control=true;
        
        while (control) {            
            System.out.println("Seçtiğiniz lokasyonun satır değerini giriniz: ");
            int x=keyboard.nextInt();
            System.out.println("Seçtiğiniz lokasyonun sutün değerini giriniz: ");
            int y=keyboard.nextInt();
            
            if (gameMap[x][y]==1) {
                control=false;
            }
            else{
                point+=10;
                System.out.println("You are still alive. Let's continue...");
                control=true;
            }
        }
        
        System.out.println("Oyun bitti toplam puanınız: "+point);
    }    
}

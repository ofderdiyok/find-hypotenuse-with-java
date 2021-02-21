/*
source(turkish)= https://youtu.be/R66bUSIJ4vA
*/

public class squareNumbers{
    public static void main(String[] args) {
        int pay = 1;
        int payda = 2;
        
        int i = 0;
        while(i<5){
            System.out.println(pay + "/" + payda); 
            pay = payda;
            payda = pay*pay;
            i+=1;
        }
           
    }
}
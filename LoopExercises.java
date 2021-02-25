
package LoopExercises;

public class LoopExercises {
    public static void Yaz(boolean kontrol){
        if(kontrol){
            for (int i = 0; i < 6; i++) {
                String a=String.valueOf(i);
                String b=String.valueOf(i+1);
                System.out.print(a+b+" ");
            }
        }
        else{
            for (int i = 97; i < 102; i++) {
                char a=(char)(i);
                char b=(char)(i+1);
                System.out.print(a);
                System.out.print(b+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        Yaz(true);
        System.out.println("");
        Yaz(false);
    }
}

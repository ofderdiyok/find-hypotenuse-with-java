
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c =0;
        
        do {            
            c = a + b;
            System.out.print(c + "-");
            a = b;
            b = c;
        } while (c < 1000);
        System.out.println("");
    }    
}

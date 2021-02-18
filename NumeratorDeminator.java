
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class NumeratorDeminator {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        
        System.out.println("Type numerator: ");
        int numerator=keyboard.nextInt();
        
        System.out.println("Type deminator: ");
        int deminator=keyboard.nextInt();
        
        if (numerator<deminator) {
            System.out.println("You have been wrote simple fraction");
        }
        else if (numerator==deminator){
            System.out.println("You have been wrote exact fraction");    
            int x = numerator/deminator;
            int y = numerator%deminator;
            System.out.println("Your fraction is equal to:  "+x+" ");
        }
        else if (numerator>deminator){
            System.out.println("You have been wrote compound fraction");
            int x = numerator/deminator;
            int y = numerator%deminator;
            System.out.println("Your fraction is equal to:  "+x+" "+"+"+" "+y+"/"+deminator);
        }
        else{
            System.out.println("You did something wrong.");
        }
    }
}

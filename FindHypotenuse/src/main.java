
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ofderdiyok
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Please type short edges.");
        double short_edge_1 = scanner.nextDouble();
        double short_edge_2 = scanner.nextDouble();
        double hypotenuse = (short_edge_1*short_edge_1)+(short_edge_2*short_edge_2);
        System.out.println(Math.sqrt(hypotenuse));
    }
}

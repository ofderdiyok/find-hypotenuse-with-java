import java.util.*;
public class whichDay {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type a number between 1 and 365.");
        int sayi = keyboard.nextInt();

        while(sayi<0 || sayi>365){
            System.err.println("Lütfen belirtilen koşullarda giriş yapınız.");
            System.out.println("Type a number between 1 and 365.");
            sayi = keyboard.nextInt();
        }

        String yaz = "";
        int day = sayi%7;
        if(day==0){
            yaz="Cumartesi";
        }
        else if(day==1){
            yaz="Pazar";
        }
        else if(day==2){
            yaz="Pazartesi";
        }
        else if(day==3){
            yaz="Salı";
        }
        else if(day==4){
            yaz="Çarşamba";
        }
        else if(day==5){
            yaz="Perşembe";
        }
        else if(day==6){
            yaz="Cuma";
        }

        System.out.println(sayi + " gün sonra günlerden " + yaz);

    }
}

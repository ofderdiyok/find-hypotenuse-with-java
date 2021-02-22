
public class Okek {
    public static int okek(int x,int y){
        int result=0;
        for (int i = 1; i <= (x*y); i++) {
            if (i%x==0 && i%y==0) {
                result=i;
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        System.out.println(okek(3,4));
    }
}

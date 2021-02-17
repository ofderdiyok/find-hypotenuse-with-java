/*
source(turkish): https://youtu.be/TJAWp3U6DAI
*/
public class Navigation {
    public static String findRoad(int[][] data){
        String result="";
        int row=data.length;
        int column=data[0].length;
        
        int i=0;
        while (i<row) {            
            int j=0;
            while (j<column) {                
                if (data[i][j]==1) {
                    result+=" "+String.valueOf(i)+String.valueOf(j);
                }
                j+=1;
            }
            i+=1;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int harita[][]={{1,1,0,0,0},{0,1,1,0,0},{0,0,1,1,0},{0,0,0,1,1}};
        String road = findRoad(harita);
        System.out.println(road);
    }    
}

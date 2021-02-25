
public class SeriesExercies {
    public static int[] ortakBul(int[] dizi1, int[] dizi2){
        int[] ortakElemanlar=new int[dizi1.length];
        int pozisyon=0;
        
        for (int i = 0; i < dizi1.length; i++) {
            if (dizi1[i]==dizi2[i]) {
                ortakElemanlar[pozisyon]=dizi1[i];
                pozisyon++;
            }
            
            if (pozisyon!=dizi1.length) {
                for (int j = pozisyon+1; j < dizi1.length; j++) {
                    ortakElemanlar[j]=-1;
                }
            }
        }
        return ortakElemanlar;
    }
    public static void main(String[] args) {
        int[] veri1={6,21,17,64,97,102,197};
        int[] veri2={3,21,14,45,97,105,197};
        int[] result=ortakBul(veri1, veri2);
        
        System.out.println("Ortak Elemanlar");
        for (int indis = 0; indis < result.length; indis++) {
            if (result[indis]!=-1) {
                System.out.print(result[indis]);
            }
            
            if (result[indis]!=result[result.length-1]) {
                System.out.print(",");
            }
        }
        System.out.println("");
    }
}

package Recursividad;

public class SumaVectores {
    public static int suma(int[]a,int b){
        if (b >= a.length){
            return 0;
        }else {
            return a[b]+suma(a,b+1);
        }
    }
}

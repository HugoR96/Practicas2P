package Recursividad;

public class Promedio {
    public static void main(String[]args){
        int []vector={1,2,3,4,5,6};
        System.out.println("El promedio es:" +promedioCalculando(vector.length,vector));
    }
    public static float promedioCalculando(int n, int []vector){
        if(n <=0){
            return 0;
        }
        return (vector[n-1]+(promedioCalculando(n-1,vector)*(n-1)))/n;
    }
}

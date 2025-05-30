package Recursividad;

public class Comparar2Vectores {
    public static boolean compararvectores(int[] v1, int[] v2, int indice) {
        if (v1.length != v2.length) {
            return false;
        }
        if (indice == v1.length) {
            return true;
        }
        if (v1[indice] != v2[indice]) {
            return false;
        }
        return compararvectores(v1, v2, indice + 1);
    }
    public static void main (String[]args){
        int[]vector1 = {1,2,3,4,5};
        int[]vector2 = {1,2,3,4,5};
        System.out.println(compararvectores(vector1,vector2,0));
    }
}



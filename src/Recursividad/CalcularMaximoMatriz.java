package Recursividad;

public class CalcularMaximoMatriz {
    public static void main(String[] args) {
        int[][][] matriz = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };
        System.out.println("El maximo de la matriz es: "+Maximo(matriz,0,0,0,matriz[0][0][0]));
    }
    public static int Maximo(int [][][]matriz,int i,int j ,int k, int max){
        if (i==1 && k == 1){
            if (matriz[i][j][k]>max){
                max = matriz[i][j][k];
            }
            return max;
        }
        if (k == 2){
            return Maximo(matriz,i,j+1,0,max);
        }
        if(j == 2){
            return Maximo(matriz,i+1,0,0,max);
        }
        if (matriz[i][j][k]>max){
            max = matriz[i][j][k];
        }
        return Maximo(matriz,i,j,k+1,max);
    }
}


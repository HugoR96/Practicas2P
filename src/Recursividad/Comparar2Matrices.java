package Recursividad;

public class Comparar2Matrices {
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
        int[][][] matriz2 = {
                {
            {1, 2},
            {3, 4}
    },
        {
        {5,6},
        {7,9}
        }
        };
        if (Comparacion(matriz, matriz2, 0, 0, 0)) {
            System.out.println("Son iguales ");
        } else {
            System.out.println("No son iguales ");
        }
    }

    public static boolean Comparacion(int[][][] matriz, int[][][] matriz2, int i, int j, int k) {
        if (i == 2) {
            return true;
        }
        if (matriz[i][j][k] != matriz2[i][j][k]) {
            return false;
        }
        if (k < 1) {
            return Comparacion(matriz, matriz2, i, j, k + 1);
        } else if (j < 1) {
            return Comparacion(matriz, matriz2, i, j + 1, 0);
        } else {
            return Comparacion(matriz, matriz2, i + 1, 0, 0);
        }
    }
}


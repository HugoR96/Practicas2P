package Recursividad;

public class CalcularElMaximo {
    public static void main(String[] args) {
        int[] vector = {2, 10, 6, 9, 25};
        System.out.println("El maximo vector es: " + maximo(vector, 0, vector[0]));
    }

    public static int maximo(int[] vector, int n, int max) {
        if (n == vector.length) {
            return max;
        }
        if (vector[n] > max) {
            max = vector[n];
        }
        return maximo(vector, n + 1, max);
    }
}

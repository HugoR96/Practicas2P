package Recursividad;

public class Potencia {
    public static void main(String[] args) {
       double numero = 2;
       int n= 4;
       double resultado = potencia(numero,n);
        System.out.println("El numero:" +numero+ " elavado a " +n+ " es: " +resultado);
    }
    public static double potencia(double numero,int n){
        if (n==0){
            return 1;
        }
        return numero * potencia(numero,n-1);
    }
}

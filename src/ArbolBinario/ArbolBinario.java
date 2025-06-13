package ArbolBinario;

public class ArbolBinario {
        Nodo raiz;

        public static void main(String[] args) {
            ArbolBinario edades = new ArbolBinario();
            edades.insert(19);
            edades.insert(25);
            edades.insert(29);
            edades.insert(10);
            edades.insert(23);
            edades.insert(21);
            edades.insert(40);
            edades.insert(18);
            edades.insert(20);

            edades.print();
        }

        public ArbolBinario() {
            this.raiz = null;
        }

        public void insert(int data) {
            this.raiz = recursiveInsert(this.raiz, data);
        }

        public static Nodo recursiveInsert(Nodo actual, int data) {
            if(actual == null){
                return new Nodo(data);
            }

            if(data < actual.data){
                actual.left = recursiveInsert(actual.left, data);
            } else if(data >= actual.data){
                actual.right = recursiveInsert(actual.right, data);
            }

            return actual;
        }

        public void print(){
            System.out.println("Imprimir las edades en orden");
            printRecursive(this.raiz);
            System.out.println();
        }

        public static void printRecursive(Nodo actual){
            if(actual != null){
                printRecursive(actual.left);
                System.out.print(actual.data + " ");
                printRecursive(actual.right);
            }
        }

    }

    class Nodo {

        Nodo left, right;
        int data;


        public Nodo(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    

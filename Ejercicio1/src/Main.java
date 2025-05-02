import lcse.ListaCircularSimplementeEnlazada;
import lse.ListaSimplenteEnlazada;
 public class Main {
        public static void main(String[] args){
            /*ListaSimplenteEnlazada listaSimplenteEnlazada = new ListaSimplenteEnlazada();
            listaSimplenteEnlazada.insertar(5);
            listaSimplenteEnlazada.insertar(4);
            listaSimplenteEnlazada.insertar(3);
            listaSimplenteEnlazada.insertar(2);
            listaSimplenteEnlazada.insertar(1);
            listaSimplenteEnlazada.insertar(0);

            listaSimplenteEnlazada.mostar();
            listaSimplenteEnlazada.eliminar();
            listaSimplenteEnlazada.eliminar();
            listaSimplenteEnlazada.mostar();

            ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
            System.out.println(listaDoblementeEnlazada.estaVacia());
             for (int i = 20; i > 0 ; i--){
                   listaDoblementeEnlazada.insertar(i);
             }
                   System.out.println(listaDoblementeEnlazada.estaVacia());for (int i = 1; i < 12 ; i++) {
                   listaDoblementeEnlazada.MostrarAdelante();
            }
                   listaDoblementeEnlazada.eliminar();
                   listaDoblementeEnlazada.eliminar();
                   listaDoblementeEnlazada.MostrarAtras();
                   listaDoblementeEnlazada.MostrarAdelante();
                   */
            ListaCircularSimplementeEnlazada listaCircularSimplementeEnlazada = new ListaCircularSimplementeEnlazada();
            System.out.println(listaCircularSimplementeEnlazada.estaVacia());
            System.out.println(listaCircularSimplementeEnlazada.tamaño());

            for (int i = 1; i < 12 ; i++) {
                listaCircularSimplementeEnlazada.insertarFin(i);
            }
            listaCircularSimplementeEnlazada.mostrar();
            System.out.println(listaCircularSimplementeEnlazada.tamaño());

            listaCircularSimplementeEnlazada.eliminarFin();
            listaCircularSimplementeEnlazada.eliminarFin();

            listaCircularSimplementeEnlazada.mostrar();

        }
    }


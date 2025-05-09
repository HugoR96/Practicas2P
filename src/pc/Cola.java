package pc;

import lse.Nodo;
import lse.ListaSimplenteEnlazada;

public class Cola extends ListaSimplenteEnlazada {
    @Override
    public void insertar(Object dato) {
        super.insertar(dato);
        if (estaVacia()) {
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        } else {
            Nodo ultimo = primero;
            while (ultimo.getSiguiente()!=null){
                ultimo = ultimo.getSiguiente();
            }

            Nodo nuevo = new Nodo(dato,null);
            ultimo.setSiguiente(nuevo);
        }
    }
}
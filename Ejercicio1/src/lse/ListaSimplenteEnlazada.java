package lse;

public class ListaSimplenteEnlazada {
    static nodo primero;

    public ListaSimplenteEnlazada() {
        primero = null;
    }

    public static boolean estaVacia() {
        return primero == null;
    }

    public void insertar(Object dato) {
        if (estaVacia()) {
            nodo nuevo = new nodo(dato, null);
            primero = nuevo;
        } else {
            nodo nuevo = new nodo(dato, primero);
            primero = nuevo;
        }

    }

    public void eliminar() {
        if (!estaVacia()) {
            primero = primero.getSiguiente();
        }
    }

    public void mostar() {
        nodo tmp = primero;
        while (tmp != null) {
            System.out.print(tmp.getDato() + "  ");

            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }
}


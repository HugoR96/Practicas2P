package lse;

public class ListaSimplenteEnlazada {
    protected Nodo primero;

    public ListaSimplenteEnlazada() {

        primero = null;
    }

    public boolean estaVacia() {

        return primero == null;
    }

    public void insertar(Object dato) {
        if (estaVacia()) {
            Nodo nuevo = new Nodo(dato, null);
            primero = nuevo;
        } else {
            Nodo nuevo = new Nodo(dato, primero);
            primero = nuevo;
        }

    }

    public void eliminar() {
        if (!estaVacia()) {
            primero = primero.getSiguiente();
        }
    }

    public void mostar() {
        Nodo tmp = primero;
        while (tmp != null) {
            System.out.print(tmp.getDato() + "  ");

            tmp = tmp.getSiguiente();
        }
        System.out.println();
    }
}


package lcde;

public class ListasCircularDoblementeEnlazada {
    nodo inicio;

    public ListasCircularDoblementeEnlazada() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void insetarFinal(Object dato) {
        if (estaVacia()) {
            nodo nuevo = new nodo();
            nuevo.setAnterior(nuevo);
            nuevo.setSiguiente(nuevo);
            nuevo.setDato(dato);


            inicio = nuevo;
        } else {
            nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getSiguiente();
            }
            nodo nuevo = new nodo();
            nuevo.setAnterior(ultimo);
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            ultimo.setSiguiente(nuevo);
            inicio.setAnterior(nuevo);
        }
    }

    public void eliminarFinal() {
        if (!estaVacia()) {
            nodo ultimo = inicio;
            while (ultimo.getSiguiente() != inicio) {
                ultimo = ultimo.getAnterior();
            }
            nodo Penultimo = ultimo.getAnterior();
            Penultimo.setSiguiente(inicio);

            inicio.setAnterior(Penultimo);
        }
    }

    public void mostar() {
        if (!estaVacia()) {
            nodo temp = inicio;
            while (temp.getSiguiente() != inicio) {
                System.out.print(temp.getDato() + "   ");

                temp = temp.getSiguiente();
            }
            System.out.println(temp.getDato());
        }
    }

    public void mostarAdelante(int vueltas) {
        if (!estaVacia()) {
            nodo temp = inicio;
            int contador = 0;
            while (contador < vueltas)
                if (temp.getSiguiente() == inicio) {
                    contador++;
                }
            System.out.println(temp.getDato() + "   ");
            temp = temp.getSiguiente();
        }
    }

    public void mostarAtras(int vueltas) {
        if (!estaVacia()) {
            nodo temp = inicio.getAnterior();
            int contador = 0;
            while (contador < vueltas) {
                if (temp.getAnterior() == inicio) {
                    contador++;
                }
                System.out.println(temp.getDato() + "   ");
                temp = temp.getAnterior();
            }
            System.out.println(temp.getDato());
        }
    }
}
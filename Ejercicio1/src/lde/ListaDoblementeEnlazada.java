package lde;
    public class ListaDoblementeEnlazada {
        Nodo inicio;
        public ListaDoblementeEnlazada(){
            inicio = null;
        }
        public boolean estaVacia(){
            return inicio == null;
        }
        public void insertar(Object dato){
            if (estaVacia()){
                Nodo nuevo = new Nodo(null,dato,null);
                inicio = nuevo;
            }else{
                Nodo nuevo = new Nodo(null, dato, inicio);
                inicio.setAnterior(nuevo);
                inicio = nuevo;
            }
        }
        public void eliminar(){
            if (!estaVacia()){
                if (inicio.getSiguiente() == null){
                    inicio = inicio.getSiguiente();
                } else {
                    inicio = inicio.getSiguiente();
                    inicio.setAnterior(null);
                }
            }
        }
        public void MostrarAdelante(){
            if (!estaVacia()){
                Nodo temp = inicio;
                while (temp != null){
                    System.out.print(temp.getDato()+"  ");

                    temp = temp.getSiguiente();
                }
            }
            System.out.println();
        }
        public void MostrarAtras(){
            if (!estaVacia()){
                Nodo ultimo = inicio;
                while (ultimo.getSiguiente() != null){
                    ultimo = ultimo.getSiguiente();
                }
                Nodo temp = ultimo;
                while (temp != null){
                    System.out.print(temp.getDato()+"  ");

                    temp = temp.getAnterior();
                }
            }
        }

    }


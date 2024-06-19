package listasenlacesimple;
public class ListaEnlaceSimple {
    NodoListaSimple inicio;//crea el puntero que apunta la lista
    
    public ListaEnlaceSimple(){
        this.inicio = null;//crea la lista vacia apuntada por inicio a null
        }
    
    public int CuentaElementos(){
        int acc = 0;
        NodoListaSimple recorre = inicio; 
        while (recorre != null) {
            acc += 1;
            recorre = recorre.getSiguiente();
            } 
        return acc;
        }
    
    public void InsertaInicio(int dato){
        NodoListaSimple n = new NodoListaSimple(dato);//crea el nodo apuntado por el puntero n
        n.setSiguiente(inicio); //el enlace del nodo apuntado por n apunta al puntero inicio
        inicio = n; //inicio apunta al nodo apuntado por n
        }

    public void InsertaFin(int dato){
        NodoListaSimple n = new NodoListaSimple(dato);//crea el nodo apuntado por el puntero n
        //revisamos si la lista esta vacia.de estarlo apuntamos inicio al nodo apuntado por n
        if (inicio == null){
            inicio = n;
            }
        else{
            //Si la lista no esta vacia, se debe generar un puntero para recorrer la lista hasta el final
            //nodo auxiliar para recorrer y se apunta al inicio
            NodoListaSimple recorre = inicio;
            //recorre la lista hasta que el puntero recorre este apuntando a un nodo que su siguiente esta apuntado a null
            while (recorre.getSiguiente() != null){
                recorre = recorre.getSiguiente();
                }
            //asigna el nodo a donde apunta recorre
            recorre.setSiguiente(n);
            }
        }    

        public void insertaPosicion(int dato, int pos){
            int pos_actual = 0;
            NodoListaSimple n = new NodoListaSimple(dato);//crea el nodo apuntado por el puntero n
            if (pos > CuentaElementos()){//si la posicion es mayor que la cantidad de lementos retorna mensaje
                System.out.println("La posicion no existe en la lista");
                }
            else{
                if (pos == 0){
                    InsertaInicio(dato);
                    }
                else{
                    NodoListaSimple recorre = inicio;
                    while ((recorre.getSiguiente() != null) && (pos_actual < pos-1)){
                        pos_actual++;
                        recorre = recorre.getSiguiente();
                        }
                    n.setSiguiente(recorre.getSiguiente());
                    recorre.setSiguiente(n);
                    }
                }
            }    
    
    public void imprimirLista() {
        //se crea un puntero recorre, que se apunta al nodo inicio quien apunta al inicio de la lista
        NodoListaSimple recorre = inicio; 
        //recorre la lista hasta que recorre este al final de la lista, en cada paso muestra la información
        while (recorre != null) {
            System.out.print(recorre.getDato() + " ");
            recorre = recorre.getSiguiente();
        }
        System.out.println();
    }
    public void EliminarPrimero(){
        inicio = inicio.getSiguiente(); //elimina el primero :v
        
    }
    public void Eliminar(int indice){
        int contador = 0;
        NodoListaSimple temp = inicio;
        while(contador < indice - 1){
            temp = temp.getSiguiente();
            contador++;

        }
        temp.setSiguiente(temp.getSiguiente().getSiguiente());
    }
    
    }

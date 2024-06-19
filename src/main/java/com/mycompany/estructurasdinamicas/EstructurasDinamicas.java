package com.mycompany.estructurasdinamicas;

import java.util.Scanner;
import java.util.Stack;

import listasenlacesimple.ListaEnlaceSimple;
import listaenlacedoble.ListaEnlaceDoble;
import colas.ImplementaCola;
import pilas.ImplementaPila;
import arbolesbinarios.ArbolBinario;
import arbolesbinarios.Dinosaurio;
// Xavier Soliz
// Michael Rafael

public class EstructurasDinamicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListaEnlaceSimple listaSimple = new ListaEnlaceSimple();
        ListaEnlaceDoble listaDoble = new ListaEnlaceDoble();
        ImplementaPila pila = new ImplementaPila();
        ImplementaCola cola = new ImplementaCola();
        ArbolBinario arbolBinario = new ArbolBinario();

        int opcion;

        do {
            System.out.println("\n*** Menú de Estructuras Dinámicas ***");
            System.out.println("1. Operaciones con Lista Enlace Simple");
            System.out.println("2. Operaciones con Lista Enlace Doble");
            System.out.println("3. Operaciones con Pila");
            System.out.println("4. Operaciones con Cola");
            System.out.println("5. Operaciones con Árbol Binario");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenuListaEnlaceSimple(listaSimple);
                    break;
                case 2:
                    mostrarMenuListaEnlaceDoble(listaDoble);
                    break;
                case 3:
                    mostrarMenuPila(pila);
                    break;
                case 4:
                    mostrarMenuCola(cola);
                    break;
                case 5:
                    mostrarMenuArbolBinario(arbolBinario);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);

    }

    private static void mostrarMenuListaEnlaceSimple(ListaEnlaceSimple lista) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Menu de Lista Enlace Simple ***");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Regresar al menu principal");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar: ");
                    int dato = scanner.nextInt();
                    lista.InsertaInicio(dato); // Ejemplo de inserción al inicio
                    break;
                case 2:
                    System.out.print("Ingrese la posición del elemento a eliminar: ");
                    int posicion = scanner.nextInt();
                    lista.Eliminar(posicion); // Ejemplo de eliminación por posición
                    break;
                case 3:
                    System.out.println("Lista actual:");
                    lista.imprimirLista();
                    break;
                case 4:
                    System.out.println("Regresando al menu principal...");
                    break;
                default:
                    System.out.println("Opcion no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 4);

    }

    private static void mostrarMenuListaEnlaceDoble(ListaEnlaceDoble lista) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Menu de Lista Enlace Doble ***");
            System.out.println("1. Insertar elemento al inicio");
            System.out.println("2. Eliminar ultimo Elemento");
            System.out.println("3. Mostrar lista");
            System.out.println("4. eliminar elemento al final");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar: ");
                    int dato = scanner.nextInt();
                    lista.InsertaInicio(dato); // Ejemplo de inserción al inicio
                    break;
                case 2:
                    System.out.print("Se eliminara el ultimo elemento");
                    lista.eliminarUltimo(); 
                    break;
                case 3:
                    System.out.println("Lista actual:");
                    lista.imprimirListaInicioFin();
                    break;
                case 4:
                    System.out.print("Se eliminara el primer elemento");
                    lista.eliminarPrimero();
                    break;
                    
                case 5:
                    System.out.println("Regresando al menu principal...");
                    break;

                default:
                    System.out.println("Opcion no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

    }

    private static void mostrarMenuPila(ImplementaPila pila) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Menu de pila ***");
            System.out.println("1. Insertar elemento al inicio");
            System.out.println("2. Mostrar el primer elemento");
            System.out.println("3. Mostrar Pila");
            System.out.println("4. eliminar elemento");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar: ");
                    int dato = scanner.nextInt();
                    pila.AgregaElemento(dato);
                    ; 
                    break;
                case 2:
                    System.out.print("muestra el elemento mas arriba");
                    pila.MuestraElementoArriba();
                    break;
                case 3:
                    System.out.println("Pila actual:");
                    pila.MuestraPila();
                    break;
                case 4:
                    System.out.print("Se eliminara el primer elemento");
                    pila.EliminaElemento();
                    break;
                    
                case 5:
                    System.out.println("Regresando al menu principal...");
                    break;

                default:
                    System.out.println("Opcion no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }

    private static void mostrarMenuCola(ImplementaCola cola) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Menu de Cola ***");
            System.out.println("1. Insertar elemento al inicio");
            System.out.println("2. Mostrar el primer elemento");
            System.out.println("3. Mostrar Pila");
            System.out.println("4. eliminar elemento");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar: ");
                    int dato = scanner.nextInt();
                    cola.AgregaElemento(dato);
                    ; 
                    break;
                case 2:
                    System.out.print("muestra el elemento mas arriba");
                    cola.MuestraPrimerElemento();
                    break;
                case 3:
                    System.out.println("Cola actual:");
                    cola.MuestraCola();
                    break;
                case 4:
                    System.out.print("Se eliminara el primer elemento");
                    int dato2 = scanner.nextInt();
                    cola.EliminarElemento(dato2);
                    break;
                    
                case 5:
                    System.out.println("Regresando al menu principal...");
                    break;

                default:
                    System.out.println("Opcion no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);
        
    }

    private static void mostrarMenuArbolBinario(ArbolBinario arbol) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n*** Menu de Arbol ***");
            System.out.println("1. Mostrar albor estatico");
            System.out.println("2. Hombre caminando");
            System.out.println("3. salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("ejemplo arbol binario ");
                    arbol.Arbolestatico();
                    ; 
                    break;
                case 2:
                    System.out.print("muestra el elemento mas arriba");
                    try {
                        Dinosaurio.imprimirDinosaurio();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("Saliendo");
                    opcion = 3;
                    break;

                default:
                    System.out.println("Opcion no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 3);
        
    }
}


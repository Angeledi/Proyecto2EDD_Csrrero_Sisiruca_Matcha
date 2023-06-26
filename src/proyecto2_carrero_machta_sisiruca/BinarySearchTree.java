/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_carrero_machta_sisiruca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author sisir
 */
public class BinarySearchTree {
    private NodoTree raiz;

    public BinarySearchTree() {
        this.raiz = null;
    }

    public NodoTree getRaiz() {
        return raiz;
    }

    public void insertar(Client dato) {
        NodoTree nuevoNodo = new NodoTree(dato);

        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            NodoTree nodoActual = raiz;
            NodoTree padre;

            while (true) {
                padre = nodoActual;

                if (dato.getRoomNumber() < nodoActual.getCliente().getRoomNumber()) {
                    nodoActual = nodoActual.getIzquierdo();

                    if (nodoActual == null) {
                        padre.setIzquierdo(nuevoNodo);
                        return;
                    }
                } else {
                    nodoActual = nodoActual.getDerecho();

                    if (nodoActual == null) {
                        padre.setDerecho(nuevoNodo);
                        return;
                    }
                }
            }
        }
    }

    public void printHistoryRoom(int numHabitacion) {
        NodoTree nodoClient = raiz;
        int count = 0;

        while (nodoClient != null) {
            if (nodoClient.getCliente().getRoomNumber() == numHabitacion) {
                count ++;
                System.out.println("\nCliente n."+count);
                System.out.println("Nombre: " + nodoClient.getCliente().getFirstName() + " " + nodoClient.getCliente().getLastName());
                System.out.println("Cedula: " + nodoClient.getCliente().getDni());
                System.out.println("Email: " + nodoClient.getCliente().getEmail());
                System.out.println("Genero: "+nodoClient.getCliente().getGender());
                System.out.println("Fecha de llegada: "+nodoClient.getCliente().getCheckIn());
                
            }

            if (numHabitacion < nodoClient.getCliente().getRoomNumber()) {
                nodoClient = nodoClient.getIzquierdo();
            } else {
                nodoClient = nodoClient.getDerecho();
            }
        }
    }
}

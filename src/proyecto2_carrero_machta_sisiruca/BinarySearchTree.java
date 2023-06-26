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

    public void printHistoryRoom(int numHabitacion, StringBuilder sb) {
        NodoTree nodoClient = raiz;
        int count = 0;

        while (nodoClient != null) {
            if (nodoClient.getCliente().getRoomNumber() == numHabitacion) {
                count ++;
                sb.append("\nCliente n.").append(count).append("\n");
                sb.append("Nombre: ").append(nodoClient.getCliente().getFirstName()).append(" ").append(nodoClient.getCliente().getLastName()).append("\n");
                sb.append("Cedula: ").append(nodoClient.getCliente().getDni()).append("\n");
                sb.append("Email: ").append(nodoClient.getCliente().getEmail()).append("\n");
                sb.append("Genero: ").append(nodoClient.getCliente().getGender()).append("\n");
                sb.append("Fecha de llegada: ").append(nodoClient.getCliente().getCheckIn()).append("\n");
            }

            if (numHabitacion < nodoClient.getCliente().getRoomNumber()) {
                nodoClient = nodoClient.getIzquierdo();
            } else {
                nodoClient = nodoClient.getDerecho();
            }
        }
    }
}

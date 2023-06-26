/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_carrero_machta_sisiruca;

/**
 *
 * @author sisir
 */
public class BinarySearchTree {
    private NodoTree raiz;

    public BinarySearchTree() {
        raiz = null;
    }

    public void insertar(Client cliente) {
        raiz = insertClient(raiz, cliente);
    }

    public NodoTree insertClient(NodoTree raiz, Client cliente) {
        if (raiz == null) {
            return new NodoTree(cliente.getRoomNumber(), cliente);
        }

        if (cliente.getRoomNumber() < raiz.getClave()) {
            raiz.setIzquierdo(insertClient(raiz.getIzquierdo(), cliente));
        } else if (cliente.getRoomNumber() > raiz.getClave()) {
            raiz.setDerecho(insertClient(raiz.getDerecho(), cliente));
        }

        return raiz;
    }

    public void buscar(int numHabitacion) {
        searchClient(raiz, numHabitacion);
    }

    public void searchClient(NodoTree raiz, int numHabitacion) {
        if (raiz == null) {
            return;
        }

        if (numHabitacion < raiz.getClave()) {
            searchClient(raiz.getIzquierdo(), numHabitacion);
        } else if (numHabitacion > raiz.getClave()) {
            searchClient(raiz.getDerecho(), numHabitacion);
        } else {
            imprimirClientes(raiz.getCliente());
        }
    }

    public void imprimirClientes(Client cliente) {
        System.out.println("Cliente: " + cliente.getFirstName() + " " + cliente.getLastName());
        System.out.println("Cedula: " + cliente.getDni());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Género: " + cliente.getGender());
        System.out.println("Fecha de entrada: " + cliente.getCheckIn());
        System.out.println();
    }
}

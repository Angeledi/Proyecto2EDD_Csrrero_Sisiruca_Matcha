/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_carrero_machta_sisiruca;

/**
 *
 * @author sisir
 */
class NodoTree {
    private int clave;
    private Client cliente;
    private NodoTree izquierdo;
    private NodoTree derecho;

    public NodoTree(int clave, Client cliente) {
        this.clave = clave;
        this.cliente = cliente;
        this.izquierdo = null;
        this.derecho = null;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public NodoTree getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoTree izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoTree getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoTree derecho) {
        this.derecho = derecho;
    }
    
    
}
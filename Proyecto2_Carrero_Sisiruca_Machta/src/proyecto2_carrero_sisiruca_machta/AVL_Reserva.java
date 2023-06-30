/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_carrero_sisiruca_machta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author acarr
 */
public class AVL_Reserva {
    private NodoReserva raiz;
    
    public AVL_Reserva(){
        this.raiz = null;
    }

    public NodoReserva getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoReserva raiz) {
        this.raiz = raiz;
    }
    
    public boolean isEmpty() {
        return getRaiz() == null;
    }
    
    
    public Reserva buscar(int cedula) {
        NodoReserva nodoActual = raiz;
        
        while (nodoActual != null) {
            if (cedula < nodoActual.getReserva().getCedula()) {
                nodoActual = nodoActual.getIzquierdo();
            } else if (cedula > nodoActual.getReserva().getCedula()) {
                nodoActual = nodoActual.getDerecho();
            } else {
                return nodoActual.getReserva();
            }
        }
        return null;
    }
    
    public void initABB_Reserva(){
        AVL_Reserva Reservas = new AVL_Reserva();
        String line;
        String clientes_txt = "";
        String path = "test\\reservas.txt";
        File file = new File(path);
   
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    clientes_txt += line + "\n";
                }
            }
            if (!"".equals(clientes_txt)) {
                String[] clientes_split = clientes_txt.split("\n");

                for (int i = 1; i < clientes_split.length; i++) {
                        String[] Cliente = clientes_split[i].split(",");
                        
                        int cedula = Integer.parseInt(Cliente[0].replace(".",""));
                        String primer_nombre = Cliente[1];
                        String apellido = Cliente[2];
                        String email = Cliente[3];
                        String genero = Cliente[4];
                        String tipo_hab = Cliente[5];
                        String celular = Cliente[6];
                        String[] llegada_aux = Cliente[7].split("/");
                        int[] llegada = new int[]{Integer.parseInt(llegada_aux[0]),Integer.parseInt(llegada_aux[1]),Integer.parseInt(llegada_aux[2])};
                        String[] salida_aux = Cliente[8].split("/");
                        int[] salida = new int[]{Integer.parseInt(salida_aux[0]),Integer.parseInt(salida_aux[1]),Integer.parseInt(salida_aux[2])};
         
                        Reserva nuevo_cliente = new Reserva(cedula, primer_nombre, apellido, email, genero, tipo_hab, celular, llegada, salida);
                       
                      //  nuevo_cliente.printCliente();
                        agregar(nuevo_cliente);

                }               
            }
            br.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar base de Datos");
        }
    }
  
    public void preOrden(NodoReserva raiz) {
        if (raiz != null) {
            System.out.println("[ " + raiz.getReserva().getApellido() + " ]");
            preOrden(raiz.getIzquierdo());
            preOrden(raiz.getDerecho());
        }
    }
    
    public void preOrden_to_string(){}

    
    public void agregar(Reserva reservacion) {
        raiz = agregarRec(raiz, reservacion);
    }
    
    public Reserva buscar2(int cedula) {
        return buscarRec(raiz, cedula);
    }

    private NodoReserva agregarRec(NodoReserva nodo, Reserva reservacion) {
        if (nodo == null) {
            return new NodoReserva(reservacion);
        } else if (reservacion.getCedula() < nodo.getReserva().getCedula()) {
            nodo.setIzquierdo(agregarRec(nodo.getIzquierdo(), reservacion));
        } else {
            nodo.setDerecho(agregarRec(nodo.getDerecho(), reservacion));
        }
        
        int alturaIzquierdo = (nodo.getIzquierdo() != null) ? nodo.getIzquierdo().getAltura() : 0;
        int alturaDerecho = (nodo.getDerecho() != null) ? nodo.getDerecho().getAltura() : 0;
        
        int factorBalance = alturaIzquierdo - alturaDerecho;
        
        if (factorBalance > 1) {
            if (reservacion.getCedula() < nodo.getIzquierdo().getReserva().getCedula()) {
                nodo = rotacionDerecha(nodo);
            } else {
                nodo.setIzquierdo(rotacionIzquierda(nodo.getIzquierdo()));
                nodo = rotacionDerecha(nodo);
            }
        } else if (factorBalance < -1) {
            if (reservacion.getCedula() > nodo.getDerecho().getReserva().getCedula()) {
                nodo = rotacionIzquierda(nodo);
            } else {
                nodo.setDerecho(rotacionDerecha(nodo.getDerecho()));
                nodo = rotacionIzquierda(nodo);
            }
        }
        
        nodo.setAltura(Math.max(alturaIzquierdo, alturaDerecho) + 1);
       
        return nodo;
    }
    
    private Reserva buscarRec(NodoReserva nodo, int cedula) {
        if (nodo == null) {
            return null;
        } else if (nodo.getReserva().getCedula() == cedula) {
            return nodo.getReserva();
        } else if (cedula < nodo.getReserva().getCedula()) {
            return buscarRec(nodo.getIzquierdo(), cedula);
        } else {
            return buscarRec(nodo.getDerecho(), cedula);
        }
    }
    
    private NodoReserva rotacionIzquierda(NodoReserva nodo) {
        NodoReserva nuevoNodo = nodo.getDerecho();
        nodo.setDerecho(nuevoNodo.getIzquierdo());
        nuevoNodo.setIzquierdo(nodo);
        
        nodo.setAltura(Math.max((nodo.getIzquierdo() != null) ? nodo.getIzquierdo().getAltura() : 0,
                                (nodo.getDerecho() != null) ? nodo.getDerecho().getAltura() : 0) + 1);
        nuevoNodo.setAltura(Math.max(nodo.getAltura(),
                                     (nuevoNodo.getDerecho() != null) ? nuevoNodo.getDerecho().getAltura() : 0) + 1);
        
        return nuevoNodo;
    }
    
    private NodoReserva rotacionDerecha(NodoReserva nodo) {
        NodoReserva nuevoNodo = nodo.getIzquierdo();
        nodo.setIzquierdo(nuevoNodo.getDerecho());
        nuevoNodo.setDerecho(nodo);
        
        nodo.setAltura(Math.max((nodo.getIzquierdo() != null) ? nodo.getIzquierdo().getAltura() : 0,
                                (nodo.getDerecho() != null) ? nodo.getDerecho().getAltura() : 0) + 1);
        nuevoNodo.setAltura(Math.max(nodo.getAltura(),
                                     (nuevoNodo.getIzquierdo() != null) ? nuevoNodo.getIzquierdo().getAltura() : 0) + 1);
        
        return nuevoNodo;
    }
    
    public void eliminar(int cedula) {
    raiz = eliminarRec(raiz, cedula);
    }
    
    private NodoReserva eliminarRec(NodoReserva nodo, int cedula) {
    if (nodo == null) {
        return null;
    } else if (cedula < nodo.getReserva().getCedula()) {
        nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), cedula));
    } else if (cedula > nodo.getReserva().getCedula()) {
        nodo.setDerecho(eliminarRec(nodo.getDerecho(), cedula));
    } else {
        if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) { // Caso 1: el nodo no tiene hijos
            return null;
        } else if (nodo.getIzquierdo() == null || nodo.getDerecho() == null) { // Caso 2: el nodo tiene un hijo
            NodoReserva nuevoNodo = (nodo.getIzquierdo() != null) ? nodo.getIzquierdo() : nodo.getDerecho();
            nodo.setReserva(nuevoNodo.getReserva());
            nodo.setIzquierdo(nuevoNodo.getIzquierdo());
            nodo.setDerecho(nuevoNodo.getDerecho());
        } else { // Caso 3: el nodo tiene dos hijos
            NodoReserva sucesor = sucesorInmediato(nodo.getDerecho());
            nodo.setReserva(sucesor.getReserva());
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), sucesor.getReserva().getCedula()));
        }
    }

    if (nodo != null) {
        int alturaIzquierdo = (nodo.getIzquierdo() != null) ? nodo.getIzquierdo().getAltura() : 0;
        int alturaDerecho = (nodo.getDerecho() != null) ? nodo.getDerecho().getAltura() : 0;
        int factorBalance = alturaIzquierdo - alturaDerecho;

        if (factorBalance > 1) { // Desbalance hacia la izquierda
            if (nodo.getIzquierdo().getDerecho() != null && (nodo.getIzquierdo().getDerecho()).getAltura() > (nodo.getIzquierdo().getIzquierdo() != null ? nodo.getIzquierdo().getIzquierdo().getAltura() : 0)) {
                nodo.setIzquierdo(rotacionIzquierda(nodo.getIzquierdo()));
            }
            nodo = rotacionDerecha(nodo);
        } else if (factorBalance < -1) { // Desbalance hacia la derecha
            if (nodo.getDerecho().getIzquierdo() != null && (nodo.getDerecho().getIzquierdo()).getAltura() > (nodo.getDerecho().getDerecho() != null ? nodo.getDerecho().getDerecho().getAltura() : 0)) {
                nodo.setDerecho(rotacionDerecha(nodo.getDerecho().getDerecho()));
            }
            nodo = rotacionIzquierda(nodo);
        }

        // Actualizar altura
        alturaIzquierdo = (nodo.getIzquierdo() != null) ? nodo.getIzquierdo().getAltura() : 0;
        alturaDerecho = (nodo.getDerecho() != null) ? nodo.getDerecho().getAltura() : 0;
        nodo.setAltura(Math.max(alturaIzquierdo, alturaDerecho) + 1);
    }

    return nodo;
}

private NodoReserva sucesorInmediato(NodoReserva nodo) {
    while (nodo.getIzquierdo() != null) {
        nodo = nodo.getIzquierdo();
    }
    return nodo;
}

public String reservasToString() {
    return reservasToString(raiz, "");
}

private String reservasToString(NodoReserva nodo, String cadena) {
    if (nodo == null) {
        return cadena;
    }

    cadena = reservasToString(nodo.getIzquierdo(), cadena);
    cadena += nodo.getReserva().printCliente()+ "\n";
    cadena = reservasToString(nodo.getDerecho(), cadena);

    return cadena;
}


//Cabe destacar que esta implementación utiliza un enfoque de inserción recursivo que mantiene el árbol balanceado mediante las rotaciones AVL, lo que garantiza que la búsqueda tenga una complejidad temporal de O(log N). Además, el método `buscar` también utiliza una búsqueda recursiva que recorre el árbol de forma eficiente para encontrar la reserva correspondiente a la cédula del cliente.
    
}
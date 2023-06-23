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
public class HashTableReserva {
    private Reserva[] array_reservas;
    private int size;
    
    public HashTableReserva(){
        this.size = 2000;
        this.array_reservas = new Reserva[size];
    }

    public Reserva[] getArray_reservas() {
        return array_reservas;
    }

    public void setArray_reservas(Reserva[] array_reservas) {
        this.array_reservas = array_reservas;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int hashFunction(Reserva cliente){
        String cliente_nom = cliente.getNombre()+cliente.getApellido();
        int index = 0;
        for (int i = 0; i < cliente_nom.length(); i++) {
            int contador = cliente_nom.codePointAt(i);
            index += cliente_nom.codePointAt(i);
            index = index + (contador * i);
        }
        index = index % this.getSize();
        return index;
    }
    
    public int hashFunctionString(String nombre_apellido){
        String cliente_nom = nombre_apellido;
        int index = 0;
        for (int i = 0; i < cliente_nom.length(); i++) {
            int contador = cliente_nom.codePointAt(i);
            index += cliente_nom.codePointAt(i);
            index = index + (contador * i);
        }
        index = index % this.getSize();
        return index;
    }
    
    public int hashFunction2(Reserva c){
        int hash = 0;
        int p = 31;
        int m = 1000000009;
        String str = c.getNombre();
        System.out.println(str);
        for (int i = 0; i < str.length() ; i++) {
            hash = (int)((hash + (long)Math.pow(p, i) * str.charAt(i)) % m);
        }
    return hash % getSize();
    }
    public int hashFunction3(Reserva c) {
        String s = c.getNombre();
        int hashValue = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char d = s.charAt(i);
            hashValue = (hashValue * 31 + d) % getSize();
        }
        return hashValue;
    }
    public boolean isInHash(Reserva c){
        boolean aux = false;
        for (int i = 0; i < this.getArray_reservas().length; i++) {
            if ( getArray_reservas()[i] != null){
                if ( getArray_reservas()[i].getNombre() == c.getNombre() && getArray_reservas()[i].getApellido() == c.getApellido()){
                    aux = true;
                }
            }
        }
        return aux;
    }
    public void initHashTable(){
        HashTableReserva aux = new HashTableReserva(); // revisar 
        String line;
        String clientes_txt = "";
        String path = "test\\Clientes.txt";
        File file = new File(path);
     //   int[] contador = new int[size]; // estos contadores sirven para probar cuantas colisiones ocurren y ver cual tipo de hash function es mas util
     //   int[] contador2 = new int[size];
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
                        int index1 = hashFunction(nuevo_cliente);
                        //contador[index1] += 1;
                        
                        //insertCliente(nuevo_cliente, index1);
                        insertReserva(nuevo_cliente, index1);
                        
//                        int index2 = hashFunction2(nuevo_cliente);
//                        contador2[index2] += 1;
//                        
//                        System.out.print("v1 "+ index1+ " veces repetido: "+ contador[index1]+" ");
//                        nuevo_cliente.printCliente();
//                        System.out.print("v2 "+ index2+ " veces repetido: "+ contador2[index2]+" ");
//                        nuevo_cliente.printCliente();
                }
//                int veces1 = 0;
//                int veces2 = 0;
//                for (int i = 0; i < size; i++) {
//                    if (contador[i] > 1){
//                    veces1++;
//                    }
//                }
//                for (int i = 0; i < size; i++) {
//                    if (contador2[i] > 1){
//                    veces2++;
//                    }
//                }
//                System.out.println("num valores Veces repetido con hash1: "+veces1);
//                System.out.println("num valores Veces repetido con hash2: "+veces2);
            }
            br.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar base de Datos");
        }
    }
        
    public void insertCliente(Reserva c, int index){
        if (!isInHash(c)) {
            while ( getArray_reservas()[index] != null) {
                index++;
            }
           // JOptionPane.showMessageDialog(null, "La clave del cliente reservado es " + c.getNombre()+" "+c.getApellido()+ " es: " + index);
            getArray_reservas()[index] = c;
        } else{
            JOptionPane.showMessageDialog(null, "¡ERROR!\nEl documento ya está registrado");
        }
    }
    
    public void insertReserva(Reserva cliente, int index) {
        
        if (this.array_reservas[index] == null) {
            this.array_reservas[index] = cliente;
        } else {
            Reserva pointer = array_reservas[index];
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(cliente);
        }
    }
    
    public Reserva getReserva(String nombre, String apellido) {
        int index = hashFunctionString(nombre+apellido);
        Reserva pointer = array_reservas[index];
        while (pointer != null) {
            if (pointer.getNombre().equals(nombre) && pointer.getApellido().equals(apellido)) {
                return pointer;
            }
            pointer = pointer.getNext();
        }
        return null;
    }
     
}

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
public class ListaHabitacion {
    private Habitacion headpiso;
  
    private int num_habitaciones;
    
    public ListaHabitacion(){
        this.headpiso = null;
        this.num_habitaciones = 0;
    }

    public Habitacion getHeadpiso() {
        return headpiso;
    }

    public void setHeadpiso(Habitacion headpiso) {
        this.headpiso = headpiso;
    }

    public int getNum_habitaciones() {
        return num_habitaciones;
    }

    public void setNum_habitaciones(int num_habitaciones) {
        this.num_habitaciones = num_habitaciones;
    }
    
    
    
    public void initlistaHabitaciones(){
        String line;
        String habitaciones_txt = "";
        String path = "test\\habitaciones.txt";
        File file = new File(path);
   
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    habitaciones_txt += line + "\n";
                }
            }
            if (!"".equals(habitaciones_txt)) {
                String[] habitaciones_split = habitaciones_txt.split("\n");

                for (int i = 1; i < habitaciones_split.length; i++) {
                        String[] habitacion = habitaciones_split[i].split(",");
                        
                        int num = Integer.parseInt(habitacion[0]);
                        String tipo_habitacion = habitacion[1];
                        int piso = Integer.parseInt(habitacion[2]);
                        
                        Habitacion nueva_habitacion = new Habitacion(num, tipo_habitacion, piso);
                        agregar_habitacion(nueva_habitacion);
                        

                }               
            }
            br.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar base de Datos");
        }
        
        
    }
    
    public void agregar_habitacion(Habitacion valor) {
        if (headpiso == null) {
            headpiso = valor;
        } else {
            Habitacion pointer = getHeadpiso();
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(valor);
        }
    }
    
    public void add_client_to_hab(HashTableEstadoActual estado){
        Habitacion pointer = getHeadpiso();
        while (pointer != null) {
            for (int i =0; i < estado.getSize() ; i++){
                if (estado.getArray_reservas()[i] != null){
                    Estado pointer2 = estado.getArray_reservas()[i];
                    while (pointer2 != null) {
                        int num = pointer2.getNum_habitacion();
                        if (pointer2.getNum_habitacion() == pointer.getNum()){
                            pointer.setCliente_actual(pointer2);
                        }
                        pointer2 = pointer2.getNext();
                    }
                }
            }
            pointer = pointer.getNext();
        }
    }
    
    public int buscar_habitacion(String tipo_hab){
        Habitacion pointer = getHeadpiso();
        int new_hab = 0;
        while (pointer != null){
            if (pointer.getCliente_actual() == null & pointer.getTipo().equals(tipo_hab)){
                new_hab = pointer.getNum();
                return new_hab;
            }
            pointer = pointer.getNext();
        }
        
        
        return new_hab;
    }
        
    public void actualizarestadoHab(int numero_hab, Estado cliente_actual){
        Habitacion pointer = getHeadpiso();
        
        while (pointer != null){
            if (pointer.getNum() == numero_hab){
                pointer.setCliente_actual(cliente_actual);
               
            }
            pointer = pointer.getNext();
        }
         
    }
    
    public void desocuparHabitacion(int numero_hab){
        Habitacion pointer = getHeadpiso();
        
        while (pointer != null){
            if (pointer.getNum() == numero_hab){
                pointer.setCliente_actual(null);
               
            }
            pointer = pointer.getNext();
        }
         
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        BinarySearchTree bst = new BinarySearchTree();
        try {
           InputStream inputStream = Menu.class.getResourceAsStream("RoomHistory.txt");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String linea;
                
                while ((linea = br.readLine()) != null) {
                    String[] datos = linea.split(",");
                    String dni = datos[0].trim();
                    String firstName = datos[1].trim();
                    String lastName = datos[2].trim();
                    String email = datos[3].trim();
                    String gender = datos[4].trim();
                    String checkIn = datos[5].trim();
                    int roomNumber = Integer.parseInt(datos[6].trim());
                    
                    Client cliente = new Client(dni, firstName, lastName, email, gender, checkIn, roomNumber);
                    bst.insertar(cliente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        int numHabitacion = 32;
        System.out.println("Clientes que se hospedaron en la habitación " + numHabitacion + ":");
        bst.buscar(numHabitacion);
    }
    
}

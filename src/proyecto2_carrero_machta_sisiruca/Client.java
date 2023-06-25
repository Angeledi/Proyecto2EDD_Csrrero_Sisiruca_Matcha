/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2_carrero_machta_sisiruca;

/**
 *
 * @author sisir
 */
class Client {
    private String dni;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String checkIn;
    private int roomNumber;

    public Client(String dni, String firstName, String lastName, String email, String gender, String checkIn, int roomNumber) {
        this.dni = dni;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.checkIn = checkIn;
        this.roomNumber = roomNumber;
    }

    public String getDni() {
        return dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
        
}
    

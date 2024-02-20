/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author flavi
 */
public class Cliente extends PersonaEmpresa {

    public Cliente(String firstName, String lastname, String email, String documentType, String documentNumber, String cellphoneNumber, String password, String gender) {
        super(firstName, lastname, email, documentType, documentNumber, cellphoneNumber, password, gender);
    }

    public Cliente(String documentNumber, String password) {
        super("", "", "", "", documentNumber, "", password, "");
    }

    public Cliente(String firstName, String lastname, String documentNumber) {
        super(firstName, lastname, "", "", documentNumber, "", "", "");
    }

}

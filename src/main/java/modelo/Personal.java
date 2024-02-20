/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author flavi
 */
public class Personal extends PersonaEmpresa {

    private String personalType = "Vendedor";

    public Personal(String firstName, String lastname, String email, String documentType, String documentNumber, String cellphoneNumber, String password, String gender) {
        super(firstName, lastname, email, documentType, documentNumber, cellphoneNumber, password, gender);
    }

    public Personal(String documentNumber, String password) {
        super("", "", "", "", documentNumber, "", password, "");
    }

    public String getPersonalType() {
        return personalType;
    }

    public void setPersonalType(String personalType) {
        this.personalType = personalType;
    }

}

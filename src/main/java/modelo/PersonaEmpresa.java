/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class PersonaEmpresa {

    protected String firstName;
    protected String lastname;
    protected String email;
    protected String documentType;
    protected String documentNumber;
    protected String cellphoneNumber;
    protected String password;
    protected String gender;
  
}

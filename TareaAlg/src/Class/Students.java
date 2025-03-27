/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Enumeradores.Documents;

/**
 *
 * @author ASUS
 */
public class Students {
     private String nombre;
    private String apellido;
    private Documents documento;
    private Notes nota[];

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Documents getDocumento() {
        return documento;
    }

    public void setDocumento(Documents documento) {
        this.documento = documento;
    }
    
    /*public Notes getNota(){
        return nota;
    }*/
}

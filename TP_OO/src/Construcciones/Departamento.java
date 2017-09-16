/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construcciones;
    

/**
 *
 * @author Wences
 */
public class Departamento {
    public byte piso;
    public char dpto;
    public int superficie;
    public PH esDe;
    

    public Departamento(byte piso, char dpto, int superficie, PH edDe) {
        this.piso = piso;
        this.dpto = dpto;
        this.superficie = superficie;
        this.esDe = esDe;
        esDe.agregarDepto(this);
    }
    
}

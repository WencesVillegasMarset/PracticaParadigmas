package Inmuebles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wences
 */
public class Escritura {
    public  final Integer numero;
    public final int superficie;
    private String domicilio;
    public Lote esDe;
    
    
    public Escritura(Integer numero, int superficie, String domicilio, Lote esDeLote){
        this.numero = numero;
        this.superficie = superficie;
        this.domicilio = domicilio;
        this.esDe = esDeLote;
        esDeLote.agregarEscritura(this);
    }
    public Escritura copia(){
        Escritura nuevaCopia = new Escritura(numero, superficie, domicilio, esDe);
        return nuevaCopia;
    }
    public Integer getNumero() {
        return numero;
    }

    

    public int getSuperficie() {
        return superficie;
    }

    

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public void showObject(){
      
       System.out.println("Datos>> numero = " + numero + ", superficie = " + superficie + "y domicilio = " + domicilio);
    }
    

}

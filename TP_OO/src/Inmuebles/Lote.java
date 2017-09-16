package Inmuebles;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wences
 */
public class Lote implements Cloneable, Serializable {
    public final Integer idPadron;
    private String Domicilio;
    private float avaluoXmt;
    public final int superficie;
    public Registro inscripto;
    public Escritura pertenece;
    private Edificio construccion;

    // exception catcher
    @Override
    public Object clone() throws CloneNotSupportedException{
        Object obj = null;
        try {
            obj = super.clone(); //creo una referencia de la interfaz cloneable
            
        } catch (CloneNotSupportedException e) {
            System.out.println("Imposible Duplicar");
        }
        return obj;
    }
    public Lote(Integer idPadron, String domicilio, float avaluoXmt, int superficie){
        this.Domicilio= domicilio;
        this.avaluoXmt = avaluoXmt;
        this.idPadron = idPadron;
        this.superficie = superficie;
    }
    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public float getAvaluoXmt() {
        return avaluoXmt;
    }

    public void setAvaluoXmt(float avaluoXmt) {
        this.avaluoXmt = avaluoXmt;
    }

    public Integer getIdPadron() {
        return idPadron;
    }

    public int getSuperficie() {
        return superficie;
    }
    private double calcula(){
        double resultado = avaluoXmt * superficie;
        return resultado;
    }
    public double valuar(){
        double valuacion = calcula();
        return valuacion;
    }
    public void mostrar(){
        System.out.println("IDPadron: " + idPadron);
        System.out.println("domicilio: " + Domicilio);
        System.out.println("Avaluo por metro: " + avaluoXmt);
        System.out.println("Superficie: " + superficie);

    }
    public void setInscripto(Registro registroAGuardar){
        this.inscripto = registroAGuardar;
        //registroAGuardar.registrar(this);
    }
    public void agregarEscritura(Escritura escritura){
        this.pertenece = escritura;
    }    
    
    public void setConstruccion(Edificio edificio)throws ErrorLote{
        if (this.construccion == null) {
            this.construccion = edificio;
        }
        else {
            throw new ErrorLote();
        }
                
    }
}

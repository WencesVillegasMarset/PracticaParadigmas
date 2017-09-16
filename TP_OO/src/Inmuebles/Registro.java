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
public class Registro implements Serializable{
    public final float coefAvaluoEdificio;
    public final String municipio;
    private float tasa;
    public Lote inmueble[];
    public static float coeficienteAvaluoEdificio;
    static{
        coeficienteAvaluoEdificio = 1.5f;
    }
    

    public Registro(float coefAvaluoEdificio, String municipio, float tasa, int cantidadLotes) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
        this.municipio = municipio;
        this.tasa = tasa;
        this.inmueble = new Lote[cantidadLotes];        
    }
    public void emitirBoletos(){
        for (int i = 0; i < inmueble.length; i++) {
            System.out.println("Datos Lote N°" + i);
            inmueble[i].mostrar();
        }
    }
    public void registrar(Lote lote){
        for (int i = 0; i < inmueble.length; i++) {
            if (inmueble[i] == null) {
                inmueble[i] = lote;
                lote.setInscripto(this);
                break;
            }
        }
        
    }
    public double valuar(){
        double acum = 0;

        for (Lote inmueble1 : inmueble) {
            acum += inmueble1.valuar();
        }
        return acum;
    }
    

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    
    
    
}

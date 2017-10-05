package Inmuebles;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Wences
 */
public abstract class Edificio {
    protected float avaluoXMetro;
    private Lote construccion;

    public Lote getConstruccion() {
        return construccion;
    }

    public void setConstruccion(Lote construccion) {
        this.construccion = construccion;
    }
    

    protected abstract double valuar();
    
    public float getAvaluoXMetro() {
        return avaluoXMetro;
    }
    
    public void setAvaluoXMetro(float avaluoXMetro) {
        this.avaluoXMetro = avaluoXMetro;
    }
    protected void demoler(){
        try {
            construccion.setConstruccion(null);
        } catch (ErrorLote ex) {
            Logger.getLogger(Edificio.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.construccion = null;
    }
    
    // constructor
    
    
}

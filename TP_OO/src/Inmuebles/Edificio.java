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
public abstract class Edificio {
    protected float avaluoXMetro;
    private Lote construccion;
    

    protected abstract double valuar();
    
    public float getAvaluoXMetro() {
        return avaluoXMetro;
    }
    
    public void setAvaluoXMetro(float avaluoXMetro) {
        this.avaluoXMetro = avaluoXMetro;
    }
    protected abstract void demoler();
    
    // constructor
    
    
}

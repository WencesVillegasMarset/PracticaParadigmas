package Construcciones;
import Inmuebles.Edificio;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wences
 */
public class Casa extends Edificio {
    private final boolean plantaAlta;
    private final int superficie;
    public Casa(int superficie, boolean plantaAlta){
        this.plantaAlta = plantaAlta;
        this.superficie = superficie;
    }
    
    @Override
    public double valuar(){
        double valor = 0;
        
        return valor;
    }
}

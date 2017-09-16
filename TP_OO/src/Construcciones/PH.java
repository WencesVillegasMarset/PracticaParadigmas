package Construcciones;

import Inmuebles.Edificio;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wences
 */
public  class PH extends Edificio{
    public byte cantPisos;
    public ArrayList<Departamento> unidad;
    
    @Override
    public void demoler(){
        System.out.println("Demolido?");
    }
    @Override
    public double valuar(){
        double temp = 0;
        return temp;
        
    }
    public void agregarDepto(Departamento depto){
        this.unidad.add(depto);
        
    }

    
   
}

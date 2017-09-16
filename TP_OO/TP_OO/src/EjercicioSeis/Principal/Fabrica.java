/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSeis.Principal;

import EjercicioSeis.Componentes.Chasis;
import EjercicioSeis.Vehiculos.Auto;
import EjercicioSeis.Vehiculos.Camion;
import EjercicioSeis.Vehiculos.Producto;

/**
 *
 * @author Wences
 */
public class Fabrica {
    public String nombre;
    private Producto pertence;
    
    
    public Fabrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPertence(Producto pertence) {
        this.pertence = pertence;
    }
    
    public Auto crear(Chasis c, Fabrica f){
        return new Auto();
    }
    public Camion crear(Fabrica f, Chasis c){
        return new Camion();
    }
    
    
}

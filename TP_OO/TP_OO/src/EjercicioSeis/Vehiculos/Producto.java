/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSeis.Vehiculos;

import EjercicioSeis.Componentes.Chasis;
import EjercicioSeis.Componentes.Motor;
import EjercicioSeis.Componentes.Rueda;
import EjercicioSeis.Principal.Fabrica;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Wences
 */
public abstract class Producto implements Vehiculo {
    protected float precio;
    public Fabrica construidoPor;
    
    //Hash para componentes
    public Map<String, Chasis> compuesto = new HashMap<>();
    public Map<String, Motor> impulsado = new HashMap<>();
    public Map<String, Rueda> usa = new HashMap<>();

    
    public void verDatos(){
        //muestra los datos vinculados al objeto(fabricante, precio, número demotor y chasis, marca de las ruedas que usa)
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Fabrica getConstruidoPor() {
        return construidoPor;
    }

    public void setConstruidoPor(Fabrica construidoPor) {
        this.construidoPor = construidoPor;
    }
    
}

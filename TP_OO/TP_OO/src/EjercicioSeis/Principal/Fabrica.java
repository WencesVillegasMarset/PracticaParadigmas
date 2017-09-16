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
import java.util.Scanner;

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
        return new Auto(c, f);
    }
    public Camion crear(Fabrica f, Chasis c){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la capacidad de Carga");
        int capCarga = input.nextInt();
        return new Camion(capCarga, c,f);
    }
    
    
}

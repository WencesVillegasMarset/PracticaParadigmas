/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSeis.Componentes;

import EjercicioSeis.Vehiculos.Producto;

/**
 *
 * @author Wences
 */
public class Chasis {
    public final String numero;
    private Producto pertence;

    public Producto getPertence() {
        return pertence;
    }

    public void setPertence(Producto pertence) {
        this.pertence = pertence;
    }

    public Chasis(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
    
    
}

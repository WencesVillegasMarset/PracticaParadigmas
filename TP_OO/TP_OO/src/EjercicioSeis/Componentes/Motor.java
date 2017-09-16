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
public class Motor {
    public String numero;
    private Producto instalado;
    public Motor(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public Producto getInstalado() {
        return instalado;
    }

    public void setInstalado(Producto instalado) {
        this.instalado = instalado;
    }
    
}

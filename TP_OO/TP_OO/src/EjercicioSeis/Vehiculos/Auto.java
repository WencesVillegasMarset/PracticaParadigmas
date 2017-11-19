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
import java.util.Scanner;

/**
 *
 * @author Wences
 */
public class Auto extends Producto{

    public Auto(Chasis chasis, Fabrica fabrica) {
        super(chasis, fabrica);
    }
    
    
    

    @Override
    public Motor getMotor() {
        return impulsado;
    }

    @Override
    public Chasis getChasis() {
        return compuesto;
    }

    @Override
    public String getRueda() {
        return usa.get(0).getMarca();
    }

    @Override
    public void ponerMotor(Motor motor) {
        impulsado = motor;
        
    }

    @Override
    public void ponerRueda(Rueda rueda) {
        usa.add(rueda);
    }
    
}

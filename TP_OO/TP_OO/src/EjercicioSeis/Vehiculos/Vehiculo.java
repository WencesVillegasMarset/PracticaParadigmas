/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioSeis.Vehiculos;

import EjercicioSeis.Componentes.Chasis;
import EjercicioSeis.Componentes.Motor;
import EjercicioSeis.Componentes.Rueda;

/**
 *
 * @author Wences
 */
public interface Vehiculo {
    public Motor getMotor();
    public Chasis getChasis();
    public String getRueda();
    public void ponerMotor(Motor motor);
    public void ponerRueda(Rueda rueda);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmuebles;

/**
 *
 * @author Wences
 */
public class ErrorLote extends Throwable{
    @Override
    public String getMessage(){
        String message = "Intento agregar mas de 1 Edificio a Lote";
        return message;
    }
}

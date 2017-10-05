package Inmuebles;
//composicion se da la relacion en el constructor 
//agregacion y asociociacion se hace por metodos de set

import Construcciones.Casa;
import Construcciones.PH;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wences
 */
public class TesterParaEjercicios {
    public static void main(String[] args) throws CloneNotSupportedException{
    
        System.out.println("TESTER EJERCICIOS");
        int ejercicio;
        do{
        System.out.println("Ingrese el numero de ejercicio desde el 1 al 8, con 0 termina la ejecucion ");
        Scanner input = new Scanner(System.in);
        ejercicio = input.nextInt();
        switch (ejercicio){
            case 0: break;
            
            case 1: ejercicioUno();
                    break;
            case 2: ejercicioDos();
                    break;
            case 3: ejercicioTres();
                    break;
            case 4: ejercicioCuatro();
                    break;
            case 5: ejercicioCinco();
                    break;
            case 6: ejercicioSeis();
                    break;
            case 7: ejercicioSiete();
                    break;
            case 8: ejercicioOcho();
                    break;
            }        
        }while(ejercicio != 0);
        
    }
    
    public static void ejercicioUno(){
        Lote sampleLote = new Lote(123, "San martin", 1234, 1);
        Escritura primerEscritura = new Escritura(1234, 44, "La Paz 416", sampleLote);
        primerEscritura.showObject();
        primerEscritura.getDomicilio();
        Escritura segundaEscritura = primerEscritura.copia();
        System.out.println("Mostrar copia de la primera, copiada con metodo");
        segundaEscritura.showObject();
    }
    public static void ejercicioDos() throws CloneNotSupportedException{
        Lote nuevoLote = new Lote(124, "San Martin 12", 134, 11);
        nuevoLote.mostrar();
        Lote segundoLote = (Lote) nuevoLote.clone();
        System.out.println("Mostrando copia del primero");
        System.out.println("Cambiando valores de atributos de copia");
        segundoLote.setAvaluoXmt(124511);
        segundoLote.setDomicilio("Nuevo Domicilio asnfu");
        segundoLote.mostrar();
    }
    public static void ejercicioTres(){
        System.out.println("Creando Lote con ID = 3, Domicilio: La Paz 416, avaluo x metro = 2 y 500 m de superficie");
        Lote primerLote = new Lote(2, "La Paz 416", 2, 500);
        System.out.println("Creando un regigistro para Lote...");
        Registro primerRegistro = new Registro(415, "Lujan de Cuyo", 234, 10);
        System.out.println("Vinculando lote con registro");
        primerRegistro.registrar(primerLote);
        System.out.println("Mostrando Lotes registrados por el primer registro");
        primerRegistro.emitirBoletos();
        System.out.println("Mostrando 1 si el primerLote se encuentra en primerRegistro sino muestra 0");
        if (primerRegistro.equals(primerLote.inscripto)) {
            System.out.println(1);
        } else {System.out.println(0);
        }
        System.out.println("Quiere serializar el registro? 1=SI / 0=NO");
        Scanner input = new Scanner(System.in);
        int condicion = input.nextInt();
        if (condicion == 1) {
            serializar(primerRegistro);
        } else{
            if (condicion == 0) {
                System.out.println("Saliendo sin serializar");
            } else {
                System.out.println("Opcion Invalida! Saliendo sin serializar.");
            }
        }
        
        
    }
    public static void ejercicioCuatro(){
        System.out.println("Creando Lote con ID = 3, Domicilio: La Paz 416, avaluo x metro = 2 y 500 m de superficie");
        Lote primerLote = new Lote(2, "La Paz 416", 2, 500);
        System.out.println("Creando un regigistro para Lote...");
        Registro primerRegistro = new Registro(415, "Lujan de Cuyo", 234, 10);
        System.out.println("Vinculando lote con registro");
        primerRegistro.registrar(primerLote);
        System.out.println("Mostrando Lotes registrados por el primer registro");
        primerRegistro.emitirBoletos();
        System.out.println("Mostrando 1 si el primerLote se encuentra en primerRegistro sino muestra 0");
        if (primerRegistro.equals(primerLote.inscripto)) {
            System.out.println(1);
        } else {System.out.println(0);
        }
        System.out.println("Creando una Casa en el Lote con id de domicilio:  " + primerLote.getDomicilio());
        Edificio primerCasa = new Casa(500, true);
        try {
            primerLote.setConstruccion(primerCasa);
        } catch (ErrorLote ex) {
            System.out.println("No permitido agregar mas de una construccion!");
        }
        System.out.println("Creando una PH en el lote de domicilio: " + primerLote.getDomicilio());
        byte numeroPisos = 5;
        Edificio primerPH = new PH(numeroPisos);
        try {
            primerLote.setConstruccion(primerPH);
        } catch (ErrorLote ex) {
            System.out.println("No permitido agregar mas de una construccion!");
        }
        primerCasa.demoler();
        System.out.println("Casa demolida");
         try {
            primerLote.setConstruccion(primerPH);
             System.out.println("PH agregado!");
        } catch (ErrorLote ex) {
            System.out.println("No permitido agregar mas de una construccion!");
        }
        
        
        
    }
    public static void ejercicioCinco(){
    }
    public static void ejercicioSeis(){
        System.out.println("Ejericio Opcional, en desarrollo...");
    }
    public static void ejercicioSiete(){
        System.out.println("Ejericio Opcional, en desarrollo...");

    }
    public static void ejercicioOcho(){
        System.out.println("Ejericio Opcional, en desarrollo...");

    }
    public static void serializar(Registro registro){
        try{
            FileOutputStream fs = new FileOutputStream("registro.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(registro);
            os.close();
            //deserializing
            FileInputStream fileIn = new FileInputStream("registro.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Registro registroRecuperado =(Registro) in.readObject();
            in.close();
            fileIn.close();
            registroRecuperado.emitirBoletos();
        }
        catch(FileNotFoundException exc){
            exc.getMessage();
        }
        catch (IOException exc){
            exc.getMessage();
        }
        catch(Exception exc){
            exc.getMessage();
        }
    }
    
    
    
}

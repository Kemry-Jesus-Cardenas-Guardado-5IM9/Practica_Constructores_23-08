/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Alumno
 */
public abstract class SistemasAbs {
    public void conectar(boolean conectado){
        if(conectado==true){
            System.out.println("Dispositivo conectado");
        }
        else
        if(conectado==false){
            System.out.println("Dispositivo desconectado");
        }
    }
    public void cargar(boolean cargado)
    {
        if(cargado==true){
            System.out.println("Dispositivo cargado");
        }
        else
        if(cargado==false){
            System.out.println("Favor de cargar");
        }
    }
    public void Aplicacion()
    {
        String app="youtube";
        System.out.println("La aplicacion que se esta utilizando es "+app);
        
    }
    public abstract void volumen();
    public abstract String red();

    
}

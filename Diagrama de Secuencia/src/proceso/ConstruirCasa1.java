/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso;
import datos.*;

/**
 *
 * @author Daniel Reguera Bazan
 */
public class ConstruirCasa1 {

  public static void main(String[] args) {
    Casa casa = new Casa(1); //casa con una habitacion
    Habitacion h = new Habitacion (15); //15 metros
    Puerta p = new Puerta (2.10, 1); //alto 2.10, ancho 1
    
    h.setPuerta(p);
    Ventana v=new Ventana(1.60, 1.20); //alto 1.60, ancho 1.20
    h.setVentana(v);
    
    casa.addHabitacion(h); //añadir habitación a la casa
    
    Habitacion hab[] = casa.getHabitaciones();
    System.out.println("Número de Habitaciones: "+hab.length);
  }
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Daniel Reguera Bazan
 */
public class Habitacion {
  Puerta puerta;
  Ventana ventana;
  double metros;

  public Habitacion(double metros) {
    this.metros = metros;
  }
  
  public void setPuerta (Puerta puerta){
    this.puerta=puerta;
  }
  
  public Ventana getVentana(){
    return ventana;
  }
  
  public void setVentana(Ventana ventana){
    this.ventana=ventana;
  }
  
  public double getMetros() {
    return metros;
  }

  public void setMetros(double metros) {
    this.metros = metros;
  }
  
}

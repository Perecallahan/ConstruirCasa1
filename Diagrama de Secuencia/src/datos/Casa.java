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
public class Casa {
  int numhabit; //num de habitaciones
  Habitacion [] habitaciones;
  int n; //para llenar el array
  
  public Casa (int numhabit){
    this.numhabit=numhabit;
    habitaciones = new Habitacion[numhabit];
    n=0;
  }
  
  public void addHabitacion (Habitacion h){
    habitaciones[n] = h;
    n++;
  }
  
  public Habitacion[] getHabitaciones(){
    return habitaciones;
  }
}

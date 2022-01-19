/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hydraulix;

/**
 *
 * @author PG
 */
public abstract class Weir {
  public double dischargeCoeff;
  public double head;
  public double flowRate;
  
  // constructor
  public Weir(double dischargeCoeff, double head){
    this.dischargeCoeff = dischargeCoeff;
    this.head = head;
  }
  
  public abstract void calcFlow();
  
  public double getFlow(){
    return this.flowRate;
  }
}

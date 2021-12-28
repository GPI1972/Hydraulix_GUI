/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hydraulix;

/**
 *
 * @author PG
 */
public class Orifice {
  public double diameter;
  public double dischargeCoeff;
  public double head;
  public double flowArea;
  public double velocity;
  public double discharge;
  
  // constructor
  public Orifice(double diameter, double dischargeCoeff, double head){
    this.diameter = diameter;
    this.dischargeCoeff = dischargeCoeff;
    this.head = head;
  }
  
  public void setFlowArea(){
    this.flowArea = 3.14 * this.diameter * this.diameter / 4;
  }
  
  public double getFlowArea(){
    return this.flowArea;
  }
  
  public void setVelocity(){
    this.velocity = java.lang.Math.sqrt(2 * 9.81 * this.head);
  }
  
  public double getVelocity(){
    return this.velocity;
  }
  
  public void setDischarge(){
    this.setFlowArea();
    this.setVelocity();
    this.discharge = this.dischargeCoeff * this.flowArea * this.velocity;
  }
  
  public double getDischarge(){
    return this.discharge;
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hydraulix;

/**
 *
 * @author PG
 */
public class BroadCrested extends Weir {
  private double width;
  
  // constructor
  public BroadCrested(double dischargeCoeff, double head, double width){
    super(dischargeCoeff, head);
    this.width = width;
  }
  
  @Override
  public void calcFlow(){
    this.flowRate = 1.705 * this.width * java.lang.Math.pow((this.head), (3.0/2.0));
  }
}

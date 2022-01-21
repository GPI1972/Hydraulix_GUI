/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hydraulix;

/**
 *
 * @author PG
 */
public class VNotch extends Weir {
  private double VNotchAngle;
  
  // constructor
  public VNotch(double dischargeCoeff, double head, double angle){
    super(dischargeCoeff, head);
    this.VNotchAngle = angle;
  }
  
  @Override
  public void calcFlow(){
    this.flowRate = (8.0/15.0) * this.dischargeCoeff * java.lang.Math.tan(this.VNotchAngle / 2.0) * java.lang.Math.sqrt(2 * 9.81) * java.lang.Math.pow((this.head), (5.0/2.0));
  }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hydraulix;

/**
 *
 * @author PG
 */
public class SuppWeir extends Weir{
  private double width;
  
  // constructor
  public SuppWeir(double dischargeCoeff, double head, double width){
    super(dischargeCoeff, head);
    this.width = width;
  }
  
  @Override
  public void calcFlow(){
    this.flowRate = (2/3) * this.dischargeCoeff * this.width * java.lang.Math.sqrt(2 * 9.81) * java.lang.Math.pow((this.head), (2/3));
  }
}

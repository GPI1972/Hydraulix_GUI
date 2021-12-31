/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hydraulix;

/**
 *
 * @author PG
 */
public class CircSection extends ChannelSection{
  private double radius;
  private double theta;
  
  public CircSection(double channelSlope, double roughCoeff, double radius, double flowDepth){
    super(channelSlope, roughCoeff);
    this.radius = radius;
    this.flowDepth = flowDepth;
    this.theta = java.lang.Math.acos((1 - (this.flowDepth / this.radius)));
  }
  
  @Override
  public void setWettedArea(){
    this.wettedArea = (java.lang.Math.pow(2 * this.radius, 2)/4) * (this.theta - (java.lang.Math.sin(2 * this.theta)/2));
  }
  
  @Override
  public void setWettedPerimeter(){
    this.wettedPerimeter = this.theta * (this.radius * 2);
  }
}

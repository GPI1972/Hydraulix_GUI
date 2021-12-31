/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hydraulix;

/**
 *
 * @author PG
 */
public class RecSection extends ChannelSection{
  private double width;
    
  public RecSection(double channelSlope, double roughCoeff, double width, double flowDepth){
    super(channelSlope, roughCoeff);
    this.width = width;
    this.flowDepth = flowDepth;
  }
  
  @Override
  public void setWettedArea(){
    this.wettedArea = this.width * this.flowDepth;
  }
  
  @Override
  public void setWettedPerimeter(){
    this.wettedPerimeter = this.width + (2 * this.flowDepth);
  }
}

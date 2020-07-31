
package question1;

public class Plane extends Vehicle{
  //  instance variables
  private String manufacturer;
  private int modelNumber;

  // constructor
  public Plane(String colour, int passengers, String manufacturer, int model){
    super(passengers, colour);
    this.manufacturer = manufacturer;
    this.modelNumber = model;
  }
  // methods
  public String toString(){
    return super.toString() + " " + manufacturer +
    " " + modelNumber;
  }
}
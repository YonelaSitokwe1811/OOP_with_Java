
package question1;

  public class Car extends Vehicle{
  // instance variables
  private int numDoors;

  // constructor
  public Car(String colour, int passengers, int doors){
    super(passengers, colour);
    this.numDoors = doors;
  }
  // methods
  public String toString(){
    return super.toString() + " " + numDoors +
    " doors";
  }
}  


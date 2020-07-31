
package question2;

public class Curry extends Item{
  private String curryType;

  // constructors
  public Curry(String menuItemNo, String size, String curryType){
    super(menuItemNo, size);
    this.curryType = curryType;
  }

  // methods
  public String toString(){
    return "Curry: " + getMenuItemNo() + ", " + getSize() + ", " + curryType;
  }
}
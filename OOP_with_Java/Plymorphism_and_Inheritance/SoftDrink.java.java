
package question2;
public class SoftDrink extends Item{
  private String flavour;
  private String container;

  
  public SoftDrink(String menuItemNo, String size, String flavour,
  String container){
    super(menuItemNo, size);
    this.flavour = flavour;
    this.container = container;
  }


  public String toString(){
    return "Soft Drink: " + getMenuItemNo() + ", " + getSize() + ", " + flavour + ", "
     + container;
  }
}



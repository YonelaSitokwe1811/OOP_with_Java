
package question2;

public class Pizza extends Item{
  private String base;
  private String extraCheese;
  private String extraGarlic;

  public Pizza(String menuItemNo, String size, String base,
  String extraCheese, String extraGarlic){
    super(menuItemNo, size);
    this.base = base;
    this.extraCheese = extraCheese;
    this.extraGarlic = extraGarlic;
  }

  
  public String toString(){
    return "Pizza: " + getMenuItemNo() + ", " + getSize() + ", " + base + ", "
     + extraCheese + ", " + extraGarlic;
  }


}

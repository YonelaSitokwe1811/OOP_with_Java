
package question2;


public class Item{
  private String menuItemNo;
  private String size;

  
  public Item(String menuItemNo, String size){
    this.menuItemNo = menuItemNo;
    this.size = size;
  }

 
  public void setMenuItemNo(String num){
    this.menuItemNo = num;
  }
  public void setSize(String size){
    this.size = size;
  }

  
  public String getMenuItemNo(){
    return menuItemNo;
  }
  public String getSize(){
    return size;
  }
  public String toString(){
    return menuItemNo + " " + size;
  }
}
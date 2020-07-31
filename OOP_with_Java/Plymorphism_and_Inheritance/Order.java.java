
package question2;

import java.util.ArrayList;
public class Order{
  private ArrayList<Item> order = new ArrayList<Item>();

  
  public Order(){}

  
  public void addItem(Item item){
    order.add(item);
  }
  public Item getItem(int index){
    return order.get(index);
  }

  public void clearOrder(){
    order.clear();
  }
  public boolean removeItem(String searchItemNo){
    for (int i = 0; i < order.size(); i++) {
      if (order.get(i).getMenuItemNo().equals(searchItemNo)) {
        order.remove(i);
        return true;
      }
    }
    return false;
  }
  public String toString(){
    String str = "";
    for (int i = 0; i < order.size(); i++) {
      str += order.get(i).toString() + "\n";
    }
    return str;
  }

    void addItem(Curry curry) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
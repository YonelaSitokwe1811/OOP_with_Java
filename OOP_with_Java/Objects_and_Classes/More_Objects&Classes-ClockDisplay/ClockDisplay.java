
package testclockdisplay;

public class ClockDisplay {
    // instance variables
  private CounterDisplay hours;
  private CounterDisplay minutes;

  // constructors
  public ClockDisplay (int pHours, int pMinutes){
    hours = new CounterDisplay(24);
    hours.setValue(pHours);
    minutes = new CounterDisplay(60);
    minutes.setValue(pMinutes);
  }

  // methods
  public void setTime(int pHours, int pMinutes){
    // set the display time
    hours.setValue(pHours);
    minutes.setValue(pMinutes);
  }

  public void tick(){
    if (minutes.getValue() < 59) {
      minutes.increment();
    } else{
      hours.increment();
      minutes.increment();
    }
  }

  public String getDisplayValue(){
    return hours.getDisplayValue() + ":" + minutes.getDisplayValue();
  }
}  


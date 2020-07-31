
package collactor;


public class TestCollactor {

    public static void main(String[] args) {
      
    
    System.out.println("Test 1");
    Collator collator = new Collator("");
    if (collator.label().equals("")) {
      System.out.println("pass");
    } else {
      System.out.println("Fail");
    }

    
    System.out.println("Test 2");
    collator = new Collator("");
    if (collator.label().equals("")
      && collator.numberOfReadings() == 0
      && collator.maximum() == 0
      && collator.minimum() == 0
      ) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }

   
    System.out.println("Test 3");
    collator = new Collator("");
    collator.label("hungry");
    if (collator.label().equals("hungr")) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }

  
    System.out.println("Test 4");
    collator = new Collator("");
    collator.label("prime");
    collator.recordReading(5);
    if (collator.label().equals("prime")
      && collator.numberOfReadings() == 1
      && collator.maximum() == 5
      && collator.minimum() == 5
      && collator.average() == 5.0
      ) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }

   
    System.out.println("Test 5");
    collator = new Collator("");
    collator.recordReading(1);
    if (collator.label().equals("")
      && collator.numberOfReadings() == 1
      && collator.maximum() == 1
      && collator.minimum() == 1
      && collator.average() == 1.0
      ) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }

    
    System.out.println("Test 6");
    collator = new Collator("");
    collator.recordReading(0);
    if (collator.label().equals("")
      && collator.numberOfReadings() == 1
      && collator.maximum() == 0
      && collator.minimum() == 0
      && collator.average() == 0.0
      ) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }

    
    System.out.println("Test 7");
    collator = new Collator("");
    collator.recordReading(-1);
    if (collator.label().equals("")
      && collator.numberOfReadings() == 1
      && collator.maximum() == -1
      && collator.minimum() == -1
      && collator.average() == -1.0
      ) {
      System.out.println("Pass");
    } else {
      System.out.println("Fail");
    }
    }
    
}

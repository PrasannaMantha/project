import java.util.*;
 
class TestDataGenerator{
  public static void main(String[] args) {
    int c;
    Random t = new Random();
    for (c = 0; c <= 100; c++) {
      System.out.println(t.nextInt(100));
    }
  }
}
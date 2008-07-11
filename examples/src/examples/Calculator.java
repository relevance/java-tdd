package examples;

public class Calculator {
  private int result;
  
  public int add(int n) {
    return result += n;
  }

  public int subtract(int n) {
    return result -= n;
  }

  public int reset() {
    result = 0;
    return 0;        
  }

  public int multiply(int n) {
    return result *= n;
  }

  public int divide(int n) {
    return result /= n;
  }
}

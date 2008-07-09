package demo.mock.solution;

public class PhoneNumber {
  String label;
  String digits;

  public PhoneNumber(String label, String digits){
    this.label = label;
    this.digits = digits;
  }

  public String getLabel(){
    return label;
  }

  public String getDigits(){
    return digits;
  }
}
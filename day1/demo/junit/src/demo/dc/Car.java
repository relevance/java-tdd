package demo.dc;

public class Car {
  int gallonsOfGas;

  public void addGas(int gallons){
    gallonsOfGas = gallons;
  }


  public boolean start(){
    if(gallonsOfGas > 0){
      return true;
    }
    else{
      return false;
    }

  }
}

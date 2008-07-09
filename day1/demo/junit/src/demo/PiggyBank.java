package demo;

import java.math.BigDecimal;

public class PiggyBank {

  BigDecimal total= new BigDecimal("0.00");

  public BigDecimal add(String addition){
    total = total.add(new BigDecimal(addition));
    return total;
  }

  public BigDecimal getTotal(){
    return total;
  }



  public static void main(String[] args){
    PiggyBank pb = new PiggyBank();

    for(int i = 0; i< 10; i++){
      pb.add("0.10");
      System.out.println();
    }

    System.out.println("Grand total is:" + pb.getTotal());
  }  



}
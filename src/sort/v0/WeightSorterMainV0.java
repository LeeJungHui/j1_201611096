package com.sd.sort.v0;

class WeightSorterMainV0{
  public static void main(String args[]){
    IntegerCompare ic = new IntegerCompare();
    StringCompare sc = new StringCompare();
    ic.compareI();
    System.out.println("----------------------------");
    sc.compareS();
  }
}
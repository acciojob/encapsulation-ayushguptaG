package com.driver;

public class Main {
  public static void main(String args[]){
       RWOnly obj= new RWOnly();

//        obj.name= "Ayush";
//        error- 'name' has private access in 'com.driver.RWOnly'

      obj.setName("Jaddu");
      System.out.println(obj.getName());
  }
}
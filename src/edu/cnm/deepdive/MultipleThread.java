package edu.cnm.deepdive;

public class MultipleThread {

  public static void main(String[] args) {
    Thread lazy = new LazyThread();//LazyThread is the instance type.
    lazy.start();
    Utility.processInput();
  }


}

package org.suyog.jbehave.example;

public class Calculator {

  private String result;

  public void divide(float number1, float number2) {
    if (number2 == 0) {
      result = "undefined";
    }
    else
      result = Float.toString(number1 / number2);
  }

  public String getResult() {
    return result;
  }

}

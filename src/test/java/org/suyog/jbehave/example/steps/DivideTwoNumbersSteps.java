 package org.suyog.jbehave.example.steps;  

 import org.jbehave.core.annotations.Given;  
 import org.jbehave.core.annotations.Named;  
 import org.jbehave.core.annotations.Then;  
 import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.suyog.jbehave.example.Calculator;  

 public class DivideTwoNumbersSteps {  

   private Calculator calculator;  

   @Given("a calculator")  
   public void givenACalculator() {  
     calculator = new Calculator();  
   }  

   @When("I divide $number1 by $number2")  
   public void whenIAddNumber1AndNumber2(@Named("number1")int number1, @Named("number2")int number2) {  
     calculator.divide(number1, number2);  
   }  

   @Then("the outcome should be $result")  
   public void thenTheOutcomeShould(@Named("result")String result) {  
     Assert.assertEquals(calculator.getResult(),result);;  
   }  
 }  